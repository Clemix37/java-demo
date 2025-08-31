import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static final int low = 0;
    public static final int high = 100;

    public static void play(){
        int secret = getSecretCode();
        Scanner scanner = new Scanner(System.in);
        int userInput = low-1;
        System.out.println("Find the number between " + low + " and " + high);
        while (userInput != secret) {
            System.out.println("Your guess : ");
            String userAnswer = scanner.nextLine();
            userInput = Integer.parseInt(userAnswer);
            if (userInput > secret){
                System.out.println("Less");
            }
            else if (userInput < secret) {
                System.out.println("Greater");
            }
        }
        System.out.println("You won !! The secret was indeed " + secret);
        String answer = "";
        while(!answer.equals("y") && !answer.equals("n") && !answer.equals("yes") && !answer.equals("no")){
            System.out.println("Wanna play again ? (y/n)");
            answer = scanner.nextLine().toLowerCase();
        }
        if (answer.equals("y") || answer.equals("yes")) play();
    }

    public static int getSecretCode(){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }
}
