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
}
}
