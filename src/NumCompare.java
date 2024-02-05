import java.util.Objects;
import java.util.Scanner;
public class NumCompare {
    public static void main (String[] args){
        /*
A program that takes two numbers as inputs from the user and compares them.
It indicates if they are equal or if they are not indicates the one that is less.
This program should be bullet-proofed. If either input is not a number, the program should indicate that the user should try again and terminate.
         */
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter the first number: ");
        num1 = in.nextInt();

//        String type = (Object)num1);

        System.out.println("Enter the second number: ");
        num2 = in.nextInt();
        System.out.println(in.hasNextInt());

        if (!in.hasNextInt()) {
            System.out.println("Please Try Again: Either Number 1" + num1 + " is not a number/whole number or its Number 2: " + num2);
        }else {
            if (num1 < num2) {
                System.out.println("Number: " + num1 + " is less than Number: " + num2);
            }else if (num1 > num2) {
                System.out.println("Number: " + num1 + " is greater than Number: " + num2);
            }else {
                System.out.println("Number: " + num1 + " is equal to Number: " + num2);
            }
        }
    }
}
