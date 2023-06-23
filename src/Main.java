/*ask user a questin -> output three choices -> collect user input
only one answer is correct - > provide appropiate message
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {




        System.out.println("Do you know which of the answers bellow is a software testing method?");
        System.out.println("A) yellow box");
        System.out.println("B) boxing day");
        System.out.println("C) black box");
        String correctAnswer = "A)";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please text the right answer A) B) or C) . Please keep the answer format : capsletter + ) with no space between");
        String answer = userInput.nextLine();
        System.out.println("Answer is " + answer);
        if (answer.equals(correctAnswer)) {
            System.out.println("You are right!");

        } else {
            System.out.println("Please try again, answer is wrong or you didn't respect the given format for the answer");
        }







    }
}