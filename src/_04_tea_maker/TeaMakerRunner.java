package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag TB = new TeaBag(TeaBag.GREEN);
	Kettle K = new Kettle();
	Cup C = new Cup();
	K.boil();
	C.makeTea(TB,K.getWater() );
}
}
