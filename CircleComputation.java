import java.util.Scanner;

public class CircleComputation {
	
	public static void run() {
		
		double radius, diameter, circumference, area;
		
		Scanner in = new Scanner(System.in);		//scan the radius
		System.out.println("Enter the radius : ");
		radius = in.nextDouble();
		
		diameter = 2.0 * radius;					//compute the radius
		System.out.println("The diameter is : " + diameter);
		
		area = Math.PI * radius * radius;			//compute the area
		System.out.println("The area is : " + area);
		
		circumference = 2.0 * Math.PI * radius;		//compute the circumference
		System.out.println("The circumference is : " + circumference);
		
	}
	
	public static void main(String[] args) {
		
		run();
	}
	
}