package klase;

public class GlavnaKlasa {

	public static void main(String[] args) {

	    /*Car automobil = new Car (); //instanca klase Car
		
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
		
		
		Person osoba = new Person();

		osoba.ime = "Jovan";	
		osoba.prezime = "Jovanovic";

	System.out.println("Ime osobe je " + osoba.ime + " " + osoba.prezime);

	Car car = new Car();

		car.marka = "fiat";

	osoba.automobil = car;

	System.out.println("Ova osoba vozi automobil marke " + osoba.automobil.marka);*/
		
		/* Person p = new Person (); //konstruktor metoda
		Person p1 = new Person ("Marka","Markovica", 1987);
		
		String ime = "Zorana";
		String prezime = "Zoranica";
		String kilaza = "stokilasa";
		
		
		p.ime = "Zike";
		
		p.pozdravSvete("Zoran");
		
		String imeOsobe = p.ime;
		
		p.pozdrav(p1.ime,p1.prezime)
		
		Alat tool = new Alat();
		
		tool.pozdrav();		
		tool.pozdrav("Zorana");		
		tool.pozdrav("Mihajlovic");
		
		String i = "Pera";
		String p = "Detlic";
		int g = 15;
		
		String name = tool.imeIprezime(i,p);
			System.out.println(name);
		
		String brojGodina = tool.godine(g);
			System.out.println(brojGodina);
			
		int prviBroj = 5;
		int drugiBroj = 9;
		
		int zbirBrojeva = tool.saberi(prviBroj, drugiBroj);
			System.out.println("Zbir brojeva je " + zbirBrojeva);
		
		double x = Alat.kvadratBroja(7);
			System.out.println(x);*/
		
		Drzava drzava = new Drzava (); // metode get i set i tako
		
		drzava.setImeDrzave("Srbija");
		drzava.setBrojStanovnika(7000000);
		drzava.setPovrsina(100000.98);
		
		System.out.println("Ime drzave je: " + drzava.getImeDrzave());
		System.out.println("Broj stanovnika je: " + drzava.getBrojStanovnika());
		System.out.println("Povrsina je: " + drzava.getPovrsina() + " " + "km2");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
