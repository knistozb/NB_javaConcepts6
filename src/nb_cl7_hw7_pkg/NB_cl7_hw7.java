package nb_cl7_hw7_pkg;

import java.util.Scanner;

public class NB_cl7_hw7 extends NB_hw77 {

	
	// Assignment:

		// 1. Implement inheritance in a java program
				// a. Use the “Super” keyword to show the use of it
				// b. Implement override to show the use of it
		// 2. Implement Overload methods to show the use of it
 
		// 3. Show me the use of all Access Modifiers concepts for all (see chart)
 
	
	
	
	public static void main(String[] args) {

		System.out.println("Welcome to Nish's Java Homework 7!");
		System.out.println("======================================");
		
		System.out.println(" Ques 1: Implement inheritance in a java program.");
		Scanner hw7 = new Scanner(System.in);
		String a = hw7.nextLine();
		
		NB_cl7_hw7 nb = new NB_cl7_hw7();
		nb.nk1();       // invoking that overridden child class using super and non-static
//		NB_hw77.nk3();  // invoking the child class similar to parent using the override concept
		nb.nk4();		// invoking different class class using an object and final keyword
		
		System.out.println("======================================");
		System.out.println(" Ques 2: Implement Overload methods to show the use of it.");
		
		if(a.contains("ans")){
			
			if(a.contains("ans")) {
				
				Scanner q2  = new Scanner(System.in);
				String b = q2.nextLine();
			
				nb.nk5();
				nb.nk5(7);
				
			}	
			else {
				System.out.println("You entered incorrect code to enter Nish's HW. Please try again, and run it!");
			}
			
		}
		
		if(a.contains("ans")) {
			
			System.out.println("======================================");
			System.out.println("Question 3: Show me the use of all Access Modifiers concepts for all. ");
			Scanner q3 = new Scanner(System.in);
			String c = q3.nextLine();
			nb.nk6("This is the use of private modifier concept.");
		
			
			System.out.println("======================================");
			System.out.println(" This is the end of HW 7! Thank you, and GoodBye!!!");

		}
		else {
			System.out.println("You entered incorrect code to enter Nish's HW. Please try again, and run it!");
		}
		
	}
	
	public void nk1() {
		super.nk3();
		System.out.println("I am using this non-static method to use super function.");
	}
		
	public static void nk3() {
		System.out.println("This is a override of parent class nk3 using super. ");

	}
	
	private void nk6(String x) {
		System.out.println(x);
	}
	
	
	

}
