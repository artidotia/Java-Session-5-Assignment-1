
public class Rectangle extends Shapes{
	Rectangle(double x, double y){
		super(x, y);
	}
	
	//we have to override the area of base class
	double area(){
		System.out.println("For Rectangle");
		return length * breadth;
	}
}
