import java.util.Scanner;


public class CalculateArea {
	static double x, y, z;
	static Rectangle r;
	static Triangle t;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int val;
		Shapes sref;
		
		System.out.println("Calculate area!!!");
		System.out.println();
		System.out.println("If you want to print");
		System.out.println("Area of Rectangle then press 1");
		System.out.println("Area of Triangle then press 2");
		System.out.println("Area of both Rectangle and Triangle then press 3");
		val = sc.nextInt();
		System.out.println();
		
		switch (val){
			case 1: //print area of rectangle 
				getDimesions(val);	
				r = new Rectangle(x, y); //initialize rectangle
				sref = r;
				System.out.println("Area is: " + sref.area());
				break;
			case 2: //print area of triangle 
				getDimesions(val);	
				t = new Triangle(x, y, z); //initialize triangle
				sref = t;
				System.out.println("Area is: " + sref.area());
				break;
			case 3: //print area of rectangle and triangle both 
				getDimesions(val);
				r = new Rectangle(x, y); //initialize rectangle
				t = new Triangle(x, y, z); //initialize triangle
				sref = r;
				System.out.println("Area is: " + sref.area());
				sref = t;
				System.out.println("Area is: " + sref.area());
				break; 
			default: System.out.println("Invalid Entry");
		} //switch ends
	}
	
	public static void getDimesions(int num){
		System.out.println("Please enter the vales for the sides:");
		System.out.println("Breadth: ");
		y = sc.nextDouble();
		switch (num) {
			case 1: System.out.println("Length: ");
					x = sc.nextDouble();
					break;
			case 2: System.out.println("Height: ");
					z = sc.nextDouble();
					break;
			case 3: System.out.println("Length: ");
					x = sc.nextDouble();
					System.out.println("Height: ");
					z = sc.nextDouble();
		}
		System.out.println();
	}
	
}
