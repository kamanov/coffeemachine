package com.aptu.sd.coffeemachine.shell;

import com.aptu.sd.coffeemachine.machine.VendingMachine;

/**
 * Created by karim on 6/5/14.
 */
public class Switch implements Command {
    private Shell shell;

    public void setShell(Shell shell) {
        this.shell = shell;
    }

    @Override
    public void execute(String[] args, VendingMachine machine) throws CommandParseException {
        shell.switchMachine();
        System.out.println("Machine switched");
    }
}
