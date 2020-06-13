package com.practice;

import javax.print.DocFlavor.CHAR_ARRAY;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Example1 {
	
	public static void main(String[] args) {
		
		
		 String a="awdhesh";
		  String s[]=a.split("");
		   String String = "";
		   String c="";
		  System.out.println(a.length());
		 for(int i=a.length()-1;i>=0;i--) {
			 c=c+s[i];
//			 c= String+s[i];
			 }
		 System.out.println(c);
		 String m="My name is Mrinal Kumar";
		
		 // Kumar Mrinal is Name My
		 String m1[]=m.split(" ");
		 String m2="";
		 for(int i=4;i>=0;i--) {
		m2=m2+m1[i]+" ";
		System.out.print(m1[i]+" ");
	
	
		 }
		 String m3="name is Mrinal Kumar";
			System.out.println();
			StringBuffer sb= new StringBuffer(m3);
			System.out.println(sb.reverse());
			
//		 System.out.println(m2);
//		 String b1=String+a.charAt(i);
		 
		  char b[]=a.toCharArray();
		 
		  
		 
		 
				String x[]={"abcd", "Pune", "623", "Mumbai", "10"};
				int NumericNumber=0,NonNumericNumber=0;

				
				System.out.println("Array elements are: ");
				for(int i=0; i<x.length; i++){
					System.out.println(x[i]);
				}

				
				for(int i=0; i<x.length; i++)
				{
					try
					{
						int j=Integer.parseInt(x[i]);
						NumericNumber++;
					}
					catch(NumberFormatException e)
					{
						NonNumericNumber++;
					}
				}
				
				System.out.println("Total number of numeric String:"+NumericNumber+"\nTotal number of non numeric string:"+NonNumericNumber);
			}
	 
	

	}

