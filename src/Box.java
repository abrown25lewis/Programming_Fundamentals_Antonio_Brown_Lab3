
public class Box {
	
	public int size = 0;

	public static void main(String[] args) {

		Box myBox = new Box();

		myBox.size = 5;

		myBox.printBox();
	}

	public void printBox() {

		int r,c;
		

		// creates loop for rows
		for (r = 0; r < size; r++) {

				// create loop for columns
				for (c = 0; c < size; c++) {

					System.out.print("*");
				}

				System.out.println("");
		}

	}
}