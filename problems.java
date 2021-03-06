6. 

Code:

import java.math.*;

public class OutputTest1 {
	
	public static void main(String args[]){
			System.out.println(5 / 10);
			System.out.println(1 / 2 * 10);
			System.out.println(1.0 / 2 * 10);
			System.out.println(1 / 2.0 * 10);
			System.out.println(13 % 5);
	}
}

Output:

0
0
5.0
5.0
3

7a.

Code:

import java.math.*;

public class OutputTest2 {
	
	public static void main(String args[]){
			double rate = 1.058;
			int balance0 = 100, balance = (int)(balance0 * rate);
			System.out.println(balance);
	}
}

Output:
105

7b. 

Code:

import java.math.*;

public class OutputTest2 {
	
	public static void main(String args[]){
			int miles = 98, gallons = 5;
			double gasMileage = miles/ gallons;
			System.out.println(gasMileage);
	}
}

Output:
19.0

8. 

I tested this by writing a program that would calculate count, and if it returned the same value with fewer partheses,
then those parentheses were therefore unnecessary.

Origianl Code:

import java.math.*;

public class OutputTest {
	
	
	public static int thing(int count, int total, int pages, int words) {
		count += (((total / pages) - 5) * words - 1);
			return count;
	}
	
	public static void main (String args[]){
		
		OutputTest newthing = new OutputTest();
		System.out.println(newthing.thing(2,10,1,5));
	}
}

The output was 26.

The output of this code was also 26 meaning it also functioned with fewer parentheses:

import java.math.*;

public class OutputTest {
	
	
	public static int thing(int count, int total, int pages, int words) {
		count += (((total / pages) - 5) * words - 1);
			return count;
	}
	
	public static void main (String args[]){
		
		OutputTest newthing = new OutputTest();
		System.out.println(newthing.thing(2,10,1,5));
	}
}

The output of this code was -14, meaning it did not function without the parentheses:

import java.math.*;

public class OutputTest {
	
	
	public static int thing(int count, int total, int pages, int words) {
		count += (total / pages) - 5 * words - 1;
			return count;
	}
	
	public static void main (String args[]){
		
		OutputTest newthing = new OutputTest();
		System.out.println(newthing.thing(2,10,1,5));
	}
}

9. 

This is the original code:

import java.math.*;

public class OutputTest4 {
	
	public static void main(String args[]) {
		
		final double g = 16.0;
		double t = 35.5;
		System.out.print("The travel distance is ");
		System.out.println(1 / 2 * (g * t * t));
		
	}
}

The output is the following:

The travel distance is 0.0

So, the code needs to be modified to the following:

import java.math.*;

public class OutputTest4 {
	
	public static void main(String args[]) {
		
		final double g =  16.0;
		double t =  35.5;
		System.out.print("The travel distance is ");
		System.out.println(1.0 / 2 * (g * t * t));
		
	}
}

And the output is: 

The travel distance is 10082.0

12.

The issue in this code is the fact that temp is an int, and when they are switched, temp will take the int value of 
of the double. So, the code should be modified to 

double a,b;
double temp;
...

or, for an even shorter amount of code:

double temp, a, b;

This also functions the same way.

16. 

The code that should be added is the following: 

	double kg;
	double m;
	kg = (double)(lbs * 0.454);
	m = (double)(inches * 0.0254);
	return kg / (m * m);
