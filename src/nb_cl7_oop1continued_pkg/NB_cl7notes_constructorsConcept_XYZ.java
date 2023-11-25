
///// JAVA Class 7 part 6: on May 13, 2023, Saturday with Instructor AP ////



package nb_cl7_oop1continued_pkg;

public class NB_cl7notes_constructorsConcept_XYZ {

	
	
	
	// CONSTRUCTORs: They are special type of method with following rules:
			// i. Must be same name as ClassName
			// ii. No return Type including void : CAREFUL- void is a return type, but without any value so does not return anything
			// iii. Non-static
		
		// Java has built in constructor, but it won't return anything, and you won't be able to manipulate it unless you make your own. 
	
	// Constructor Overload OF Polymorphism: same name of methods, but differentiated with different arguments
	
	// Interview Q&A 1: What is the purpose of constructors?
		// ==> The main purpose is doing some kind of initialization before we get to use the object to do the actual work.
	
	// Q&A 2: If the initialization is the same, why do you need multiple constructors?
		// ==> If in case I have to deal with 30 test cases, and 10 are same while the other 20 are little different. 
				// I can make different/separate constructors to do those similar test cases to conduct 2 different types of initializations
	
	// Q&A 3: Can the constructor overload have a different name or can they be changed?
		// ==> No, because then it won't fulfill the requirement to become a constructor. It has to be the same name as className. 
			// Unlike for method overload, those 2 names do not have to be the same
	
	// Q&A 4: How many constructors are there?
		// == Two types:
			// i. Default constructors: It is the one like built in Java version (you cannot insert any parameters) or even the one we create that does not take any argument
			// ii. Parameterized or Parameterization constructor:  takes some kind of arguments or input parameters inside the small brackets of the method
	
	// Q&A 5: How do you invoke a constructor?
		// ==> We invoke by creating an object/instance/bridgeName
	
	// Q&A 6: What does it mean to have a constructor overload?
		// ==> It means we can have multiple constructors within the same class with the same className as long as they are differentiated with different arguments/input parameters
	
	
	
	
	// Formula for creating object:
		// Old: className objectName = new className();
		// New: className objectName = new Constructor();
	
	
	
	// =========================================================================
	
	
// Exercise 3:	

	public static void main(String[] args) {
		
		
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ1 = new NB_cl7notes_constructorsConcept_XYZ();
			// By just removing the argument, I am wanting the first constructor to be used here since there is no argument in it vs string argument for the second constructor
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ11 = new NB_cl7notes_constructorsConcept_XYZ("www.techfios.com");
			// Bascially use the constructor to do it here without having to do all below extra steps
		// NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ1 = new NB_cl7notes_constructorsConcept_XYZ();   
		// objNB_cl7notes_constructorsConcept_XYZ1.preWork("www.techfios.com");
		objNB_cl7notes_constructorsConcept_XYZ1.LoginTF();
		
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ2 = new NB_cl7notes_constructorsConcept_XYZ("www.amazon.com");
		// NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ2 = new NB_cl7notes_constructorsConcept_XYZ();   
		// objNB_cl7notes_constructorsConcept_XYZ2.preWork("www.amazon.com");
		objNB_cl7notes_constructorsConcept_XYZ2.LoginAZ();
		
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ3 = new NB_cl7notes_constructorsConcept_XYZ("firefox", "www.facebook.com");
//		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ3 = new NB_cl7notes_constructorsConcept_XYZ("www.facebook.com");
		// NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ3 = new NB_cl7notes_constructorsConcept_XYZ();   
		// objNB_cl7notes_constructorsConcept_XYZ3.preWork("www.facebook.com");
		objNB_cl7notes_constructorsConcept_XYZ3.LoginFB();
		
	}
	
	
	
	// Using more than 1 constructor:
	public NB_cl7notes_constructorsConcept_XYZ() {
		System.out.println("Open Chrome");
		
	}
	
//	public NB_cl7notes_constructorsConcept_XYZ(String url) {
//		System.out.println("Open Chrome");
//		System.out.println("Navigate to " + url);
//	}
	
