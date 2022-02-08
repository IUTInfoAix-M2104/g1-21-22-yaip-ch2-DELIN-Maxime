import java.util.Scanner;

public class SumProductMinMax3 {
	
	public static void run() {
		
		int firstVal, secondVal, thirdVal, sum, product, minVal = 0, maxVal = 0;
		
		Scanner in = new Scanner(System.in);		//scan the first value entered
		System.out.println("First value : ");
		firstVal = in.nextInt();
		
		System.out.println("Second value : ");		//scan the second value entered
		secondVal = in.nextInt();
		
		System.out.println("Third value : ");		//scan the third value entered
		thirdVal = in.nextInt();
		in.close();
		
		sum = firstVal + secondVal + thirdVal;			//compute the sum
		System.out.println("The sum of the two values entered is : " + sum);
		
		product = firstVal * secondVal * thirdVal;		//compute the product
		System.out.println("The product of the two values entered is : " + product);
		
		
		if(firstVal <= secondVal && firstVal <= thirdVal)		//verify which value is the lowest
			minVal = firstVal;
		
		else if(secondVal <= firstVal && secondVal <= thirdVal)
			minVal = secondVal;
		
		else if(thirdVal <= firstVal && thirdVal <= secondVal)
			minVal = thirdVal;
		
		System.out.println("The minimum value is : " + minVal);		//print the minimum value
		
		
		if(firstVal >= secondVal && firstVal >= thirdVal)		//verify which value is the highest
			maxVal = firstVal;
		
		else if(secondVal >= firstVal && secondVal >= thirdVal)
			maxVal = secondVal;
		
		else if(thirdVal >= firstVal && thirdVal >= secondVal)
			maxVal = thirdVal;
		
		System.out.println("The maximum value is : " + maxVal);		//print the maximum value
		
	}
	
	public static void main(String[] args) {
	
		run();
	}
}