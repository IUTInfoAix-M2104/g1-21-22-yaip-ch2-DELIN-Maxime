import java.util.Scanner;

public class SquarePattern {
	
	public static void run() {
		
		int size;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the shape : ");
		size = in.nextInt();
		in.close();
		
		
		
		for(int column = 1; column <= size; ++column) {
			
			for(int row = 1; row <= size; ++row) {
				
				System.out.print("# ");
			}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
		run();
	}
}