	public NB_cl7notes_constructorsConcept_XYZ(String browser, String url) {
		System.out.println("Open " + browser);
		System.out.println("Navigate to " + url);
	}
	
	
	// Using 1 constructor:
	public NB_cl7notes_constructorsConcept_XYZ(String url) {
		System.out.println("Open Chrome");
		System.out.println("Navigate to " + url);
	}
		// NK: Basically turn below into a constructor above so you can minimize steps to do the same work

	public void preWork(String url) {
		System.out.println("Open Chrome");
		System.out.println("Navigate to " + url);
	}
	
		
	public void LoginTF() {
		System.out.println("Login to TF");
	}
	
	public void LoginAZ() {
		System.out.println("Login to AZ");
	}
	
	public void LoginFB() {
		System.out.println("Login to FB");
	}	
}	
	
	
	
	/*
// Exercise 2:	
	
	public static void main(String[] args) {
		
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ1 = new NB_cl7notes_constructorsConcept_XYZ(4);   // 4+4 = 8
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ2 = new NB_cl7notes_constructorsConcept_XYZ(5);	// 5+5 = 10
		System.out.println("=========1=================");
		objNB_cl7notes_constructorsConcept_XYZ1.test3();  // this will print all the sysos inside this method, but won't return anything
		System.out.println("============2==============");
	
		System.out.println(objNB_cl7notes_constructorsConcept_XYZ1.test3()); // now this will print all sysos plus print return value of 99
			// now this will print the return value of 99
		System.out.println("===========3===============");
		objNB_cl7notes_constructorsConcept_XYZ1.test3();
			// this will call and return 99, but it won't print that 99 since we haven't asked to print...but it will print other sysos inside 

		System.out.println("================4==========");
//		test3();   
			// have to use some object to call this since it is static to non-static invoking
		
		
	}
		
	public int test3() {
		System.out.println("Testing in progress.");
		return 99;
	}
	
//	public void test3() {
//		System.out.println("TEST3");
//	}
	
	public NB_cl7notes_constructorsConcept_XYZ(int a) {
		
		System.out.println(a+a);
	}	
}	
	*/
	
	/*
//Exercise 1:	

	public static void main(String[] args) {
		
		// CONSTRUCTOR:
			// They are special type of method with following rules:
				// i. Must be same name as ClassName
				// ii. No return Type including void : CAREFUL- void is a return type, but without any value so does not return anything
				// iii. Non-static
			
		// Formula for creating object:
			// Old: className objectName = new className();
			// New: className objectName = new Constructor();
		
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ1 = new NB_cl7notes_constructorsConcept_XYZ();
		// This object invokes the constructor because the second half after new is the exact same as the methodName of the constructor. Thus, it prints the syso of that.
		
		System.out.println("=========1=================");
		
		NB_cl7notes_constructorsConcept_XYZ objNB_cl7notes_constructorsConcept_XYZ2 = new NB_cl7notes_constructorsConcept_XYZ();
		objNB_cl7notes_constructorsConcept_XYZ1.test3();
		System.out.println("=========2=================");
		
		NB_cl7notes_constructorsConcept_XYZ.NB_cl7notes_constructorsConcept_XYZ();
		System.out.println("=========3=================");
		NB_cl7notes_constructorsConcept_XYZ();
		
	}
	
	public static void NB_cl7notes_constructorsConcept_XYZ() {
	// using same className as pkgName is not recommended. It won't error out, but will give you a warning message
	
	}	
		
	public static void test1() {
		
		System.out.println("Its a method");
	}
	
	public NB_cl7notes_constructorsConcept_XYZ() {
		// This has now been converted into a constructor
		
		System.out.println("Its a constructor");
	}
	public void test3() {
		
		System.out.println("TEST3");
	}
	
	public int test4() {
		
		return 0;
	}
}
	*/