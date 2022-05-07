import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Alan
 * This is HW3
 * This class will print out the results from Lambda.java
 */
public class Working
{
	public static void main(String[] args) throws IOException {
		//Instantiates a new Lambda using a constructor 
		Lambda ob = new Lambda();
		//Creates a buffering character-input stream that uses a default-sized input buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//
		int T = Integer.parseInt(br.readLine());
		PerformOperation oper;
		boolean ret = false;
		String ans = null;
		while (T--> 0) 
		{
			//reads a line of text
			String s = br.readLine().trim();
			//Constructs a new string tokenizer for the specified string
			StringTokenizer st = new StringTokenizer(s);
			// returns next token from the string tokenizer unless no more tokens
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			// if 1 is entered, this check if number is odd or even and prints out what it is.
			if (ch == 1)
			{
			   oper = ob.isOdd();
			   ret = ob.see(oper, num);
			   ans = (ret) ? "ODD" : "EVEN";
			} 
			//if 2 is entered, this checks if number is prime
			else if (ch == 2) 
			{
			   oper = ob.isPrime();
			   ret = ob.see(oper, num);
			   ans = (ret) ? "PRIME" : "COMPOSITE";
			} 
			// if 3 is entered, this check if number is a palindrome and prints out what it is
			else if (ch == 3) 
			{
			   oper = ob.isPalindrome();
			   ret = ob.see(oper, num);
			   ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		 }
	}
		
}