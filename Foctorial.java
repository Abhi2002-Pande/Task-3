package Internship;
import java.util.*;

public class Foctorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num;
		int fact=1;
		int i=0;
		
		System.out.println("Enter Number:");
		num=scanner.nextInt();
		
		
		for (i =1; i<=num;i++) {
			
			
		
			
			fact=fact*i;
			System.out.println("Foctorial of "+ num +" is "+fact);
			
		
		}

	}

}
