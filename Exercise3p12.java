import java.util.Scanner;


public class Exercise3p12 {
	  public static void main(String[] args) {
		    
		    
		    
		  System.out.print("Enter a three-digit integer: ");
		  Scanner input = new Scanner(System.in);
		  int number = input.nextInt();
		    

		    if (number / 100 == number % 10){
		    	System.out.print(number);
		    	System.out.println(" is a palindrome");}
		    else 
		    	{System.out.print(number);
		      	System.out.println(" is not a palindrome");}
		  }
}
