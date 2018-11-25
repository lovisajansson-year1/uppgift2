package uppgift2;
import java.util.Scanner;
public class Uppgift2a {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		
		int tal1;
		int tal2;
		
		System.out.print("tal 1:");
		tal1 = stdIn.nextInt();
		
		System.out.print("tal 2:");
		tal2 = stdIn.nextInt();
		
			if (tal1 > tal2) {
				System.out.print(tal1 + " är större än " + tal2);
		
			}else if (tal2 > tal1) {
				System.out.print(tal2 + " är större än " + tal1);
			}else if (tal1 == tal2) {
				System.out.print("talen är lika");
			}
		}
	}
