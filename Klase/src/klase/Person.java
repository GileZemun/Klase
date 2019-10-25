package klase;

public class Person {
	
	public String ime;
	public String prezime;
	public int godiste;
	public static int  kilaza;
	public static final int brojSrca = 1;	
	public Car automobil;	
	
	// prazan konstruktor
	
	public Person () {
	
	}
	
	public Person (String i, String p, int g) {
		
		this.ime = i;
		this.prezime = p;
		this.godiste = g;
	}
	
	public void pozdravSvete(String pozdravljac) {
		
		System.out.println("Hello world!!! vam zeli " + pozdravljac);
	}
	
	public void pozdrav (String imePozdravljaca, String prezimePozdravljaca) {
		
		System.out.println("Pozdrav od " + imePozdravljaca + " " + prezimePozdravljaca); // ili this.ime ako zelim da koristi tacno ovu promenljivu ime
	}
	
	
}


