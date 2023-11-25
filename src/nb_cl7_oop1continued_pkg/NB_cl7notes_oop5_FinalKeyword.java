
///// JAVA Class 7 part 4: on May 13, 2023, Saturday with Instructor AP ////


package nb_cl7_oop1continued_pkg;

public class NB_cl7notes_oop5_FinalKeyword {

	// Interview Q&A:- Do you know what final keyword does?
		// It finalizes the variable assignment or the value at the declarations
		// it also finalizes the method as long as we use at the front of access modifiers 
			//	so that it cannot be modified by others even after inheritance
	
	
	
	// ==============================================================
	
	
	
// Example 1:	
	
	public static void main(String[] args) {

		final int a = 50;
		System.out.println(a);     // 50
		System.out.println("======1=======");
		
		System.out.println(abc);   // 100
		System.out.println("======2=======");
		
		NB_cl7notes_oop5_FinalKeyword.a = 99;   // 50
//		NB_cl7notes_oop5.a;  // errors out since a is already finalized, you cannot have another variable with different or same value		
			// takes the global value of a since it is referring to the a of the class
		System.out.println(a);

		
	}
	
	public static int a = 200;
	
	final public static int abc = 100;

}
