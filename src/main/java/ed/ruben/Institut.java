package ed.ruben;

public class Institut {

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = "Ruben";
		p.cognoms = "Catalán";
		p.cicleFormatiu = "1º DAW";
		p.any = 2021;
		
		System.out.println(p.toString());

	}

}
