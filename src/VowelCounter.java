import java.util.Scanner;


public class VowelCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// declaring variables
		
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int other = 0;
		
		System.out.print("Enter String: ");
		String vc = scan.nextLine();
		
		for(int x = 0; x < vc.length(); x++) {
		
			
		char ct = vc.charAt(x);
			
		if('a' == ct) {
			 a++;
		}
			
		else if(ct == 'e') {
			e++;
		}	
		else if(ct == 'i') {
			i++;
		}
			
		else if(ct == 'o') {
			o++;
		}
		
		else if(ct == 'u') {
			u++;
		}
			
		else other++;
		}
		
		scan.close();
		
		System.out.println("a: " + a); 
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		System.out.println("other: " + other);

	}


}
