
///// JAVA Class 7 part 2: on May 13, 2023, Saturday with Instructor AP ////


package nb_cl7_oop1continued_pkg;

import java.util.Arrays;
import java.util.Collections;

public class NB_cl7notes_oop3_GlobalLocal {

	
	
	// static to non-static:  basically we need an object/instance to access them
	// static to static: className.methodName();
	
	// local -- if it is inside the same method
	// global   ==>  if it is outside main method for global use by any others method as long as we call it rightly
	
	
	
	
	
	// ==============================================================================
	
	
// Exercise 3: 	Create an instance variable?

	public int a = 10;
	public static String c ="cat"; 
	
	public static void main(String[] args) {
	
		// Create a variable in the main method?
		int a = 9;
		System.out.println(a);  // 9
		System.out.println("======1=====");
		NB_cl7notes_oop3_GlobalLocal obja = new NB_cl7notes_oop3_GlobalLocal();
		System.out.println(obja.a);   // because the global x is non-static, we have to create an object first
		System.out.println("======2=====");
		System.out.println(c);   // it takes the global value of c unless there is another local c inside main method
		System.out.println("======3=====");
		System.out.println(NB_cl7notes_oop3_GlobalLocal.c);
		
		
		System.out.println("======4=====");
		int[] abc = {234,23423, 6767,546,777};
		System.out.println(abc.length);   // 5
			// length: int - int[]  ==> int means its gon return data integer value
			// int[] it is called a class called int array so this is basically a variable in the class level integer array
		 	// no parenthesis means its a variable; does not have a return type
			// parenthesis means its got a method ; has a return type
				// though it could be a method with void which does not have any return type or value for it
		
		System.out.println("======5=====");
		System.out.println(abc[0]);    // 234    // if you want to print the very first number from the int []
		System.out.println("======6=====");
		System.out.println(abc[abc.length-1]);   // if you want to print the very last number from the int []
		System.out.println("======7=====");
		Arrays.sort(abc, 0, abc.length-1);    // to sort out in asc order by default
		System.out.println(abc[3]);    // to print after getting sorted in asc order
		
		
	}
	
	public static void test() {
		
		
		int a = 8;
			
	}
}	
	
	
	/*
//  Exercise 2:	
	
	public static int x = 99;   // citizen of whole world so anyone can access it
	public int a = 10;
	
	public static void main(String[] args) {
		
		int x = 5;   // prints 5; 
		System.out.println(x);  // since this is local level for main method...but nobody else can access it outside this main method
 
		System.out.println("======1=====");
 
		test();	}
	
	public static void test() {
		
		int x = 7;
		System.out.println(x);   // Prints 7 since it is local for inside this test method
			// but it will print 99 for global/class level if the local int x inside test method is removed 
		System.out.println("======2=====");
		System.out.println(NB_cl7notes_oop3_GlobalLocal.x);   // if we were to print the global level x = 99
			// since static to static can be directly called using className.methodName();
		System.out.println("======3=====");	
		NB_cl7notes_oop3_GlobalLocal obja = new NB_cl7notes_oop3_GlobalLocal();
		System.out.println(obja.a);   // since static to non-static requires calling using an object/instance
		
		
	}
}	
	*/
	
	/*
// Exercise 1: 
	
	static int x = 55;  // this cannot be made inside the method...but only inside class
		// it is not an actual method, but defined as is.
		
	public static void main(String[] args) {
	
		NB_cl7notes_oop3_GlobalLocal objb = new NB_cl7notes_oop3_GlobalLocal();
		objb.test();			
		System.out.println("======1=====");
		int x = 10;
		System.out.println(NB_cl7notes_oop3_GlobalLocal.x);  // I want the x literally from the class so it will pick on global x
		System.out.println("======2=====");
		System.out.println(x);     // this is asking local value of x from this main method 
		System.out.println("======3=====");
		String a = "apples"; 
		System.out.println(a);
		System.out.println("======4=====");
		objb.test();
		
	}
	
	public void test() {
		
		String a = "apple";
		System.out.println(a);
		
	}
}
	*/


