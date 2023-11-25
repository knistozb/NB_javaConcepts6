
///// JAVA Class 7 part 5.a: on May 13, 2023, Saturday with Instructor AP ////


package nb_cl7_oop1continued_pkg;


import nb_cl7_Oop2_pkg.*;
// import nb_cl7_Oop2_pkg.NB_cl7notes_oop6_Z;
// import nb_cl7_Oop2_pkg.NB_cl7notes_oop6_ZZ;
// Formula:- import newPkgName.newClassName;
// this is to import the package from your main method pkg
// import NewPkgName.*; ==> to bring/connect everything inside that new packages

public class NB_cl7notes_oop6_X {

	
	
	
	// Interview Q&A:- What does the import keyword do in Java?
		// ==> It allows you to connect different packages by importing all the files inside of it so you can manipulate them in your main method
	
	// You can have the same class name in different packages, but you cannot bring them or use them together under same main method

	
	
	
	//==============================================
	
	
	
// Exercise 3:-	
	
	public static void main(String[] args) {


		NB_cl7notes_oop6_ZZ objZZ = new NB_cl7notes_oop6_ZZ();
		objZZ.zz2();

		NB_cl7notes_oop6_ZZ.zz1();
		
	}
}
	
		
	/*
// Exercise 2:-	
	
	public static void main(String[] args) {
		
		NB_cl7notes_oop6_Z objZ = new NB_cl7notes_oop6_Z();
		objZ.z2();   // static to non-static using object

		NB_cl7notes_oop6_Z.z1();   // static to static even if they are in diff pkg as long as you import the pkg
		
	}		
}	
	*/
	
	/*
// Exercise 1:		
		
	public static void main(String[] args) {
	
		NB_cl7notes_oop6_Y objY = new NB_cl7notes_oop6_Y();
		objY.y2();
		
		NB_cl7notes_oop6_X objX = new NB_cl7notes_oop6_X();
			// object/instance/bridgeName can be used to call both static and non-static way
		objX.x2();	
		objX.x1();  // Since x1 is static method, calling it using the className is NOT the proper way
//		x1();  or NB_cl7notes_oop6_X.x1();    --> either one works for static to static
		
		NB_cl7notes_oop6_Y.y1();	// Y1     // you can call static to static as long as you can call using: className.methodName();
		NB_cl7notes_oop6_X.x1();   // X1
		x1();					  // X1
 		
	}

	public static void x1() {
		
		System.out.println("X1");
	}
	
	public void x2() {
		
		System.out.println("X2");
	}
	
}
	*/



