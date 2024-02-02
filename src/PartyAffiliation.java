import java.util.Scanner;

public class PartyAffiliation {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What is your party affiliation (Democrat = D, Republican = R, Independent = I): ");
        String userInput = in.next();
        if (userInput.equals("D")){
            System.out.println("You get a Democratic Donkey.");
        } else if (userInput.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (userInput.equals("I")) {
            System.out.println("You get a Independent Person.");
        }else {
            System.out.println("Other");
        }

    }
}
