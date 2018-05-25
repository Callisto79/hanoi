package torensVanHanoi;

public class Hanoi {
	static final int MAX_HOOGTE_HANOI_TOREN = 20;
	public static void main(String[] args) {		
		if (args.length != 3) {	
			System.out.println("Niet 3 argumenten" );	
			//TODO: ook nog checken of args intger zijn
		} else {
		//	int aantalStenen  = Integer.parseInt(args[0]);
		//	int vanPositieNr  = Integer.parseInt(args[1]);
		//	int naarPositieNr = Integer.parseInt(args[2]);	
			int aantalStenen  = 2;
			int vanPositieNr  = 1;
			int naarPositieNr = 2;
			
			if ((aantalStenen <= MAX_HOOGTE_HANOI_TOREN) && (aantalStenen > 0) && (vanPositieNr > 0 ) && (vanPositieNr < 4) && (naarPositieNr > 0 ) && (naarPositieNr < 4))
			{
				System.out.println("We gaan " + aantalStenen + " stenen verplaatsen van positie " + vanPositieNr + " naar positie " + naarPositieNr);
				Recursion.recursiveHanoi(aantalStenen, vanPositieNr, naarPositieNr);
			}	
			else
			{
				System.out.println("input error");
			}
			
		}		
	}	
}
