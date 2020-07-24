
public class Box {

	public static void main(String[] args) {

		Box myBox = new Box();

		myBox.size = 5;

		myBox.printBox();
	}

	public void printBox() {

		int size = 0;
		

		// creates loop for rows
		for (r = 0; r < size; r++) {

			System.out.print("*");

		}

		// create loop for columns
		for (c = 0; c < size; c++) {

			System.out.print("*");
		}

	}

}
