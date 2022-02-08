import java.util.Scanner;

public class Swap2Integers {
	
	public static void run() {
		
		int firstInt, secondInt, tempInt;
		
		Scanner in = new Scanner(System.in);			//scan the integers
		System.out.println("Enter the first integer : ");
		firstInt = in.nextInt();
		
		System.out.println("Enter the second integer : ");
		secondInt = in.nextInt();
		
		System.out.println("The two integers are " + firstInt + " and " + secondInt + ".");
		
		tempInt = firstInt;			//swap the integers
		firstInt = secondInt;
		secondInt = tempInt;
		
		System.out.println("The two integers are now " + firstInt + " and " + secondInt + ".");
	}
	
	public static void main(String[] args) {
		
		run();
	}
	
}