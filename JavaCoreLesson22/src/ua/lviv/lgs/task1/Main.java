package ua.lviv.lgs.task1;

interface Pet {
	String voice();
}

public class Main {
	public static void main(String[] args) {
		Pet cow = () -> "I'm cow ... muuu";
		voice(cow.voice());
		Pet cat = () -> "I'm cat ... miau";
		voice(cat.voice());
		Pet dog = () -> "I'm dog ... gaf";
		voice(dog.voice());
	}

	public static void voice(String voice) {
		System.out.println(voice);
	}
}
