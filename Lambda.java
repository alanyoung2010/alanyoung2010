import java.util.*;
interface PerformOperation{
	boolean checks(int c);
}

/**
 * @author Alan
 * This is HW3
 * This class contains methods that will return if numbers are odd, even, prime
 * composite, or a palindrome.
 */

class Lambda
{
	
	public static boolean see(PerformOperation a,int number) 
	{

		return a.checks(number);
	}
	
	PerformOperation isOdd()
	{
		//checks to see if number can be devided by 2
		PerformOperation lamb = (int c)-> c %2 == 0 ? false : true;
		return lamb;
		
	}
	
	PerformOperation isPrime()
	{
		PerformOperation lamb = (int c)->
		{
			if(c==1) 
			{ 
				return true;
			}
			else
			{
				//checks to see if number can be divided by a number greater than 2
				for(int i=2; i< Math.sqrt(c); i++)
					if(c%i ==0)
					{
						return false;
					}
				return true;
			}
		};
		return lamb;
	}
	
	PerformOperation isPalindrome()
	{
		ArrayList<Integer> cc = new ArrayList<>();
		PerformOperation lamb = (int c)->
		{
			
			String some = Integer.toString(c);
			String reverse = "";
			//loops through the string
			for(int i = some.length()-1; i >= 0; i--)
			{
				//checks to see if a number is the same backwards as it is forwards
				reverse = reverse + some.charAt(i);
			}
			if(reverse.equals(some))
			{
				return true;
			}
			return false;
		};
		
		return lamb;
	}
}