
import java.util.Scanner;
import javax.swing.*;
public class Calculator 
{
	public static int add(int num1, int num2)
	{
        System.out.println("Addition!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number here:");
        num1 = tryCatch(num1);
        
        System.out.print("Enter your second number here:");
        num2 = tryCatch(num2);
        return num1 + num2;
	}
    public static int sub(int num1, int num2)
    {
                System.out.println("Subtraction!");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your first number here:");
                num1 = sc.nextInt();
                System.out.print("Enter your second number here:");
                num2 = sc.nextInt();
                return num1 - num2;
   }
    public static int div(int num1, int num2)
    {
                System.out.println("Division!");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your first number here:");
                num1=tryCatch(num1);
                System.out.print("Enter your second number here:");
                num2=tryCatch(num2);
                return num1 / num2;
   }
    public static int multi(int num1, int num2)
    {
                System.out.println("Multiplication!");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your first number here:");
                num1 = sc.nextInt();
                System.out.print("Enter your second number here:");
                num2 = sc.nextInt();
                return num1 * num2;
   }
    public static int tryCatch(int Try)
    {
    	try
    	{
    	
    		Scanner sc = new Scanner(System.in);
        	Try= sc.nextInt();
        	return Try;
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR!");
        	return tryCatch(Try);
    	}
    }
    
    public static void main(String[] args) 
    {
    	int num1 = 0 , num2 = 0 ;
                        
        System.out.println("Hi, and welcome to Viktor's calculator!");
        System.out.println("Let's decide on what kind of arithmetic operator you would like to use");
        System.out.println("Type \"1\" for addition!");
        System.out.println("Type \"2\" for subtracion!");
        System.out.println("Type \"3\" for division!");
        System.out.println("Type \"4\" for multiplication!");
                        
	    while(true)
	    {
	        System.out.print("Please select what operator to use here:");                                  
	        int Try = 0;
	        int answer=tryCatch(Try);
			if(answer==1)
		    {
		        int sum = add(num1, num2);
		        
		        System.out.println("Your answer is: " + sum);           
		        continue;
		    }
		    else if(answer==2)
		    {                                               
		        int sum = sub(num1, num2);
		        
		        System.out.println("Your answer is: " + sum);           
		            continue;
		    }	
		    else if(answer==3)
		    {
		        int sum = div(num1, num2);
		        
		        System.out.println("Your answer is: " + sum);
		        continue;
		    }
		    else if(answer==4)
		    {
		        int sum = multi(num1, num2);
		                
		        System.out.println("Your answer is: " + sum);
		        System.out.println("Your answer is: " + sum);
		        continue;
		    }
		    else
		    {
		        System.out.println("Type one of the following numbers: 1, 2, 3, 4 !");
		        continue;
		    }
	    }
    }
}

