package uppgift2;
import java.util.Scanner;
public class Uppgift2b{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int tal1 = 1; // för att kunna köra while loop
		int tal2;
	
		while (tal1!=0) { 
			System.out.print("\n" + "tal1 :");
			tal1 = stdIn.nextInt();
	
			if (tal1==0) {
				System.out.print("tack");	//hoppar över else satsen som kommer efteråt = programmet avslutas
			}else {
					System.out.print("tal2 :");
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
 }
}
	
