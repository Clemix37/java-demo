import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Display title and options
        System.out.println("Welcome to CyberWebDev tools, what do you need ?");
        System.out.println("1. Find the number game");
        System.out.println("2. FizzBuzz program");
        System.out.println("Option: ");
        // Get user's choice
        Scanner scanner = new Scanner(System.in);
        int optionSelected = Integer.parseInt(scanner.nextLine());
        // Based on user's choice, we call the correct class
        if (optionSelected == 1) FindNumber.play();
        else if(optionSelected == 2) FizzBuzz.play();
    }
}
