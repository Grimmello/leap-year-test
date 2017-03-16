import java.io.Console;
public class App{
	public static void main(String[] args) {
		Console myConsole = System.console();
		System.out.println("Please enter a year, find out if it is a leap year: ");
		int inputYear = Integer.parseInt(myConsole.readLine());
		LeapYears leapYear = new LeapYears();
		boolean leapYearResult = leapYear.isLeapYear(inputYear);
		if (leapYearResult) {
			System.out.println(inputYear +" is a leap year!");
		} else {
			System.out.println(inputYear +" is not a leap year!");
		}
	}
}
