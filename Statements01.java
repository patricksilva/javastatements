class Statements01 {
	
	public static void main(String[] args){
		
		String statement = "A Java statement is a complete unit of execution, terminated with a semicolon (;).";
		String controlFlow = "Control flow statements break up the flow of execution by using decision making, looping, and branching, allowing the application to selectively execute particular segments of code.";
		String block = "These statements can be applied to single expressions as well as a block of Java code. As described in the previous chapter, a block of code in Java is a group of zero or more statements between balanced braces, ({}), and can be used anywhere a single statement is allowed.";
		String first = "GLOBAL";
		String last = "CODE";
		int[] names = {0, 1, 2, 3, 4, 5, 6};
		int option = 1;
		int minParticipants = 8;
		int room = 5;
		int i = 0;
		int j = 0;
		int hourOfDay = 9;
		int greetingCount = 0;
		int x = 0;
		long y = 0;
		int z = 0;
		boolean a = false;
		boolean b = false;
		
		System.out.printf("Total greetings: %s\n",greetingCount);
		
		//Create if and if/else and ternary constructs
		if( hourOfDay < 11 )
			System.out.println("Good morning");
			greetingCount++; // Based on the indentation, you might be inclined to think the variable greetingCount IS ONLY GOING TO BE INCREMENTED IF the hourOfDay is less than 11, but that’s NOT WHAT THIS CODE DOES.
		
		System.out.printf("Total greetings: %s\n",greetingCount);
		
		if( first != null && (last.length() > 3)) {
			System.out.printf("\n%s %s\n" , first, last);
		}
		
		if ( hourOfDay < 16 )
			System.out.println("Have a nice afternoon");
		else if (hourOfDay < 21)
			System.out.println("Have a nice evening");
		else
			System.out.println("Good night");
			greetingCount++;
		
		System.out.printf("Total greetings: %s\n",greetingCount);
		
		if ( a =! b )
			System.out.printf("\nif Statements must allways evaluate a boolean expression. Zero and one (0 and 1) are not considered boolean values in Java\n");
		
		// TERNARY OPERATOR
		System.out.println("The ternary operator, is the only operator that takes three operands");
		System.out.printf("a: %s\n", a);
		a =! b;
		System.out.printf("a: %s b: %s\n", a, b);		
		// The first operand must be a boolean expression, and the second and third can be ANY EXPRESSION THAT RETURNS A VALUE.
		a =! (b=!a)?false:true;
		System.out.printf("a: %s b: %s\n", a, b);
		
		//* Use a switch statement
		System.out.println("Data types supported by switch statements include the following:");
		System.out.println("int and Integer\nbyte and Byte\nshort and Short\nchar and Character\nString\nenum values");
		switch(option) {
			case (2):
					minParticipants = 12;
					break;
			default:	
					minParticipants = 10; // "default" case is optional, it is not required.
					System.out.println("When there is no \"break\", the next case will will run until it finds a \"break\" or the switch's close curly braces");
			case (1):
					minParticipants = 6;
					//break;
		}
		
		System.out.println(minParticipants);
		
		System.out.println("The case statement value must also be a literal, enum constant, or final constant variable.");
		
		char alphabet = 'a';
		while( alphabet <= 'Z' ) {
			//TODO
			System.out.print(alphabet + " ");
			alphabet++;
		}
		
		
		if(minParticipants > room) {
			do {
				minParticipants--;
			} while(minParticipants > room);
		} else {
			minParticipants++;
		}
		
		
		/*
		Variables declared in the initialization block of a for loop have limited scope and
		are only accessible within the for loop. Be wary of any exam questions in which a variable
		declared within the initialization block of a for loop is available outside the loop.
		Alternatively, variables declared before the for loop and assigned a value in the initialization
		block may be used outside the for loop because their scope precedes the for loop
		creation.
		*/
		for(i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		i = 0;
		// Creating an Infinite Loop
		for( ; ; ) {
			System.out.println("Hello World");
			if(i < 4){
				System.out.println("We must got an error here!");
				break;
			}
			i++;
		}
		// for( ) will not compile.
		
		
		// Adding Multiple Terms to the for Statement
		
		for(y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x);
		
		// Examples that Does NOT compile
		/* Redeclaring a Variable in the Initialization Block
		int x = 0;
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}
		// The compiler stops because of a duplicate variable declaration.
		*/
		x = 0;
		y = 10L;
		for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(x + " ");
		}
		
		// Examples that Does NOT compile
		/* Using Incompatible Data Types in the Initialization Block
		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}
		// The variables in the initialization block must all be of the same type.
		*/
		
		// Examples that Does NOT compile
		/* Using Loop Variables Outside the Loop
		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
		System.out.print(y + " ");
		}
		System.out.print(x); // DOES NOT COMPILE
		// x is defi ned in the initialization block of the loop, and
		// then used after the loop terminates. Since x was only scoped for the loop, using it outside
		// the loop will throw a compiler error.
		*/
		
		// The for-each Statement (specifically designed for iterating over arrays and Collection objects.)
		/* When you see a for-each loop on the exam, make sure the right-hand side is an array
			or Iterable object and the left-hand side has a matching type.
		*/
		
		
		// Why will the following fail to compile?
		// String[] names = new String[3];
		for(int name : names) { // DOES NOT COMPILE
			System.out.print(name + " ");
		}
		
		

	}
}