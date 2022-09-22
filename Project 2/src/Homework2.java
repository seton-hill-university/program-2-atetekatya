
// Project: Assignment
// Author: Katya Atete
// GitHub: atetekatya
// Date: September 19, 2022
// Version: 1.0
// Desc: This program uses a switch statement to 
// account for user choice from the menu.


import java.util.*;
public class Homework2 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		// initialize the variable
		
		int a,b,c,d;
		d = 0;
		
		// Ask the user to enter the numbers
		
		System.out.println("Enter the first number");
		
		a = num.nextInt();
		
		System.out.println("Enter the second number");
		
		b = num.nextInt();
		
		System.out.println("Enter the Third number");
		
		c = num.nextInt();
		
		System.out.println("=======================");
		System.out.println("=======================");
		
		// the menu for the user
		
		
		System.out.println("Add");
		System.out.println("Square sum");
		System.out.println("Multiply");
		System.out.println("Divide");
		
		System.out.println("=======================");
		System.out.println("=======================");
		
		// Ask the user to choose a number from the menu
		
		int menu;
		  System.out.println("Enter a number from the menu");
		
		menu = num.nextInt();
		
		switch (menu)
		{
		case 1:
			d = a+b+c;
			System.out.println("The sum of three numbers is " +d);
			break;
			
		case 2:
			d = (a*a) + (b*b) + (c*c);
			System.out.println("The square sum of the three numbers is " +d);
			break;
			
		case 3:
			d = a*b*c;
			System.out.println("The product of three numbers is " +d);
			break;
			
		case 4:
			d = (a+b)/c;
			System.out.println("The quotient is " +d);
			break;
			
			default:
				System.out.println("End");
		}			
			
		// Tell the user if the output from the menu is less or greater than the 
		// last input from the keyboard.
		
		if(c < d )
		
			System.out.println("The greater number is " +d);
		
		else
			System.out.println("The greater number is " +c);



	


	}
	
}
