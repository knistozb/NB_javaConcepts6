
///// JAVA Class 7 part 3: on May 13, 2023, Saturday with Instructor AP ////


package nb_cl7_oop1continued_pkg;

public class NB_cl7notes_oop4_polymorphism {


		// 1. DDL - Data Definition Language
				///Its used to create and modify database objects such as tables etc. DDL are used to define metadata in the database. 
				// Mnemonics: Dr CAT -  Drop, Rename, Create, Alter, Truncate
	
		// 2. Oop Concept: Four foundations/pillars ==> APIE
			// Mnemonic: A PIE - Abstraction, Polymorphism, Inheritance, Encapsulation
				// a. Polymorphism: broken down into 2 parts:- can take place in either Methods or Objects
					// i. Hypothesis 1 for method polymorphism/ method overloading : 
						// It is okay to have the same METHOD name as long as we can differentiate with different arguments (input parameters inside the small bracket/parenthesis)
						// Multiple formations under same method
		
		// 3. importing and exporting codes:- at work when someone asks for our code, but only wants to run it without having to modify anything
			// a. right click on the project then click export button
			// b. Under General, only worry about archive files ( zip files), and File System (folders)
			// c. Click the one you want and save it where you prefer 
			// d. Create your new workspace where you can copy paste the desired folder into that workspace
			// e. Create a new project in that new workspace but name it the exact same project name as the copied ones
				// it will then realize thats the same one we wanted so it will import all of the pkg and classes
	
	
		// IQA 1: What is polymorphism for method? or what is method overloading? 
				// ==> A method of way of doing polymorphism is you can have the same name of the method as long as you can distinguish or differentiate them with different arguments or by the type of arguments or by the sequence of arguments    
				// Give example using sum method but different input parameters during the interview
				// They are doing this so the users do not get confused 
					// ex: lets say there is a sum method which has parameter of int a. we can introduce another same methodName, i.e. sum BUT this time using int a , int b....or String a or int a, String b.... etc. 
						// as long as we use different parameters 
	
	
	// parameterization: basically using different input parameters under same methodName also famously known as method overloading
	
	
	
	// =================================================================================================
	
	
	
// Exercise 2: 	
	public static void main(String[] args) {
	
		
//		String a = "apple";
		
		NB_cl7notes_oop4_polymorphism.sum(55);  // 60
		System.out.println("=======1=======");
		NB_cl7notes_oop4_polymorphism.sum(55, 45);    // 100 
		System.out.println("=======2=======");
		NB_cl7notes_oop4_polymorphism.sum(55, "hello");   // 5+55  --> 60...since it picks the sum meth that has int,string format to match the given quest args
		System.out.println("=======3=======");
		NB_cl7notes_oop4_polymorphism.sum("nish", 66);		// hello66
	
	}

	public static void sum(int a, String b) {
		
		System.out.println(5+a);    // 5+55 = 60
		System.out.println("=======4=======");
		System.out.println(a + b);		// 55hello  ..... just concatenate intstring
		System.out.println("=======5=======");
		System.out.println(5+a+b);      // 5+55+hello = 60hello   ..... you can add the first int + second int and concatenate with string
		System.out.println("=======6=======");
		System.out.println(5+b+a);      // 5hello55..... you cannot add the first int and the last int
		System.out.println("=======7=======");
		System.out.println(b+5+a);      // hello555......remember if string + int + int = stringintint....you cannot add

	}
	
	public static void sum(String a, int b) {
		
		System.out.println(a);
		System.out.println("yo yo");
	}
	
	public static void sum(int a) {
		
		System.out.println(5+a);
	}
	
	public static void sum(int a, int b) {
		
		System.out.println(a+b);
	}
	
}

	
	/*
// Exercise 1:	
	
	public static void main(String[] args) {
	
		
		String a = "apple";
		
		NB_cl7notes_oop4_polymorphism.sum(55);  // 60  ... it automatically takes the first sum method which has only 1 int a parameter
		NB_cl7notes_oop4_polymorphism.sum(55, 45);   // 100 .... it takes the second sum method which helps to insert 2 parameters of 2 integers
	
		System.out.println(a);   // apple
	
	}

	public static void sum(int a) {
		
		System.out.println(5+a);
	}
	
	public static void sum(int a, int b) {
		
		System.out.println(a+b);
	}	
}
	 */




