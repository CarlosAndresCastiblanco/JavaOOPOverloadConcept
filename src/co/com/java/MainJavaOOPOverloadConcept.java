package co.com.java;


/**
 * @author carlos.castiblanco
 *
 */

public class MainJavaOOPOverloadConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("MainJavaOOPOverloadConcept");

	}

}

//Java program to demonstrate the working of method
//overloading by changing the number of parameters

class MethodOverloading {
	
	// 1 parameter
	void show(int num1)
	{
		System.out.println("number 1 : " + num1);
	}

	// 2 parameter
	void show(int num1, int num2)
	{
		System.out.println("number 1 : " + num1
						+ " number 2 : " + num2);
	}

	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
	
		// 1st show function
		obj.show(3);
	
		// 2nd show function
		obj.show(4, 5);
	}
}

//Java program to demonstrate the working of method
//overloading by changing the Datatype of parameter

class MethodOverloadingt {

	// arguments of this function are of integer type
	static void show(int a, int b)
	{
		System.out.println("This is integer function ");
	}

	// argument of this function are of float type
	static void show(double a, double b)
	{
		System.out.println("This is double function ");
	}

	public static void main(String[] args)
	{
		// 1st show function
		show(1, 2);
	
		// 2nd show function
		show(1.2, 2.4);
	}
}

//Java program to demonstrate the working of method
//overloading by changing the sequence of parameters

class MethodOverloadingc {

	// arguments of this function are of int and char type
	static void show(int a, char ch)
	{
		System.out.println("integer : " + a
						+ " and character : " + ch);
	}

	// argument of this function are of char and int type
	static void show(char ch, int a)
	{
		System.out.println("character : " + ch
						+ " and integer : " + a);
	}

	public static void main(String[] args)
	{
		// 1st show function
		show(6, 'G');

		// 2nd show function
		show('G', 7);
	}
}

//Java program to demonstrate the
//working of operator overloading

class GFG {

	// function for adding two integers
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println(" Addition of two integer :"
						+ sum);
	}

	// function for concatenating two strings
	void add(String s1, String s2)
	{
		String con_str = s1 + s2;
		System.out.println("Concatenated strings :"
						+ con_str);
	}

	public static void main(String args[])
	{
		GFG obj = new GFG();
	
		// addition of two numbers
		obj.add(10, 10);
	
		// concatenation of two string
		obj.add("Operator ", " overloading ");
	}
}

//Java program to demonstrate working of method
//overloading in Java

class Sum {

	// Overloaded sum(). This sum takes two int parameters
	public int sum(int x, int y) { return (x + y); }

	// Overloaded sum(). This sum takes three int parameters
	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}

	// Overloaded sum(). This sum takes two double
	// parameters
	public double sum(double x, double y)
	{
		return (x + y);
	}

	// Driver code
	public static void main(String args[])
	{
		Sum s = new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
	}
}

//Java Program to Illustrate Method Overloading
//By Changing the Number of Parameters

//Importing required classes

//Class 1
//Helper class
class Productc {

	// Method 1
	// Multiplying two integer values
	public int multiply(int a, int b)
	{
		int prod = a * b;
		return prod;
	}

	// Method 2
	// Multiplying three integer values
	public int multiply(int a, int b, int c)
	{
		int prod = a * b * c;
		return prod;
	}
}

//Class 2
//Main class
class GFGc {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of above class inside main()
		// method
		Productc ob = new Productc();

		// Calling method to Multiply 2 numbers
		int prod1 = ob.multiply(1, 2);

		// Printing Product of 2 numbers
		System.out.println(
			"Product of the two integer value :" + prod1);

		// Calling method to multiply 3 numbers
		int prod2 = ob.multiply(1, 2, 3);

		// Printing product of 3 numbers
		System.out.println(
			"Product of the three integer value :" + prod2);
	}
}

//Java Program to Illustrate Method Overloading
//By Changing Data Types of the Parameters

//Class 1
//Helper class
class Productt {

	// Multiplying three integer values
	public int Prod(int a, int b, int c)
	{

		int prod1 = a * b * c;
		return prod1;
	}

	// Multiplying three double values.
	public double Prod(double a, double b, double c)
	{

		double prod2 = a * b * c;
		return prod2;
	}
}

class GFGt {
	public static void main(String[] args)
	{

		Productt obj = new Productt();

		int prod1 = obj.Prod(1, 2, 3);
		System.out.println("Product of the three integer value :" + prod1);
		double prod2 = obj.Prod(1.0, 2.0, 3.0);
		System.out.println("Product of the three double value :" + prod2);
	}
}

//Java Program to Illustrate Method Overloading
//By changing the Order of the Parameters

//Class 1
//Helper class
class Studento {

	// Method 1
	public void StudentId(String name, int roll_no)
	{
			System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
	}
	// Method 2
	public void StudentId(int roll_no, String name)
	{
		// Again printing name and id of person
		System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
	}
}

//Class 2
//Main class
class GFGo {

	public static void main(String[] args)
	{

		// Creating object of above class
		Studento obj = new Studento();

		// Passing name and id
		// Note: Reversing order
		obj.StudentId("Spyd3r", 1);
		obj.StudentId(2, "Kamlesh");
	}
}

class Demo {
	public void show(int x)
	{
		System.out.println("In int" + x);
	}
	public void show(String s)
	{
		System.out.println("In String" + s);
	}
	public void show(byte b)
	{
		System.out.println("In byte" + b);
	}
}
class UseDemo {
	public static void main(String[] args)
	{
		byte a = 25;
		Demo obj = new Demo();

		// it will go to
		// byte argument
		obj.show(a);

		// String
		obj.show("hello");

		// Int
		obj.show(250);

		// Since char is
		// not available, so the datatype
		// higher than char in terms of
		// range is int.
		obj.show('A');

		// String
		obj.show("A");

		// since float datatype
		// is not available and so it's higher
		// datatype, so at this step their
		// will be an error.
		obj.show(7.5);
	}
}

//A Java program with overloaded main()
class Testm {

	// Normal main()
	public static void main(String[] args)
	{
		System.out.println("Hi Geek (from main)");
		Testm.main("Geek");
	}

	// Overloaded main methods
	public static void main(String arg1)
	{
		System.out.println("Hi, " + arg1);
		Testm.main("Dear Geek", "My Geek");
	}
	public static void main(String arg1, String arg2)
	{
		System.out.println("Hi, " + arg1 + ", " + arg2);
	}
}

/*package whatever //do not write package name here */
class Mainn {
	public int foo() { return 10; }

	// compiler error: foo() is already defined
	public char foo() { return 'a'; }

	public static void main(String args[])
	{
	}
}

//Java program to demonstrate the working of method
//overloading in static methods
class Mains {

	public static int foo(int a) { return 10; }
	public static char foo(int a, int b) { return 'a'; }

	public static void main(String args[])
	{
		System.out.println(foo(1));
		System.out.println(foo(1, 2));
	}
}

//Java program to demonstrate working of method
//overloading in methods
class A {
	public int foo(int a) { return 10; }

	public char foo(int a, int b) { return 'a'; }
}

class Mainoo {

	public static void main(String args[])
	{
		A a = new A();
		System.out.println(a.foo(1));
		System.out.println(a.foo(1, 2));
	}
}

