package com.aptu.sd.coffeemachine.machine;

/**
 * Created by IntelliJ IDEA.
 * User: andrey
 * Date: 5/22/12, 11:38 PM
 */
public interface VendingMachine {

    long getDeposit() throws TestMachineException;

    void deposit(long amount) throws NonPositiveDepositException, TestMachineException;

    long cancel() throws TestMachineException;

    void purchaseProduct(String productName) throws NoSuchProductException, DepositTooSmallException, TestMachineException;

    long encash() throws TestMachineException;
}