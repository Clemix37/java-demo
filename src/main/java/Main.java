import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to CyberWebDev tools, what do you need ?");
        System.out.println("1. Find the number game");
        System.out.println("2. FizzBuzz program");
        System.out.println("Option: ");
        Scanner scanner = new Scanner(System.in);
        int optionSelected = Integer.parseInt(scanner.nextLine());
        if (optionSelected == 1) FindNumber.play();
        else if(optionSelected == 2) FizzBuzz.play();
    }
}
