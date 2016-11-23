import java.util.Scanner;

public class Exercise3p3 {
	public static void main(String[] args) {
		
	double x = 0;
	double y= 0;
	
	System.out.print("Enter A , B , C ,D , F ");
	Scanner input = new Scanner(System.in);
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	
	
	if ((a*d)-(b*c) == 0)
		System.out.println("The equation has no solution");
	else{
	x = (( (e*d)-(b*f) )/( (a*d)-(b*c) ) ) ;
	y = (( (a*f)-(e*c) )/( (a*d)-(b*c) ) ) ;
	System.out.print("X= " );
	System.out.print( x);
	System.out.print("Y= " );
	System.out.print( y);
	}
}}