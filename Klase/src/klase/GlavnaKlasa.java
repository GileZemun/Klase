package klase;

public class GlavnaKlasa {

	public static void main(String[] args) {

		Car automobil = new Car (); //instanca klase Car
		
		automobil.boja = "crvena";
		automobil.cena = 150000;
		automobil.kubikaza = 4.8;
		automobil.marka = "Ferrari";
		automobil.model = "F50";
		automobil.daljinskoZakljucavanje = true;
		
		System.out.println("Napravio sam auto marke " + automobil.marka );
		System.out.println("Model je " + automobil.model);
		System.out.println("Boja je " + automobil.boja);
		System.out.println("Koji kosta " + automobil.cena + " evra");
		System.out.println("Kubikaze " + automobil.kubikaza + "L");
		System.out.println("Daljinsko zakljucavanje " + automobil.daljinskoZakljucavanje);
		
		
		Car automobil2 = new Car ();
		
		automobil2.marka = "Atom";
		automobil2.model = "Ariel";
		
		System.out.println("Najbrzi auto je: " + automobil2.marka +  " "  +automobil2.model);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
