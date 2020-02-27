package _06_minion;
public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		
		this.eyes = eyes;
		
		this.color = color;
		
		this.master = master;
		
}
	String getName(){
		
		return this.name;
	}
	int geteyes(){
		
		return this.eyes;
	}
	String getcolor(){
		
		return this. color;
	}
	String getmaster(){
		
		return this. master;
	}
	void setName(String name) {
		
		this. name = name;
	}
	void seteyes(int eyes) {
		
		this. eyes = eyes;
	}
	void setcolor(String color) {
		
		this. color = color;
	}
	void setmaster(String master) {
		
		this. master = master;
	}
}





























