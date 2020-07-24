
import java.util.Random;
import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {

		// Declaring variables
		int ageGuess;

		Random gen = new Random();
		Scanner scan = new Scanner(System.in);
		int age = gen.nextInt(100);
		System.out.print("Guess Age: ");
		ageGuess = scan.nextInt();

		do {
			System.out.print("Wrong guess age again: ");

			ageGuess = scan.nextInt();

		} while (age != ageGuess);

		scan.close();

		System.out.println("You Guessed Correct!");
	}

}