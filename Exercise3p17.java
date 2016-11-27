import java.util.Scanner;


public class Exercise3p17 {

	public static void main(String[] args) 
	{
		int x = (int) (Math.random() * 100);     //Computer chooses
		x  = x%3;
	
		Scanner input = new Scanner(System.in); //User Chooses

	    // Prompt the user to enter filing status
	    System.out.print("Enter 0 for scissor, 1 for rock, or 2 for paper:");
	    int selection = input.nextInt();
		
		switch (x) {
		 case 0: System.out.print("The computer is scissors. ");
		 	if (selection == 0)
		 		System.out.print("You are scissors. It is a draw.");
		 	else if (selection == 1)
		 		System.out.print("You are rock. You win.");
		 	else
		 		System.out.print("You are paper. You lose.");
		 break;
		 case 1: System.out.print("The computer is rock. ");
		 	if (selection == 0)
		 		System.out.print("You are scissors. You lose.");
		 	else if (selection == 1)
		 		System.out.print("You are rock.  It is a draw.");
		 	else
		 		System.out.print("You are paper.  You win.");
		 break;
		 case 2: System.out.print("The computer is paper. ");
		 	if (selection == 0)
		 		System.out.print("You are scissors. You win.");
		 	else if (selection == 1)
		 		System.out.print("You are rock.  You lose.");
		 	else
		 		System.out.print("You are paper. It is a draw.");
		 break;
		 default: System.out.println("Error: invalid choice");
		 System.exit(1);
		 }
		
	}

}
