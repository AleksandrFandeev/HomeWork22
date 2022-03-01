package org.itstep.command;

public class ExitCommand implements Command {
    private String name = "exit";

    public String getName() {
        return name;
    }

    @Override
    public void execute(String... args) {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "ExitCommand{" +
                "name='" + name + '\'' +
                '}';
    }
}
