package eu.bmoll.daw.programming;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NosenseApp {
    private static final String EXIT_KEY = "9"

    public static void main(String[] args) {
        //boolean aux = StringUtils.equals("a", "A");
       // System.out.println("hola mundo:" + aux);
       // Scanner in = new Scanner(System.in);
        ConsoleUtils consoleUtils = new ConsoleUtils();
        boolean isExit = false;
        while (isExit){
            //System.out.println("Introduce una option: ");
           // String s = in.nextLine();
            String s = consoleUtils.getUserInput();
            System.out.println("You entered string " + s);
            isExit = StringUtils.equals(s, "EXIT_KEY")
        }


        System.out.println("-END-");
    }

}
