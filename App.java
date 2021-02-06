
public class App {

	public static void main(String[] args) {
		// Intro to Java Week 1 Coding Assignment 		
		
		//using primitive data types - initializing and setting double variables - Question 3(a)
		double itemPrice1 = 4.99; 
		double itemPrice2 = 5.41; 
		
		//using primitive data types - initializing and setting double variables - Question 3(b)
		double moneyInWallet1 = 20.00; 
		double moneyInWallet2 = 45.00; 
		
		//using primitive data types - initializing and setting int variables - Question 3(c)
		int numberFriends1 = 58;  
		int numberFriends2 = 128;  
		
		//using primitive data types - initializing and setting int variables - Question 3(d)
		int age1 = 44; 
		int age2 = 37; 
		
		//using Strings - initializing and setting String variables - Question 3(e)
		String firstName1 = "Jeff"; 
		String firstName2 = "Steve";  
	
		//using Strings - initializing and setting String variables - Question 3(f)
		String lastName1 = "Haupt";  
		String lastName2 = "Dave";  
		
		//using primitive data types - initializing and setting char variables - Question 3(g)
		char middleInitial1 = 'M'; 
		char middleInitial2 = 'K';  
		
		//Creating, initializing, and setting new variables using operations - Question 4
		double newAmountMoney1 = moneyInWallet1 - itemPrice1; 
		double newAmountMoney2 = moneyInWallet2 - itemPrice2;  
		
		//Casting type
		double friendsPerYear1 = (double)numberFriends1 / age1;
		double friendsPerYear2 = (double)numberFriends2 / age2; 
		
		//Concatenation of string variables 
		String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
		String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
		
		//Question 5 - using System.out.println to print to the console
		System.out.println("I have exactly $"+ newAmountMoney1 + " in my wallet.");
		System.out.println("My coworker has exactly $"+ newAmountMoney2 + " in his wallet.");
		System.out.println("\nI have made about "+ friendsPerYear1 + " friends for each year I have been alive.");
		System.out.println("My wife has made about "+ friendsPerYear2 + " friends for each year she has been alive.");
		System.out.println("\nMy full name is "+ fullName1);
		System.out.println("My friend's name is "+ fullName2);

		
	}

}
