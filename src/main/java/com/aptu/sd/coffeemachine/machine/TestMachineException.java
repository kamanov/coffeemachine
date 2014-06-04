package com.aptu.sd.coffeemachine.machine;

/**
 * Created by karim on 6/5/14.
 */
public class TestMachineException extends Exception {

    public TestMachineException() {
    }

    public TestMachineException(String s) {
        super(s);
    }

    public TestMachineException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public TestMachineException(Throwable throwable) {
        super(throwable);
    }
}
