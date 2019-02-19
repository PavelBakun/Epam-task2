package task2;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		int leftNumber, rightNumber;
		
		System.out.println("Enter leftNumber: ");
		Scanner scanNumber = new Scanner(System.in);
		leftNumber = scanNumber.nextInt();
		System.out.println("Enter rightNumber: ");
		rightNumber = scanNumber.nextInt();
		scanNumber.close();
		
		for (int i = leftNumber; i < rightNumber + 1; i++) {
			int j = sumDividers(i); //i-first number, j-second number
			if ((sumDividers(j) == i) && ((sumDividers(i)) != i)) {
				System.out.println("Numbers " + i + " " + j + " are friendly");
			}//close if
		}//close for
	}//close main

	public static int sumDividers(int num){	
	    int sum = 0;
		for (int i = 1; i < num/2+1; i++) {
			sum+=((num % i == 0) ? i : 0);
		}//close for
		return sum;
	}//close SumDividers
}
