
public class Triangle {


	private double base;
	private double height;

	// Calculate the area of Triangle.
	public void  area() {
	
		double area = (base * height) / 2;
		System.out.println("Area of Triangle is: " +area);

	}


	// Calculate the perimeter of Triangle.
	public void perimeter() {


		double perimeter = 3 * base;
		System.out.println("Perimeter of Triangle is: " +perimeter);

	}


	public void setBase(double width) {
		this.base = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}