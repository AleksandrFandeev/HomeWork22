package org.itstep.command;

import java.util.Comparator;

import static org.itstep.command.Command.name;

public class InputCommand implements Command {
    private String name;

    public InputCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute(String... args) {

    }

    @Override
    public String toString() {
        return "InputCommand{" +
                "name='" + name + '\'' +
                '}';
    }

    //    @Override
//    public int compareTo(Object that) {
//        if (that instanceof Command) {
//            Command obj = (Command) that;
//            return name -obj.name;
//        }
//        return 0;
//    }
//    @Override
//    public int compare(Object o1, Object o2) {
//        if (o1 instanceof Command && o2 instanceof Command) {
//            Command c1 = (Command) o1;
//            Command c2 = (Command) o2;
//            return c2.getName() - c1.getName();
//        }
//        return 0;
//    }
}

