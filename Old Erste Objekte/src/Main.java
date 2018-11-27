
public class Main {

	public static void main(String[] args) {
		//Scanner derScanner = new Scanner(System.in);
		Auto Auto1 = new Auto();
		Auto Auto2 = new Auto();
		Auto Auto3 = new Auto();
		
		Auto1.marke = "Audi";
		Auto1.modell = "A6";
		Auto2.marke = "Mercedes";
		Auto2.modell = "C-Klasse";
		Auto3.marke = "BMW";
		Auto3.modell = "3er";
		
		Auto1.serienNummer = "734jsdfmd93";
		
		System.out.println(Auto1.marke + " " + Auto1.modell);
		System.out.println(Auto2.marke + " " + Auto2.modell);
		System.out.println(Auto3.marke + " " + Auto3.modell);
		
		
	}

}
