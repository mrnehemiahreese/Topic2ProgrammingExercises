	import java.util.Scanner;
public class Exercise3p5 {

public static void main(String[] args) {
	
	 		System.out.print("What day is it? (Enter 0 for Sunday, 1 for Monday, ... ");
			 Scanner input = new Scanner(System.in);
			 int startday = input.nextInt();
			 System.out.print("How many days do you want to jump ahead?");
			 input = new Scanner(System.in);
			 int jump = input.nextInt() ;
			 int endday = 999;
			 
			 if (startday == 0)
				 endday = jump
			 else if (startday % 6 == 0)
				 endday = startday;
			 else if ((startday + jump) > 6)
				 endday = (startday + jump) % 6;
			 else 
				 endday = startday + jump;
			 
			
			 switch (startday) {
			 case 0: System.out.println("Todays is Sunday and the future day is  ");
			 break;
			 case 1: System.out.println("Todays is Monday and the future day is ");
			 break;
			 case 2: System.out.println("Todays is Tuesday and the future day is ");
			 break;
			 case 3: System.out.println("Todays is Wednesday and the future day is ");
			 break;
			 case 4: System.out.println("Todays is Thursday and the future day is ");
			 break;
			 case 5: System.out.println("Todays is Friday and the future day is ");
			 break;
			 case 6: System.out.println("Todays is Saturday and the future day is ");
			 break;
			 default: System.out.println("Error: invalid day");
			 System.exit(1);
			 }
			 
			 switch (endday) {
			 case 0: System.out.print("Sunday");
			 break;
			 case 1: System.out.print("Monday");
			 break;
			 case 2: System.out.print("Tuesday");
			 break;
			 case 3: System.out.print("Wednesday");
			 break;
			 case 4: System.out.print("hursday");
			 break;
			 case 5: System.out.print("Friday");
			 break;
			 case 6: System.out.print("Saturday");
			 break;
			 default: System.out.print("Error: invalid day");
			 System.exit(1);
			 }
			 /*
			 if (day == 0)
				 
			  else if (day == 1)
				  System.out.println("Todays is Monday and the future day is ");
			  else if (day == 2)
				 
			  else if (day == 3)
				  
			  else if (day == 4)
				  System.out.println("Todays is Thursday and the future day is ");
			  else if (day == 5)
				  System.out.println("Todays is Friday and the future day is ");
			  else if (day == 6)
				  System.out.println("Todays is Saturday and the future day is ");
			 
			 */
			 
						    											
}
			 }
