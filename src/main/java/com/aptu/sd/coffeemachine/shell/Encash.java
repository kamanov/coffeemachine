package com.aptu.sd.coffeemachine.shell;

import com.aptu.sd.coffeemachine.machine.TestMachineException;
import com.aptu.sd.coffeemachine.machine.VendingMachine;

/**
 * Created by karim on 6/5/14.
 */
public class Encash implements Command {
    @Override
    public void execute(String[] args, VendingMachine machine) throws CommandParseException {
        try {
            long amount = machine.encash();
            System.out.println("Encashed: " + amount);
        } catch (TestMachineException e) {
            System.out.println(e.getMessage());
        }
    }
}
