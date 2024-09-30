package com.exam;



	public class Repeating_Char26 {

		public String repeat(String str) 
		{
		  int l = str.length();
		  String new_str = "";
		  for (int i = 0; i < l; i++) 
		  {
			new_str += str.substring(i,i+1) + str.substring(i, i+1);
		  }
		  return new_str;
		}
		public static void main (String[] args)
		{
			Repeating_Char26 m= new Repeating_Char26();
			String str =  "Java";
			System.out.println("Given string : "+str);
			System.out.println("Repeating Every Character in String : "+m.repeat(str));
		}
	}

