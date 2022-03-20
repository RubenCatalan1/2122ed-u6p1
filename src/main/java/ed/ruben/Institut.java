package ed.ruben;

public class Institut {

	private static final int ANY = 2021;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String COGNOM_ALUMNE = "Catalán";
	private static final String NOM_ALUMNE = "Ruben";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognoms = COGNOM_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		System.out.println(p.toString());

	}

}
