import java.util.InputMismatchException;
import java.util.Scanner;
public class NumCompare {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int num1;
        int num2;

        try {
            System.out.println("Enter the first number: ");
            num1 = in.nextInt();

            System.out.println("Enter the second number: ");
            num2 = in.nextInt();

            if (num1 < num2) {
                System.out.println("Number: " + num1 + " is less than Number: " + num2);
            } else if (num1 > num2) {
                System.out.println("Number: " + num1 + " is greater than Number: " + num2);
            } else {
                System.out.println("Number: " + num1 + " is equal to Number: " + num2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Something is Wrong Please Terminate and Try Again.");

        }
    }
}
