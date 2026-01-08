import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;

        int guess;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("🎯 NUMBER GUESSING GAME 🎯");
        System.out.println("Guess a number between " + min + " and " + max);
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("🎉 Congratulations! You guessed the number correctly.");
                System.out.println("Attempts taken: " + attempts);
                break;
            } else if (guess > randomNumber) {
                System.out.println("📉 Too high! Try a smaller number.");
            } else {
                System.out.println("📈 Too low! Try a bigger number.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
            System.out.println();
        }

        if (attempts == maxAttempts) {
            System.out.println("❌ You've used all attempts!");
            System.out.println("The correct number was: " + randomNumber);
        }

        sc.close();
    }
}
