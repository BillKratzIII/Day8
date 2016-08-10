package day8examples;

import java.util.Scanner;

public class CarDealership {

	public static void main(String[] args) {
		boolean userFailed = false;
		Scanner sc = new Scanner(System.in);
		Car car1 = new Car(); 
		String userInputB = null;
		int carPart;
		
		
			System.out.println("Welcome to the car dealership!");
			System.out.println("What kind of car are you looking for?");
			String userInputA = sc.nextLine();
		do {
			System.out.println("How many doors would you like?");
			userInputB = sc.nextLine();
			userFailed = numberIsValid(userInputB);
		} while (userFailed);
		carPart = Integer.parseInt(userInputB);
		car1.setNumDoors(carPart);
		
		do{
			userFailed = false;
			System.out.println("How many windows would you like?");
			userInputB = sc.nextLine();
			userFailed = numberIsValid(userInputB);
		}while (userFailed);
		carPart = Integer.parseInt(userInputB);
		car1.setNumWindows(carPart);
		
		System.out.println("What color car would you like?");
		userInputB = sc.nextLine();
		car1.setColor(userInputB);
		
		do{
			userFailed = false;
			System.out.println("How many seats would you like?");
			userInputB = sc.nextLine();
			userFailed = numberIsValid(userInputB);
		}while (userFailed);
		carPart = Integer.parseInt(userInputB);
		car1.setNumSeats(carPart);
		
		do{
			userFailed = false;
			System.out.println("How many wheels would you like?");
			userInputB = sc.nextLine();
			userFailed = numberIsValid(userInputB);
		}while (userFailed);
		carPart = Integer.parseInt(userInputB);
		car1.setNumWheels(carPart);
		
		System.out.println("What model car would you like?");
		userInputB = sc.nextLine();
		car1.setModel(userInputB);
		
	System.out.println(car1.toString());	
	}//end of main
	
	public static boolean numberIsValid(String a){
		try{
			int i = Integer.parseInt(a);
			return false;
		}catch(NumberFormatException e){
			System.out.println("Invalid Entry, must be a number.");
			return true;
		}
	}

}//end of class
