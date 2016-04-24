package reverse;

import java.util.Scanner;

public class Reverse{
	public static void main (String [] args){
		System.out.println("Enter a number to reverse!");
		
		int number = new Scanner (System.in) . nextInt ();
		// are resource leaks normal? not sure
		// what to do to avoid this
		
	System.out.println("Reverse of number is " + 
	reverse(number));
				}
	
	
	public static int reverse (int number){
		int reverse = 0;
		int remainder = 0;
		do{ remainder = number%10;
		//this modulus function takes off the last digit
		reverse = reverse*10 + remainder;
		number = number/10;}
		/* as long as the number is greater than zero
		it will perform the function.if less than zero, it will 
		not perform correctly.
		*/
		while (number > 0);
		return reverse;
		}
	
	
	}

