import java.util.Scanner;

public class QBRating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for inputs
		System.out.print("Enter Number of Touchdown Passes: ");
		double td = input.nextDouble();
		
		System.out.print("Enter Number of Passing Yards: ");
		double yds = input.nextDouble();
		
		System.out.print("Enter Number of Passing Attempts: ");
		double att = input.nextDouble();
		
		System.out.print("Enter Number of Completions: ");
		double comp = input.nextDouble();
		
		System.out.print("Enter Number of Interceptions: ");
		double noints = input.nextDouble();
		
		//complete calculations
		double a = 5*((comp/att)-0.3);
		double b = 0.25 * ((yds/att)-3);
		double c = 20*td/att;
		double d = 2.374 - (25*noints/att);
		
		double rtg = 100* (a+b+c+d)/6;
		System.out.print("The Passer Rating is " + rtg );
		
	}
}
