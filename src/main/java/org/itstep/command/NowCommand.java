package org.itstep.command;

public class NowCommand implements Command {
    private String name = "now";

    @Override
    public void execute(String... args) {
        System.out.println(System.currentTimeMillis());

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NowCommand{" +
                "name='" + name + '\'' +
                '}';
    }
}
