/**
 * @author Vicky Kang
 * @since 21 October 2025
 * Description: This program lets the user choose between two mini games:
 * 1) Number Guessing Game
 * 2) Rock-Paper-Scissors
 */

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

    /**
     * Runs the game center and allows the user to choose a game to play.
     * @param args command-line arguments
     * @return void
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Game Center!");
        System.out.println("Choose a game to play:");
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Rock-Paper-Scissors");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = input.nextInt();

        if (choice == 1) {
            playNumberGuessingGame(input);
        } else if (choice == 2) {
            playRockPaperScissors(input);
        } else {
            System.out.println("Invalid choice. Goodbye!");
        }

        input.close();
    }

    /**
     * Plays the Number Guessing Game where the user has 5 tries to guess a random number.
     * @param scan Scanner object used to read user input
     * @return void
     */                

    public static void playNumberGuessingGame(Scanner input) {
        Random rand = new Random();
        int max = 100;
        int min = 1;
        int tries = 5;
        int target = rand.nextInt(max - min + 1) + min;
        boolean guessCorrect = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

        while (!guessCorrect && tries > 0) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess < min || guess > max) {
                tries--;
                System.out.println("Only guess between " + min + " and " + max + "!");
                System.out.println("Tries left: " + tries);
            } else if (guess < target) {
                tries--;
                System.out.println("The number is greater than " + guess + ". Tries left: " + tries);
            } else if (guess > target) {
                tries--;
                System.out.println("The number is less than " + guess + ". Tries left: " + tries);
            } else {
                System.out.println("YOU DID IT!!! The number was: " + guess);
                guessCorrect = true;
            }
        }

        if (!guessCorrect) {
            System.out.println("You ran out of tries. The number was " + target + ".");
        }
    }

    /**
     * Plays the Rock-Paper-Scissors game where the user plays against the computer until they decide to stop.
     * @param input Scanner object used to read user input
     * @return void
     */
    
     public static void playRockPaperScissors(Scanner input) {
        Random rnd = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (playAgain) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Paper");
            System.out.println("2. Scissors");
            System.out.println("3. Rock");
            System.out.print("Your choice: ");
            int userChoice = input.nextInt();

            int computerChoice = rnd.nextInt(3) + 1;
            System.out.println("Computer chose: " + convertChoice(computerChoice));

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            char answer = input.next().toUpperCase().charAt(0);
            playAgain = (answer == 'Y');
        }

        System.out.println("Goodbye!");
    }

    /**
     * Converts an integer choice to its corresponding Rock-Paper-Scissors move name.
     * @param choice integer representing a move (1=Paper, 2=Scissors, 3=Rock)
     * @return String name of the move ("Paper", "Scissors", "Rock") or "Invalid" if input is out of range
     */

    public static String convertChoice(int choice) {
        switch (choice) {
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            case 3:
                return "Rock";
            default:
                return "Invalid";
        }
    }
}
