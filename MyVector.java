package Package0;

import java.util.*;

public class MyVector {
	private ArrayList<Double> elements = new ArrayList<Double>();
	
	//Class Default Constructor, vectors created with double array
	public MyVector(double[] initValues) {
		for(int i = 0; i < initValues.length; i++) {
			this.elements.add(initValues[i]);
		}
	}
		
	//Class Copy Constructor, vectors created with another vector
	public MyVector(MyVector vector) {
		this.elements = vector.elements;
	}

	//Getter function to get a vector element at an index
	public double getElement(int element) {
		double rtnValue = 0.0;
		for(int i = 0; i < this.elements.size(); i++) {
			if(i == element) {
				rtnValue =  this.elements.get(i);
			}
		}
		return rtnValue;
	}
	
	//Plus function allows vector addition
	public MyVector plus(MyVector x) {
		double[] sumValues = new double[this.elements.size()];
		
		//Loop allows us to compare each vector element by element
		for(int i = 0; i < this.elements.size(); i++) {
			double value = (this.elements.get(i) + x.elements.get(i));
			//Round is used to eliminate any floating point errors 
			sumValues[i] = (Math.round(value * 10.0) / 10.0);;
		}
		MyVector sumVector = new MyVector(sumValues);
		
		return sumVector;
	}
	
	//Minus function allows vector subtraction
	public MyVector minus(MyVector x) {
		double[] diffValues = new double[this.elements.size()];
		
		//Loop allows us to compare each vector element by element
		for(int i = 0; i < this.elements.size(); i++) {
			double value = this.elements.get(i) - x.elements.get(i);
			//Round is used to eliminate any floating point errors 
			diffValues[i] = (Math.round(value * 10.0) / 10.0);
		}
		MyVector sumVector = new MyVector(diffValues);
		
		return sumVector;
	}
	
	//Dot-product function
	public double dot(MyVector x) {
		double result = 0.0;
		
		//Loop allows us to compare each vector element by element
		for(int i = 0; i < this.elements.size(); i++) {
			result += (this.getElement(i) * x.getElement(i));
		}
		//Round is used to eliminate any floating point errors
		return (Math.round(result * 10.0) / 10.0);
	}
	
	//Scalar-product allows vector multiplication
	public MyVector scaledBy(double x) {
		for(int i = 0; i < this.elements.size(); i++) {
			double scaledValue = this.getElement(i) * x;
			//Round is used to eliminate any floating point errors
			this.elements.set(i, (Math.round(scaledValue * 10.0) / 10.0));
		}
		return this;
	}
	
	//Override the toString method to allow us to print the vector
	@Override
	public String toString() {
		String vecStr = "";
		for(int i = 0; i < this.elements.size() - 1; i++) {
			vecStr += this.getElement(i) + ", ";
		}
		//This line stops our vector from printing with a trailing comma
		vecStr += this.getElement(this.elements.size() - 1 );
		return vecStr;
	}
	
	//Absolute value function
	public static double abs(MyVector x) {
		double absValue = x.dot(x);
		absValue = Math.sqrt(absValue);
		return absValue;
	}
	
	//Overrides the equals function to allow vector comparisons
	public Boolean equals(MyVector x, MyVector y) {
		//If vectors don't have the same number of elements, they can't be equal
		if(x.elements.size() != y.elements.size()) {
			return false;
		}
		//Check each element in both vectors and compare to each other
		for(int i = 0; i < y.elements.size(); i++) {
			if(y.getElement(i) != x.getElement(i)) {
				return false;
			}
		}
		return true;
	}
}
