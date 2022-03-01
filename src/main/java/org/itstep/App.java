package org.itstep;
import org.itstep.command.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.String.*;
import static java.lang.String.valueOf;

public class App {
    public static void main(String[] args) {
        // Пишите ваш код здесь
        String command1;
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print(">>> ");
        command1 = scanner.next();
        Command[] commands = new Command[5];
        commands[0] = new InputCommand(command1);
        commands[4] = new EchoCommand();
        commands[1] = new NowCommand();
        commands[2] = new HelpCommand();
        commands[3] = new ExitCommand();
        int k = 0;

            for (i = 1; i < commands.length; i++) {

                if (commands[0].getName().equals(commands[i].getName())) {
                    commands[i].execute();
                    k++;
                }
            }
            if (k == 0) {
                System.err.println("Ввели некорректные данные ");
            }

    }
}

