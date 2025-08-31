import java.util.Scanner;

public class FizzBuzz {
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FizzBuzz !");
        System.out.println("""
            This tiny program prints numbers from minimum to maximum.
            But if this number is multiple of 3, prints 'Fizz'.
            If the number is multiple of 5, prints 'Buzz'.
            If both, prints 'FizzBuzz'.
        """);
        System.out.println("Input the minimum :");
        int minimum = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the maximum :");
        int maximum = Integer.parseInt(scanner.nextLine());
        for (int i = minimum; i <= maximum; i++) {
            String answer = "";
            if(i%3==0) answer += "Fizz";
            if(i%5==0) answer += "Buzz";
            System.out.println(answer.isEmpty() ? i : answer);
        }
    }
}
