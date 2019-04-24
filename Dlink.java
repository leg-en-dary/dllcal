import java.io.*;
import java.util.*;

class Dlink 
{ 
     static 
     {
          System.loadLibrary("Dlink");
     }

     private native int add(int a, int b);
     private native int sub(int a, int b);
     private native int mult(int a, int b);
     private native int div(int a, int b);
 
     public static void main(String[] args) 
     {
	Scanner sc=new Scanner(System.in);
	int a, b,ch;
	System.out.println("\nEnter value of a : ");
	a = sc.nextInt();
	System.out.println("\nEnter value of b : ");
	b = sc.nextInt();
	
	do
	{
		System.out.println("\nENTER YOUR CHOICE : ");
		System.out.println("\n1 - Add");
		System.out.println("\n2 - Sub");
		System.out.println("\n3 - Mul");
		System.out.println("\n4 - Div");							
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1 : new Dlink().add(a,b);
				 break;

			case 2 : new Dlink().sub(a,b);
				 break;

			case 3 : new Dlink().mult(a,b);
				 break;

			case 4 : new Dlink().div(a,b);
				 break;

			default : System.out.println("Your choice is wrong.");
		}
	}while(ch<5);
     }
}
