package com.deloitte.main;
import java.io.*;


abstract class Arithmetic
{
	static double num1,num2,result;
	public abstract void Calculate();
	
	Arithmetic()throws IOException
	{
		//read();
		this.num1=num1;
		this.num2=num2;
	}
	static void read() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the opeation choice :\n");
		//this.num3 = Integer.parseInt(br.readLine());
		System.out.println("Enter the 2 operands : \n");
		num1 =Double.parseDouble(br.readLine());
		num2 =Double.parseDouble(br.readLine());
	}
	public void display()
	{
		System.out.println("\nNumbers entered are : "+num1+" , "+num2+"\nResult : "+result);
	}
	
}
class Addition extends Arithmetic
{
	double n1,n2;
	public Addition() throws IOException
	{
		super();
	}
	public void Calculate()
	{
		result = num1+num2;
	}
}
class Subtraction extends Arithmetic
{
	double n1,n2;
	public Subtraction() throws IOException
	{
		super();
	}
	public void Calculate()
	{
		result = num1-num2;
	}
}
class Multiplication extends Arithmetic
{
	double n1,n2;
	public Multiplication() throws IOException
	{
		super();
	}
	public void Calculate()
	{
		result = num1*num2;
	}
}
class Division extends Arithmetic
{
	double n1,n2;
	public Division() throws IOException
	{
		super();
	}
	public void Calculate()
	{
		try
		{
			result = num1/num2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("\nCannot divide by 0");
		}
	}
}
public class Calculator
{
	static int operand;
	public static void main(String ar[])throws IOException
	{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\t****MY_CALCULATOR*****\n\nOperation choices available are:");
	        System.out.println("\n1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Division");
	        System.out.println("4. Multiplication");
	        System.out.println("Enter operation choice: ");
		operand = Integer.parseInt(br1.readLine());
		Arithmetic operation[] = new Arithmetic[5];
		/*Addition add = new Addition();
		Subtraction sub = new Subtraction();
		Multiplication mult = new Multiplication();
		Division div = new Division();*/
		Arithmetic.read();
		operation[1]= (Addition)new Addition();
		operation[2]= (Subtraction)new Subtraction();
		operation[3]= (Multiplication)new Multiplication();
		operation[4]= (Division)new Division();;
		
		operation[operand].Calculate();
		operation[operand].display();
	}
}