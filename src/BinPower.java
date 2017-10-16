import java.util.Scanner;

public class BinPower {
	String name = "";
	Scanner kbd = new Scanner(System.in);
	public BinPower() {
		
		
	}
	
	
	public void setBinary() {
		System.out.println("Hello! What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name +" let's begin \n");
		System.out.println("Hello! " + name +" what base number do you want to enter?");
		double base = kbd.nextDouble();
		System.out.println("You have entered: " + base);

		System.out.println("Hello!" + name +" what binary exponent do you want to enter?");
		double exp = kbd.nextDouble();
		System.out.println("You have entered: " + exp);
		double ans = 0;
		
		ans =  Math.pow(base,exp);
		System.out.println("Answer is: " + ans);
	}

}