
import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// declaring variables
		int even = 0;
		int evenin;

		// Will have user input a number until 2 or greater
		do {

			System.out.print("Enter a number two or greater: ");
			evenin = scan.nextInt();

		} while (evenin < 2);

		// Closing my scanner
		scan.close();

		// Creating the loop to calculate even numbers from 2 until number entered
		for (int i = 2; i <= evenin; i += 2) {

			even += i;
		}

		System.out.println("The number eneterd is: " + evenin);
		System.out.println("This is the sum of all even integers from 2 to " + evenin + ": " + even);

	}
}