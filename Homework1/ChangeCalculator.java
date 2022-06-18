import java.util.Scanner;

	/** 
	 * This is a class that will calculate the change of any amount
	 * in twenty dollar bills, ten dollar bills, five dollar bills,
	 * one dollar bills, quarters, dimes, nickels, and pennies 
	 * based on the user's input.
	 */
	class ChangeCalculator{
		
		public static void main(String[] args)
		{
			
			//initializations of variables
			int twentys;
			int tens;
			int fives;
			int ones;
			int quarters;
			int dimes;
			int nickles;
			int pennies;
			float total;
			float total2 = 0;
			
			//creating a way to get user input
		    Scanner keyboard = new Scanner(System.in);
		    //Asking the user to enter amount and storing input.
		    System.out.println("Enter an amount here: ");
		    total = keyboard.nextFloat();
		    total2 = total;
		    
		    //calculation for amount of twenty dollar bills
		    //then subtracting total by amount
		    twentys = (int) (total / 20.00);
		    total = (float) (total % 20.00);
		    
		    //calculation for amount of ten dollar bills
		    ////then subtracting total by amount
		    tens = (int) (total / 10.00);
		    total = (float) (total % 10.00);
		    
		    //calculation for amount of five dollar bills
		    ////then subtracting total by amount
		    fives = (int) (total / 5.00);
		    total = (float) (total % 5.00);
		    
		    //calculation for amount of one dollar bills
		    ////then subtracting total by amount
		    ones = (int) (total / 1.00);
		    total = (float) (total % 1.00);
		    
		    //calculation for amount of quarters
		    ////then subtracting total by amount
		    quarters = (int) (total / 0.25);
		    total = (float) (total % 0.25);
		    
		    //calculation for amount of dimes
		    ////then subtracting total by amount
		    dimes = (int) (total / 0.10);
		    total = (float) (total % 0.10);
		    
		    //calculation for amount of nickels
		    ////then subtracting total by amount
		    nickles = (int) (total / 0.05);
		    total = (float) (total % 0.05);
		    
		    //calculation for amount of pennies
		    ////then subtracting total by amount
		    pennies = (int) (total / 0.01);
		    total = (float) (total % 0.01);
		    
		    // Prints amount and component
		    System.out.println("Amount: $" + total2);
		    System.out.println("Exchange this into: ");
		    System.out.println(twentys + " twentys");
		    System.out.println(tens + " tens");
		    System.out.println(fives + " fives");
		    System.out.println(ones + " ones");
		    System.out.println(quarters + " quarters");
		    System.out.println(dimes + " dimes");
		    System.out.println(nickles + " nickles");
		    System.out.println(pennies + " pennies");
		    
		    // Close Scanner
		    keyboard.close();
		
		}//end of main method

}//end of ChangeCalculator class
