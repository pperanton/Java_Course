package chapter3;

import java.util.Scanner;

/*
IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        Scanner scanner = new Scanner(System.in);
        int quota = 10;

        //Get the values we don't
        System.out.println("Enter the number of sales you made this week:");
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take
        if (sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int salesShort = quota-sales;
            System.out.println("You did not make your quota. You were "+ salesShort + " sales short");

        }
        //Output

    }
}
