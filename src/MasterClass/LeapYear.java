package MasterClass;

import java.util.Scanner;

public class LeapYear {
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = scan.nextInt();
		
		if(year%4 == 0) {
			System.out.println("The Year is a leap year");
			
		}
		else {
			System.out.println("The year is not a leap year");
		}
		
	}
	
	

}