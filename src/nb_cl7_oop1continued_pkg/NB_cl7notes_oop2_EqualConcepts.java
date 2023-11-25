
///// JAVA Class 7 part 1: on May 13, 2023, Saturday with Instructor AP ////


package nb_cl7_oop1continued_pkg;

public class NB_cl7notes_oop2_EqualConcepts {

	
	
	// Interview Q&A:
		// What is the keyword used to create object/bridge? --> new
		// What is the main method String args? --> Legacy code created back then, but is now made optional without removing it
	
	// Oop: Object Oriented Programming
	
	//IQA 1:  What does it mean when somebody says that a string is enumerable?
		// Strings are enumerable: in java strings characters are case-sensitive. It won't change it unless you change it. 
			// --> Because they are never created again and again, the reference just changes. 
		// This makes sense for double equal scenarios ---> Heap and CLP storage for where is it created?
	
	//	Heap Storage: a separate pool whenever objects get stored
		// THOUGH SAME VALUE, STILL STORED SEPARATELY SINCE THEY ARE CONSIDERED 2 DIFFERENT PHOTOCOPIES FROM 2 DIFFERENT OBJECTS!! TAKES 2 SPACES THOUGH SAME VALUE
		// it is like 2 different hips or different items in different rooms in the house
	
	// Constants Literal Pool (CLP): this is when they are not stored in objects; SAME VALUE SO KEPT TOGETHER THOUGH DIFFERENT VARIABLES. TAKES ONLY 1 SPACE TO STORE SAME VALUE
		// used when dealing with regular datatypes
		// This is like different items inside the kitchen room only of the same house
	
	// how is it created? --> variable wise or object wise


	// IQA 2: How is string different from other datatype? What's so special about a string?
			// --> String is a non-primitive datatype which means it is a class with which we can create an object off of it if we wanted to.
				// It can also be used as a class to make an object out of it. We can also use it simply like we use other variables

	// IQA 3: What does it mean to use .(dot)equal Vs ==(double)equal?	
			// --> dot equal only cares about what the value is and if they match or not. 
			// --> double equal cares about how and where the value is created & stored in addition to whether the value matches or is correct or not. 
					// Basically, it checks the value first then checks if they were created the same way and stored in the same place or not. 


	
	
	
	
	
	// ========================================================================================
	
	
	
	
	public static void main(String[] args) {
				
		
		String a = "apple";
		String c = "apple";
			// values same so stored together in the same CLP as 1 storage
		
		String b = new String("apple");
		String d = new String ("apple");
			// Values same, how they created same, but where they created is different like if in HEAP STORAGE, they are separate
			// stored separately as 2 different storages though they are literal photocopies
		
		
		if(b==d) {     	// Not Equal, Why? --- because even though they are using objects, it is coming out of 2 different objects
			// b and d are 2 different photocopies which are not on the same page
			// how and where was it created?
		/*
		if(a==c) { 		// Equal
		if(a == b) {		// Not Equal-- because though the value matches, the way it is stored are different
			// --> coz it checks the value plus checks how the values were created and whether they were store in a same place or not. 
		if (a == c) {        // Equal
		if(b.equals(d)) {      	 // Equal ... it only cares to comparing the values, and does not care about how or where they were created.
		if(a.equals(d)) {      	 // Equal
		if(a.equals(b)) {      	 // Equal
		if(a.equals(c)) {		// Equal
		*/	
			System.out.println("Equal");   
		}
		else {
			System.out.println("Not Equal");
		}
	}	
}	
		/*
		// Converting string into a class:
//		String b = new String();  // we have to create an object when you have use the methods for non-static methods
			// value of b is null since we didnt put any inside the small bracket. 
			// if we put ("ball") then the value of b is ball
			
		
//		String a = "apple";  // String is a non-primitive datatype, and also a class type. We can make an object out of it as well. 
		a.toUpperCase();  // this will only change to uppercase for the time being, but won't save it
		String aa = a.toUpperCase();  // this will now save it to the variable 'aa'
		
		// Formula to create an object/bridge:
			// ClassName objectName = new ClassName();
	
	
}
	*/
	
	
		
		
		
		
		
