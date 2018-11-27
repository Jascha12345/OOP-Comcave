import java.util.Scanner;
public class Raten {
	public static void main(String[] args) {
		Scanner derScanner = new Scanner(System.in);

		
		System.out.print("Eingabe zu suchende Zahl: ");
		
		int z1 = derScanner.nextInt();
		
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("sehr viel text ");
		System.out.println("Ihr Tipp?");
		
		boolean weiter = true;
		
		for (int i = 1; i <=5 && weiter == true;i++) {
			
		int z2 = derScanner.nextInt();
		
		if ( z2 == z1 ) {System.out.println("Sie haben gewonnen");weiter = false;}
		
		
		else if (z2>z1) {System.out.println("Die Zahl ist zu groﬂ");}
		
		else {System.out.println("Die Zahl ist zu klein");}
		
		
		
		 if (Math.abs(z1 - z2) <= 5 && weiter == true) {System.out.println("Knapp!");}
		 
		}
		
		if (weiter == true) {System.out.println("Sie haben keine Versuche mehr");}// == true kann man weglassen
		
		
		 
		
	
		
		
		
		   
		   
		
		
		
		
}
		
}
		

		
		
		
		
		
		
		

	

