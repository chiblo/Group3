
public class Circle {

	private double diameter;
	final double PI = 3.142;
	

	// Calculate the area of Circle.
	public void  area() {
		double radius = diameter / 2;
		
		double area = PI * (radius * radius) ;
		System.out.println("Area of Circle is: " +area);
		System.out.println("Area of Circle is: " +area);
		System.out.println("Area of Circle is: " +area);
		System.out.println("Area of Circle is: " +area);
		
	
	}


	// Calculate the perimeter of Circle.
	public void perimeter() {
		
		double perimeter = PI * diameter;
		System.out.println("Perimeter of Circle is: " +perimeter);
	
	}
	

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

}
