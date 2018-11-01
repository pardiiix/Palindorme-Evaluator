package Palindrome;

import java.util.Scanner;
import java.util.Stack;

public class palindrome {
	
	public static void main(String[] args) {
		Stack<String> firstLetter = new Stack<String>();
		Stack<String> lastLetter = new Stack<String>();	
		System.out.println("Enter a word to check whether it is a Palindrome or not: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		for (int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			String s=String.valueOf(c);  
			firstLetter.push(s);
		}

		for (int i=input.length()-1 ; i>=0; i--) {
			char c = input.charAt(i);
			String s=String.valueOf(c);  
			lastLetter.push(s);
		}
		
			for (int i=0; i<input.length(); i++) {
			String f = firstLetter.pop();
			String l = lastLetter.pop();

			
			if (!f.equals(l))
				{
				System.out.println("The statement is not a Palindrome.");
				break;
				}
			else if (firstLetter.isEmpty())
				System.out.println("The statement is a Palindrome.");
			}
}
}
