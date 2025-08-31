import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    // Store the high and the low numbers
    public static final int low = 0;
    public static final int high = 100;

    public static void play() {
        // Create a secret code between high and low
        int secret = getSecretCode();
        Scanner scanner = new Scanner(System.in);
        int userInput = low-1;
        System.out.println("Find the number between " + low + " and " + high);
        // While user's guess is not the secret number
        while (userInput != secret) {
            // Get user's guess
            System.out.println("Your guess : ");
            String userAnswer = scanner.nextLine();
            userInput = Integer.parseInt(userAnswer);
            // Check for less or greater
            if (userInput > secret){
                System.out.println("Less");
            }
            else if (userInput < secret) {
                System.out.println("Greater");
            }
        }
        // When user's guess is correct, we break out of loop and display a message
        System.out.println("You won !! The secret was indeed " + secret);
        String answer = "";
        // Ask for replaying
        while(!answer.equals("y") && !answer.equals("n") && !answer.equals("yes") && !answer.equals("no")){
            System.out.println("Wanna play again ? (y/n)");
            answer = scanner.nextLine().toLowerCase();
        }
        // If yes, play again
        if (answer.equals("y") || answer.equals("yes")) play();
    }

    public static int getSecretCode(){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }
}
