
public class Triangle extends Shapes{
	private double height; 
	Triangle(double x, double y, double h){
		super(x, y);
		height = h;
	}
	
	//we have to override the area of base class
	double area(){ //area of triangle 1/2 * base * height
		System.out.println("For Triangle");
		return breadth * height/2;
	}
}
