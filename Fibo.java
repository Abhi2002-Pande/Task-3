package Internship;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int fibo,a=0,b = 1,count=2;
	      
			Scanner s=new Scanner(System.in);
	    System.out.println("Fibo Number:");
	    fibo=s.nextInt();
	    
	while(fibo>=count)

	{ 
		int temp=b;
	  b=b+a;
	 a=temp;
	 count++;
	 
		System.out.println(b);
		
		}

	}

}
