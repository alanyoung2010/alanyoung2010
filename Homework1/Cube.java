/**
 * @author Alan
 * This is HW1 Problem 2
 * This class will calculate the surface area and volume
 * of a cube.
 */
class Cube{
	
	//creating an instance variable called sideLength
	static double sideLength;
	
	//constructor that sets sideLength
	public Cube(double sideLengths) {
		
		sideLength = sideLengths;
		
		}//end of constructor
	
	//calculates surface area by multiplying the amount of   
	//sides with length and width of one side 
	public double surfaceArea() {
		
		return (6 * sideLength * sideLength);
		
	}//end of surfaceArea method
	
	//calculates the volume with product of
	public double volume() {
		
		return (sideLength * sideLength * sideLength);
		
	}//end of volume method
	
}//end of Cube class