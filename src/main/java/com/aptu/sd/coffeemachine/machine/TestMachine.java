package com.aptu.sd.coffeemachine.machine;

/**
 * Created by karim on 6/5/14.
 */
public class TestMachine implements VendingMachine {
    @Override
    public long getDeposit() throws TestMachineException {
        throw new TestMachineException("This is test machine");
    }

    @Override
    public void deposit(long amount) throws NonPositiveDepositException, TestMachineException {
        throw new TestMachineException("This is test machine");
    }

    @Override
    public long cancel() throws TestMachineException {
        throw new TestMachineException("This is test machine");
    }

    @Override
    public void purchaseProduct(String productName) throws NoSuchProductException, DepositTooSmallException, TestMachineException {
        throw new TestMachineException("This is test machine");
    }

    @Override
    public long encash()  throws TestMachineException {
        throw new TestMachineException("This is test machine");
    }
}
