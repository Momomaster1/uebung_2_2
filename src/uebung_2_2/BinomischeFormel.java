package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		
		double a=8;
		double b=3;
		
		double Kurzform = Math.pow((a + b), 2);
		double Langform = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
		
		System.out.println("Kurz = " + Kurzform);
		System.out.println("Lang = " + Langform);
		// TODO Auto-generated method stub

	}

}
