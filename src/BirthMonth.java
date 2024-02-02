import java.util.Scanner;

public class BirthMonth {
    public static void main (String[] args) {
        /*
        A program that asks the user to enter their birth month (integer 1 – 12 inclusive). If the user enters a value in range, the program echoes the input (“Your birth month is: N”) If the value is not in the range it outputs an error msg (“You entered an incorrect month value: N”).   Here N should be the value they entered.

        Test runs:   (insert the output widow copies here for the test runs)

        - valid input in range 1 - 12

        - invalid input out of range
        */
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month in range 1-12: ");

        int birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12){
            System.out.println("Your birth month is: " + birthMonth);
        }
        else{
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
