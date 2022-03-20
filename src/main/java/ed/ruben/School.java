package ed.ruben;

public class School {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nom = "Ruben";
		p.cognoms = "Catalán";
		p.cicleFormatiu = "1º DAW";
		p.any = 2021;
		
		System.out.println(p.toString());

	}

}
