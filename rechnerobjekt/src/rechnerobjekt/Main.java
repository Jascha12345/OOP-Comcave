import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner derScanner = new Scanner(System.in);
		
		// erstelle Objekt derRechner
	 Rechner derRechner = new Rechner();
	 
	 System.out.println("MeinRechner");
	 System.out.println();
	 
	 	while(true) {
	 		System.out.println("welche rechenoperation möchtest du ausführen?");
	 		System.out.println(" + Multiplikation");
	 		System.out.println(" - Subtraktion");
	 		System.out.println(" * Multiplikation");
	 		System.out.println(" / Division");
	 		System.out.println(" % Modulo");
	 		
	 		System.out.print("Operation:");
	 		char operator = derScanner.next().charAt(0);
	 		System.out.print("Zahl 1: ");
	 		double eingabe1 = derScanner.nextDouble();
	 		System.out.print("Zahl 2: ");
	 		double eingabe2 = derScanner.nextDouble();
	 		
	 		switch(operator) {
	 		//+
	 		case '+': System.out.println(derRechner.addiere(eingabe1, eingabe2));
	 			break;
	 		//-
	 		case '-': System.out.println(derRechner.subtrahieren(eingabe1, eingabe2));
	 			break;
	 		//*
	 		case '*': System.out.println(derRechner.multiplizieren(eingabe1, eingabe2));
	 			break;
	 		///
	 		case '/': System.out.println(derRechner.dividiere(eingabe1, eingabe2));
	 			break;
	 		//%
	 		case'%': System.out.println(derRechner.modulo(eingabe1, eingabe2));
	 			break;
	 		
	 		//Falsches Zeichen eingeben
	 			default:
	 			break;
	 		
	 		
	 		
	 		}
	 		
		//Dauerschleife 
	 		System.out.println(derRechner.addiere(3, 5));
	 		break;
	 	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
}