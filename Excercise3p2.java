import java.util.Scanner;

public class Excercise3p2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    
		    int num1 = (int)(System.currentTimeMillis() % 10);
		    int num2 = (int)(System.currentTimeMillis() * 7 % 10);
		    int num3 = (int)(System.currentTimeMillis() * 3 % 10);

		    System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
		    																
		    int sum = num1 + num2 + num3;
		    int answer = input.nextInt();
		    
		    System.out.println(num1 + " + " + num2 + " + " + num3 + 
		      " = " + answer + " is " + (sum == answer) );

	}

}
