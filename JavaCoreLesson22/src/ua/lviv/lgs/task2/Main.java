package ua.lviv.lgs.task2;

interface DoSmth {
	void doSmth();
}

class Frog {
	DoSmth sleep = () -> System.out.println("Sleeping!");
	DoSmth swim = () -> System.out.println("Swimming!");
	DoSmth walk = () -> System.out.println("Walking!");
	DoSmth eat = () -> System.out.println("Eating!");
}

public class Main {
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.eat.doSmth();
		frog.sleep.doSmth();
		frog.swim.doSmth();
		frog.walk.doSmth();

	}

}
