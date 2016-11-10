import java.util.Scanner;

public class Shapes {

	static int userCal;

	static Circle cir = new Circle();
	static Triangle tri = new Triangle();
	static Rectangle rec = new Rectangle();
	static Scanner sc = new Scanner (System.in); 


	public static void main(String[] args) {
		String accept;
		int userChoice ;


		do {

			// Choose the shape
			System.out.println("Choose the shape" );
			System.out.println("1- Circle   2- Triangle   3- Rectangle ");
			userChoice = sc.nextInt();


			switch (userChoice) {

			case 1:
				inputCircle();                  // Call method inside class.
				chooseCalculation();            // Call method inside class.

				if (userCal == 1){
					cir.area();                 // Call method from Circle class.
				}else if (userCal == 2){
					cir.perimeter();            // Call method from Circle class.
				}else {
					cir.area();               
					cir.perimeter();          
				} break;
				

			case 2: 
				inputTriangle();
				chooseCalculation();

				if (userCal == 1){
					tri.area();                  // Call method from Triangle class.
				}else if (userCal == 2){
					tri.perimeter();             // Call method from Triangle class.
				}else {
					tri.area();                    
					tri.perimeter();
				} break;
				

			case 3: 
				inputRectangle();
				chooseCalculation();

				if (userCal == 1){
					rec.area();                   // Call method from Rectangle class.
				}else if (userCal == 2){
					rec.perimeter();              // Call method from Rectangle class.
				}else {
					rec.area();
					rec.perimeter();
				}break;
				
			default:  System.out.println("Invalid number");
			}	

			System.out.println(" Would you like to continue? Y / N ");
			accept = sc.next();
		}

		while (accept.equalsIgnoreCase("y"));

		sc.close();
	}




	// Ask for the value of relevant attribute for the Circle.
	public static void inputCircle(){
		System.out.println(" Enter The diameter of Circle ");
		cir.setDiameter (sc.nextDouble());

	}

	//  Ask for the value of relevant attribute for the Triangle.
	public static void inputTriangle(){
		System.out.println(" Enter The width of Triangle ");
		tri.setBase(sc.nextDouble());
		System.out.println("Enter The height of Triangle "); 
		tri.setHeight(sc.nextDouble());

	}

	//  Ask for the value of relevant attribute for the Rectangle.
	public static void inputRectangle(){
		System.out.println(" Enter The base of Rectangle ");
		rec.setWidth(sc.nextDouble());
		System.out.println("Enter The height of Rectangle ");
		rec.setHeight( sc.nextDouble()) ;

	}

	// Choose calculation
	public static void chooseCalculation(){
		System.out.println(" Choose calculate " );
		System.out.println("1- Area   2- Perimeter   3- Both ");
		userCal = sc.nextInt();


	}
}
