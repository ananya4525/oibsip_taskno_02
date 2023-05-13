

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int range = 100;
        int secretNumber = rand.nextInt(range) + 2;
        int max_Attem = 5;
        int score = 0;
        char ch;
        int guess;
        do {
            System.out.println("Welcome to Guess the Number!");
            System.out.println("Choose a number between 1 and " + range);
            System.out.println("You have " + max_Attem + " attempts to guess the number.");
            System.out.println("Let's Start!");

            for (int i = 1; i <= max_Attem; i++) {
                System.out.print("Attempt " + i + ": ");
                guess = sc.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + i + " attempts!");
                    score++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (i == max_Attem) {
                    System.out.println("Sorry, you have run out of attempts. The secret number was " + secretNumber);
                }
            }

            System.out.println("Your score is " + score);
            secretNumber = rand.nextInt(range) + 2;
            System.out.println("Do you want to continue(Y/N):");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
        System.out.println("Thank You 😊😊!");
        sc.close();
    }
}
