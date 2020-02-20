package _03_smurf;

public class Runner {
public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("Handy");
	Smurf PapaSmurf = new Smurf("Papa");
	Smurf Smurfette = new Smurf ("Smurfette");
	System.out.println(HandySmurf.getName());
	System.out.println(PapaSmurf.getName());
	System.out.println(Smurfette.getName());
	HandySmurf.eat();
	PapaSmurf.eat();
	Smurfette.eat();
	System.out.println(HandySmurf.isGirlOrBoy());
	System.out.println(PapaSmurf.isGirlOrBoy());
	System.out.println(Smurfette.isGirlOrBoy());
	System.out.println(HandySmurf.getHatColor());
	System.out.println(PapaSmurf.getHatColor());
	System.out.println(Smurfette.getHatColor());
}
}
