package uppgift2;
import java.util.Scanner;
public class Uppgift2a {

	public static void main(String[] args) {
		
		//läsa in 2 tal, skriv ut största, om lika ska det skrivas ut
		Scanner stdIn= new Scanner(System.in);
		
		int nmbr1;
		int nmbr2;
		
		System.out.print("tal 1:");
		nmbr1 = stdIn.nextInt(); //läser in första talet
		
		System.out.print("tal 2:");
		nmbr2 = stdIn.nextInt(); //läser in andra talet
		
			if (nmbr1 > nmbr2) {
				System.out.print(nmbr1 + " är större än " + nmbr2);
		
			}else if (nmbr2 > nmbr1) {
				System.out.print(nmbr2 + " är större än " + nmbr1);
			}else if (nmbr1 == nmbr2) {
				System.out.print("talen är lika");
			}
		
		stdIn.close();	
		}
	}
