package _02_sea_creature;

public class Runner {
public static void main(String[] args) {
	SeaCreature Spongebob = new SeaCreature("spongebob");
	SeaCreature Squidward = new SeaCreature("squidward");
	SeaCreature Patrick = new SeaCreature("patrick");
	Spongebob.eat();
	Squidward.eat();
	Patrick.eat();
	Spongebob.laugh();
	Squidward.laugh();
	Patrick.laugh();
	
}
}
