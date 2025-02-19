package javaprograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, remainder;
		
		System.out.print("Please enter a number : ");
		
		Scanner scan = new Scanner (System.in);
		number = scan.nextInt();
		scan.close();
		
		remainder = number % 2;
		
		if(remainder == 0)
			
			System.out.println("The number " + number + " is an Even");
		
		else
			System.out.println("The number " + number + " is an Odd");


	}

}
