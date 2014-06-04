package com.aptu.sd.coffeemachine.simpleapp;

import com.aptu.sd.coffeemachine.machine.TestMachine;
import com.aptu.sd.coffeemachine.shell.Shell;
import com.aptu.sd.coffeemachine.machine.SimpleMachine;
import com.aptu.sd.coffeemachine.machine.Product;
import com.aptu.sd.coffeemachine.shell.*;

import java.util.Arrays;
import java.util.List;

/**
 * Simple application
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SimpleMachine machine = new SimpleMachine();
        TestMachine testMachine = new TestMachine();
        List<Product> products = Arrays.asList(new Product("latte", 6, 10), new Product("capuccino", 4, 15));
        machine.setProducts(products);

        Shell shell = new Shell();
        Switch switchCmd = new Switch();
        switchCmd.setShell(shell);
        List<Command> commands = Arrays.asList(new Insert(), new Select(), new Cancel(), new Exit(), new Encash(), switchCmd);
        shell.setCommands(commands);
        shell.setMachine(machine);
        shell.setTestMachine(testMachine);
        shell.run();
    }
}
