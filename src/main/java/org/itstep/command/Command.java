package org.itstep.command;

public interface Command  {
     String name = null;
     void execute(String... args);

     public String getName();


}
