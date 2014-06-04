package com.aptu.sd.coffeemachine.machine;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: andrey
 * Date: 5/22/12, 11:13 PM
 */
public class SimpleMachine implements VendingMachine {
    private Map<String, Product> productMap = new HashMap<String, Product>();
    private long deposit;
    private long storage;

    public long getDeposit()  throws TestMachineException {
        return deposit;
    }

    public void setProducts(List<Product> products) {
        for (Product product : products) {
            productMap.put(product.getName(), product);
        }
    }

    public void deposit(long amount) throws NonPositiveDepositException, TestMachineException {
        if (amount <= 0) {
            throw new NonPositiveDepositException(amount + ": deposit must be positive");
        }
        this.deposit += amount;
    }


    public long cancel() throws TestMachineException {
        long amount = deposit;
        deposit = 0;
        return amount;
    }

    public void purchaseProduct(String productName) throws NoSuchProductException, DepositTooSmallException, TestMachineException {
        Product product = productMap.get(productName);
        if (product == null) {
            throw new NoSuchProductException("Product " + productName + " is not available");
        }
        if (deposit < product.getPrice()) {
            throw new DepositTooSmallException("Deposit is not enough");
        }
        deposit -= product.getPrice();
        storage += product.getPrice();
        product.setCount(product.getCount() - 1);
    }

    public long encash() throws TestMachineException {
        long t = storage;
        storage = 0;
        return t;
    }
}