package demo.copy2;

import java.util.Scanner;

public class PrimeNOOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The number is a Prime number");
		} else {
			System.out.println("Its not a prime number");
		}
	}
}