package torensVanHanoi;

public class Recursion {	
	static void recursiveHanoi(int aantalStenen, int vanPositie, int naarPositie) {
		if (aantalStenen == 1) {	
			VerplaatsBovenste.Verplaats(vanPositie, naarPositie);		
		} else {
			int anderePositieNr = (-1 * (vanPositie + naarPositie)) + 6; //was even puzzelen
			recursiveHanoi (aantalStenen - 1, vanPositie, anderePositieNr);
			VerplaatsBovenste.Verplaats(vanPositie, naarPositie);	
			recursiveHanoi (aantalStenen -1, anderePositieNr, naarPositie);
		}
	}
}
