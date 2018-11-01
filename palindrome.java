package Palindrome;

import java.util.Scanner;
import java.util.Stack;

public class palindrome {
	
	public static void main(String[] args) {
		
		//create a stack to keep the forward sequence of word
		Stack<String> firstLetter = new Stack<String>();
		
		//create a stack to keep the forward sequence of word
		Stack<String> lastLetter = new Stack<String>();	
		System.out.println("Enter a word to check whether it is a Palindrome or not: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		//for loop to push each character in word into firstLetter stack
		for (int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			String s=String.valueOf(c);  
			firstLetter.push(s);
		}

		
		//reverse for loop to push each character in word into lastLetter stack 
		for (int i=input.length()-1 ; i>=0; i--) {
			char c = input.charAt(i);
			String s=String.valueOf(c);  
			lastLetter.push(s);
		}
		
		
		//for loop to compare each character in both stacks
		for (int i=0; i<input.length(); i++) {
			String f = firstLetter.pop();
			String l = lastLetter.pop();

			
			if (!f.equals(l))
				{
				System.out.println("The statement is not a Palindrome.");
				break;
				}
			
			//if f and l are equal and there is no more characters left in the stack...
			//The word is a Palindrome. 
			else if (firstLetter.isEmpty())
				System.out.println("The statement is a Palindrome.");
			}
}
}
