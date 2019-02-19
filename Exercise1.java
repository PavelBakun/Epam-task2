package task2;

import java.util.Random;

public class Exercise1 {
	public static void main(String[] args) {
		int number = 1000;
		int countHeads = 0;
		Random random = new Random(); //create object Random
		for (int i=number; i>0; i--) {
			countHeads+=random.nextInt(2); //if random==1 then countHeads++
		}//close for
		System.out.println("The number of Heads is "+countHeads+";\n" + 
			               "the number of Tails is "+ 
				            (number-countHeads));//countTails=number-countHeads
	}
}
