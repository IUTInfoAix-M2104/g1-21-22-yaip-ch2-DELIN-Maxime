import java.util.Scanner;

public class Add2Integers {
	
	public static void run() {
		
		int firstVal, secondVal, sum;
		
		Scanner in = new Scanner(System.in);		//scan the first value entered
		System.out.println("First value : ");
		firstVal = in.nextInt();
		
		System.out.println("Second value : ");		//scan the second value entered
		secondVal = in.nextInt();
		in.close();
		
		sum = firstVal + secondVal;			//compute the sum
		System.out.println("The sum of the two values entered is : " + sum);
		
	}
	
	public static void main(String[] args) {
	
		run();
	}
}