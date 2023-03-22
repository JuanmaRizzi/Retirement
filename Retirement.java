 import java.util.Scanner;
public class Retirement{
	public static void main(String args[]){
		System.out.print("****************************************************************");
		System.out.print("Software to plan your retirement");
		System.out.print("****************************************************************");
		Scanner in = new Scanner(System.in);
		System.out.print("How much money will you contribute every year?");
		double payment = in.nextDouble();
		System.out.print("Intrest rate in %: ");
		double rate= in.nextDouble();
		double balance = 0;
		int year = 0;

		String input;
	
		do{
			balance += payment;
			double interest = balance*rate/100;
			balance += interest;

			year++;

		System.out.print("****************************************************************");
		System.out.printf("After year %d, your balance is %, .2f%n", year, balance);
		System.out.print("****************************************************************");


		System.out.print("ready to retire? (Y/N)");
		input = in.next();

		}
		while(input.equals("N"));

		


		

		

		
	}
}