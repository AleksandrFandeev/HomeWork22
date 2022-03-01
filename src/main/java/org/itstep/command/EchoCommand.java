package org.itstep.command;

public class  EchoCommand   implements Command{

    private  String name="echo";

    public void execute(String... args) {
        System.out.println("Hello World");

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
//"EchoCommand{" +
//        "name='" + name + '\'' +
//        '}'
//    @Override
//    public int compareTo(Object that) {
//        if (that instanceof Command) {
//            Command obj = (Command) that;
//            return name - obj.name;
//        }
//        return 0;
//    }