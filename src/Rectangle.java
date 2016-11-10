
public class Rectangle {

	private double height;
	private double width;

	// Calculate the area of Rectangle..
	public void  area() {

		double area = width * height;
		System.out.println("Area of Rectangle is: " +area);

	}

	
	// Calculate the perimeter of Triangle.
	public void perimeter() {

		double perimeter = (width + height) * 2;
		System.out.println("Perimeter of Rectangle is: " +perimeter);

	}


	public void setWidth(double width) {
		this.width = width;
	}


	public void setHeight(double height) {
		this.height = height;
	}


}

