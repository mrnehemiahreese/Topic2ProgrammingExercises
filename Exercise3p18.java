import java.util.Scanner;
public class Exercise3p18 {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter package weight: ");
		    double x = input.nextDouble();
		    
		    if (x <= 1) {
		      System.out.println("The shipping cost is $3.5");
		    }
		    else if (x <= 3) {
		      System.out.println("The shipping cost is $5.5");
		    }     
		    else if (x <= 10) {
		      System.out.println("The shipping cost is $8.5");
		    }     
		    else if (x <= 20) {
		      System.out.println("The shipping cost is $10.5");
		    }     
		    else {
		      System.out.println("The package cannot be shipped");
		    }

	}
	}



