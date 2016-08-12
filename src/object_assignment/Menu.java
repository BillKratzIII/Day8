package object_assignment;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// create new PowerBoat Object
		PowerBoat newBoat = new PowerBoat();
		// Call method to build your boat
		newBoat = createBoat();
		// call method with options to use or modify your boat
		runMenu(newBoat);
	}

	// method with menu options to use the program
	public static void runMenu(PowerBoat theBoat) {
		boolean runProgram = true;
		while (runProgram) {
			Scanner sg = new Scanner(System.in);
			printMenu();
			int choice = sg.nextInt();

			switch (choice) {
			case 1:
				theBoat.getStatus();
				break;

			case 2:
				theBoat.anchorBoat();
				break;

			case 3:
				theBoat.sinkBoat();
				break;

			case 4:
				theBoat.modifySize();
				break;

			case 5:
				theBoat.moveBoat();
				break;

			case 6:
				theBoat.useFuel();
				break;

			case 7:
				theBoat.addFuel();
				break;

			case 8:
				theBoat.modifyEngineData();
				break;

			case 9:
				System.out.println("Goodbye");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Entry");
				break;
			}
		}
	}

	// method to create a boat based on user input
	public static PowerBoat createBoat() {
		Scanner sf = new Scanner(System.in);
		Scanner sg = new Scanner(System.in);
		PowerBoat myBoat = new PowerBoat();
		System.out.println("What is the name of your power boat?");
		String userInput = sf.nextLine();
		myBoat.setBoatName(userInput);
		System.out.println("Is your boat floating. Enter 1 for Yes or 0 for No.");
		int i = sf.nextInt();
		if (i == 1) {
			myBoat.setFloating(true);
		} else {
			myBoat.setFloating(false);
		}
		System.out.println("Enter the length of your boat in feet.");
		float f = sf.nextFloat();
		myBoat.setLength(f);
		System.out.println("What is the model of your boat?");
		String userInputA = sg.nextLine();
		myBoat.setBoatModel(userInputA);
		System.out.println("Is your boat moving? Enter 1 for Yes or 0 No.");
		i = sf.nextInt();
		if (i == 1) {
			myBoat.setMoving(true);
		} else {
			myBoat.setMoving(false);
		}
		System.out.println("How many engines does your boat have?");
		i = sf.nextInt();
		myBoat.setNumEngines(i);
		System.out.println("What is your boat's total horsepower?");
		i = sf.nextInt();
		myBoat.setTotalHP(i);
		System.out.println("What is your boat's maximum speed in MPH");
		f = sf.nextFloat();
		myBoat.setMaxSpeed(f);
		System.out.println("What is your boat's fuel capacity in gallons?");
		f = sf.nextFloat();
		myBoat.setFuelCapacity(f);
		System.out.println("How much fuel is in your boat now?");
		f = sf.nextFloat();
		if (f > myBoat.getFuelCapacity()) {
			System.out.println("Error, can not enter more fuel than boat's fuel capacity.");
			myBoat.addFuel();
		} else {
			myBoat.setFuelLevel(f);
		}
		myBoat.getStatus();
		return myBoat;
	}

	// method to print menu options
	public static void printMenu() {
		System.out.println("1 - Check Status");
		System.out.println("2 - Anchor Boat");
		System.out.println("3 - Sink Boat");
		System.out.println("4 - Modify Size");
		System.out.println("5 - Move Boat");
		System.out.println("6 - Use Fuel");
		System.out.println("7 - Add Fuel");
		System.out.println("8 - Modify Engine(s)");
		System.out.println("9 - Quit Program");
	}

}
