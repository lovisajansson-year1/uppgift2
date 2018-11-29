package uppgift2;
import java.util.Scanner;
public class Uppgift2b{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int nmbr1 = 1; // för att kunna köra while loop
		int nmbr2;
	
		while (nmbr1!=0) { 
			System.out.print("\n" + "tal1 :");
			nmbr1 = stdIn.nextInt();
	
			if (nmbr1==0) {
				System.out.print("tack");	//går ej in i else satsen som kommer efteråt &
											//	programmet avslutas eftersom tal1 nu är 0.
			}else { //om tal1 inte är lika med 0
					System.out.print("tal2 :"); //ber om tal 2
					nmbr2 = stdIn.nextInt();
					
				if (nmbr1 > nmbr2) {
					System.out.print(nmbr1 + " är större än " + nmbr2);
				}else if (nmbr2 > nmbr1) {
					System.out.print(nmbr2 + " är större än " + nmbr1);
				}else if (nmbr1 == nmbr2) {
					System.out.print("talen är lika");		
				}
			} 	
		}	
		stdIn.close();
	}
}
	
