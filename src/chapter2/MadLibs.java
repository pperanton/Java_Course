package chapter2;

import java.util.Scanner;

public class MadLibs {



    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        //1. Ask user season on the year
        System.out.println("Enter a season of the year:");
        String season = scanner.next();

        //2. Ask user whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        //3. Ask user adjective
        System.out.println("Enter an adjective:");
        String adj = scanner.next();

        scanner.close();

        //4. Return full sentence
        System.out.println("On a "+ adj +" "+ season +" day, I drink a minimun of "+ number +" cups of coffee.");

        System.out.println("On a " + adj + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
