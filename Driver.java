/*
Created by: Shelby Jorgensen
For: CS301 - Data Structures
Lab 0
*/

package Package0;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		//Take userInput to allow any vector to be created
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 3 numbers for vector x: ");
		
		//Assign userInput to a double array, then pass that to MyVector constructor
		double[] userVector1 = new double[3];
		for(int i = 0; i < 3; i++) {
			double input = userInput.nextDouble();
			userVector1[i] = input;
		}
		MyVector x = new MyVector(userVector1);
		
		System.out.println("Enter 3 numbers for vector y: ");
		
		double[] userVector2 = new double[3];
		for(int i = 0; i < 3; i++) {
			double input = userInput.nextDouble();
			userVector2[i] = input;
		}
		MyVector y = new MyVector(userVector2);
		
		//Print out vector values (toString function test)
		System.out.println("Vector x: " + x.toString());
		System.out.println("Vector y: " + y.toString());
		
		//Create a new vector z by copying x (Copy constructor test)
		System.out.println("Vector z is created by copying vector x");
		MyVector z = new MyVector(x);
		System.out.println("Vector z: " + z.toString() + "\n");
		
		//Add two vectors together, then assign these values to a new vector (plus function test)
		System.out.println("Vectors x and y will be added and stored to vector z");
		z = x.plus(y);
		System.out.println("z = " + z.toString() + "\n");
		
		//Subtract two vectors from each other, then assign these values to a new vector (minus function test)
		System.out.println("Vectors z and y will be subtracted and stored in vector z");
		z = z.minus(y);
		System.out.println("z = " + z.toString() + "\n");
		
		//Dot product function test
		System.out.println("Dot-product of x and y: " + x.dot(y) + "\n");
		
		//Equals function test, only works if all parts of a vector are equal to each other
		System.out.println("Equals function to check if x and y are equal: " + x.equals(y) + "\n");
		
		//Take a userInput double, and scale each value in vector z by that input (scaled by function test)
		System.out.println("Enter a double you would like to scale z by: ");
		double userScale = userInput.nextDouble();
		System.out.println(z.scaledBy(userScale).toString() + "\n");
		
		//Take the absolute value of vector x (absolute value function test)
		System.out.println("Absolute value of vector x: ");
		double absValue = MyVector.abs(x);
		System.out.println(absValue);
		
		
	}
}
