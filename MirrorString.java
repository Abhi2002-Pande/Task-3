package Internship;

import Internship.StringReverse.StringFormatter;

public class MirrorString {
	public class StringFormatter {  
		public static String reverseWord(String str){  
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println(StringFormatter.reverseWord("my name is Abhishek Uddhav Pande"));  
		    System.out.println(StringFormatter.reverseWord("I am Abhishek Pande"));

	}

}
