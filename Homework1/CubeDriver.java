import java.util.Scanner;

/**
 * @author Alan
 * This class will print out the results of the calculations of the
 * surface area and volume of a cube from Cube.java 
 */

class CubeDriver{
	
public static void main(String[] args) {
	//declaring variable total as a double
	double total;
	
	//creating a way to get user input
    Scanner keyboard = new Scanner(System.in);
    
    //Asking the user to enter amount.
    System.out.println("Enter a side length amount here: ");
    //storing input using total to access.
    total = keyboard.nextDouble();
    
		//declaring cube1 as variable
		Cube Cube1; 
		//Instantiates a new cube using a constructor
		Cube1 = new Cube(total);
		System.out.println("Length of side is: " + Cube.sideLength);
		
		System.out.println("Surface area is: "+ Cube1.surfaceArea());
		
		System.out.println("Volume : " + Cube1.volume());
		// Close Scanner
	    keyboard.close();
	}//end of main method
}//end class CubeDriver