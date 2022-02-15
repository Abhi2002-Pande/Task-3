package Internship;

import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	
		
		while(true)
		{
			int num1,num2,ans = 0; 
			System.out.println("Enter Number:");
			 num1=s.nextInt();
			 num2=s.nextInt();
			
			
			char ch;
			System.out.println("Enter Operator:");
			ch=s.next().trim().charAt(0);
			
			
			
			
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%' )
			{
				if(ch=='+')
				{
					ans=num1+num2;
					
				}
				if(ch=='-')
				{
					ans=num1-num2;
					
				}
				if(ch=='/')
				{
					if(num2 !=0) 
					{
					ans=num1/num2;
					}
					
				}
				if(ch=='*')
				{
					ans=num1*num2;
					
				}
				
				if(ch=='%')
				{
					ans=num1%num2;
					
				}
				
			
				
				System.out.println("Ans="+ans);
				
				
			}
			
			
			
		}
		
		

	}

}
