package com.exam;

public class Question12 {

		public static void main(String[] args)
		{
			String str1 = "Java Exercise";
			String str2 = "Java Exercise";
	 
			String e = "se";
			boolean ends1 = str1.endsWith(e);
			boolean ends2 = str2.endsWith(e);
			System.out.println("'" + str1 + "' ends with " +"'" + e + "' ? " + ends1);
			System.out.println("'" + str2 + "' ends with " + "'" + e + "' ? " + ends2);
		}
	}
