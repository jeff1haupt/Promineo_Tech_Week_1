
public class App {

	public static void main(String[] args) {
		// Intro to Java Week 1 Coding Assignment
		
		double itemPrice1 = 4.99; //3(a)
		double itemPrice2 = 5.41; //3(a)
		
		double moneyInWallet1 = 20.00; //3(b)
		double moneyInWallet2 = 45.00; //3(b)
		
		int numberFriends1 = 58;  //3(c)
		int numberFriends2 = 128;  //3(c)
		
		int age1 = 44; //3(d)
		int age2 = 37; //3(d)
		
		String firstName1 = "Jeff"; //3(e)
		String firstName2 = "Steve";  //3(e)
		
		String lastName1 = "Haupt";  //3(f)
		String lastName2 = "Dave";  //3(f)
		
		char middleInitial1 = 'M'; //3(g)
		char middleInitial2 = 'K';  //3(g)
		
		// #4 Variables 
		
		double newAmountMoney1 = moneyInWallet1 - itemPrice1;  //4(a)
		double newAmountMoney2 = moneyInWallet2 - itemPrice2;  //4(a)
		
		
		//possible wrong data types??? - Suggestion on Stack Overflow to avoid integer rounding
		double friendsPerYear1 = (double)numberFriends1 / age1; //4(b)
		double friendsPerYear2 = (double)numberFriends2 / age2; //4(b)
		
		String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
		String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
		
		System.out.println("I have exactly $"+ newAmountMoney1 + " in my wallet.");
		System.out.println("My coworker has exactly $"+ newAmountMoney2 + " in his wallet.");
		
		//Question 5 - Average Number of Friends
		System.out.println("\nI have made about "+ friendsPerYear1 + " friends for each year I have been alive.");
		System.out.println("My wife has made about "+ friendsPerYear2 + " friends for each year she has been alive.");
		
		//Question 5 - Names
		System.out.println("\nMy full name is "+ firstName1 + " " + middleInitial1 +". " + lastName1);
		System.out.println("My friend's name is "+ firstName2 + " " + middleInitial2 +". " + lastName2);

		
	}

}
