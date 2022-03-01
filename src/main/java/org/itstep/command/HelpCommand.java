package org.itstep.command;

import com.sun.java.accessibility.util.EventID;

public class HelpCommand implements Command{
    private String name ="help";
    @Override
    public void execute(String... args) {
        System.out.println("Help executed");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HelpCommand{" +
                "name='" + name + '\'' +
                '}';
    }
}

