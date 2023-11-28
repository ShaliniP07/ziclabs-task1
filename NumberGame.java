import java.util.Scanner;
import java.util.Random;
public class NumberGame {
public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.startGame();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int score = 0;
        boolean PlayAgain = true;

        while (PlayAgain) {
            System.out.println("Welcome to the Number Game! It's all about guessing, Try to guess a number between 1 and 100.");
            int NumberToBeGuessed = random.nextInt(100) + 1;

            while (true) {
                System.out.print("Enter your guess: ");
                int GuessOfUser = scanner.nextInt();
                attempts++;

                if (GuessOfUser == NumberToBeGuessed) {
                    System.out.println("Congrats! You guessed the correct number!");
                    score++;
                    break;
                } else if (GuessOfUser > NumberToBeGuessed) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }

                if (attempts >= 10) {
                    System.out.println("Sorry, you've reached the maximum number of attempts! The correct number was " + NumberToBeGuessed + ".");
                    break;
                }
            }

            System.out.println("Your score is: " + score);
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next();
            PlayAgain = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}