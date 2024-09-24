package JAVA_PROGRAMMING;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int min = 1;
		int max = 10;
		int maxAttempts = 10;
		int score = 0;
		boolean playAgain;
		do{
			int randomNumber = random.nextInt(max - min + 1) + min;
			int attempts = 0;
			boolean correctGuess = false;
			System.out.println("Guess the number between " + min + " and " + max + ":");
			while (attempts < maxAttempts && !correctGuess) {
				System.out.print("Enter your guess: ");
				int guess = scanner.nextInt();
				attempts++;
				if (guess == randomNumber) {
					System.out.println("Congratulations! You guessed the correct number.");
					correctGuess = true;
					score += (maxAttempts - attempts + 1); 
				} else if (guess < randomNumber) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("Too high! Try again.");
				}
			}
			if (!correctGuess) {
				System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber);
			}
			System.out.println("Your score is: " + score);
			System.out.print("Do you want to play again? (yes/no): ");
			String response = scanner.next();
			playAgain = response.equalsIgnoreCase("yes");
		} while (playAgain);
		System.out.println("Thank you for playing! Your final score is: " + score);
		scanner.close();
	}
}

