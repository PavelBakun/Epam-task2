package task2;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner scanNumber = new Scanner(System.in);
		int number = scanNumber.nextInt();
		scanNumber.close();
		System.out.println("number " + number + " is " + 
		                  ((sumDividers(number) == number) ? "perfect" : "unperfect"));
	}//close main
	
	public static int sumDividers(int num){	
	    int sum = 0;
		for (int i = 1; i < num/2+1; i++) {
			sum+=((num % i == 0) ? i : 0);
		}//close for
		return sum;
	}//close SumDividers
}//close class
