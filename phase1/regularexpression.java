package com.training;


	import java.util.regex.Pattern;
	public class regularexpression {

		public static void main(String args[])
		{

			System.out.println(Pattern.matches("ashish", "ashish"));// it returns false as the strings doesnt match
			System.out.println(Pattern.matches("ashish", "ashish"));// it returns  true as the strings match

		}
	}

