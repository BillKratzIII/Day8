package object_assignment;

import java.util.Scanner;

public class PowerBoat extends Boat implements FishingBoatInterface {
	String boatName = null;
	boolean isFloating = true;
	float length = 0.0f;
	boolean isMoving = false;
	String boatModel = null;
	int numEngines = 0;
	int totalHP = 0;
	float maxSpeed = 0.0f;
	float fuelCapacity = 0.0f;
	float fuelLevel = 0.0f;
	boolean isFishing = false;

	// constructor
	public PowerBoat() {
	}

	// method to modify engine, get new number of engines, get new total
	// horsepower and new max speed
	public void modifyEngineData() {
		Scanner sa = new Scanner(System.in);
		System.out.println("How many engines does " + this.getBoatName() + " now have?");
		int engines = sa.nextInt();
		this.setNumEngines(engines);
		System.out.println("What is the new total horsepower?");
		int hp = sa.nextInt();
		this.setTotalHP(hp);
		System.out.println("What is the new max speed in mph?");
		float speed = sa.nextFloat();
		this.setMaxSpeed(speed);
		System.out.println();
	}

	// method takes user input for how much fuel is used and updates the fuel
	// level
	public void useFuel() {
		Scanner sb = new Scanner(System.in);
		System.out.println("How many gallons of fuel have you used?");
		float fuel = sb.nextFloat();
		if (fuel > fuelLevel) {
			System.out.println("You can not use more fuel than is currently available, which is " + this.getFuelLevel()
					+ " gallons.");
		} else {
			this.setFuelLevel((fuelLevel - fuel));
			System.out.println("You now have " + (fuelLevel / fuelCapacity) * 100 + " percent fuel remaining.");
		}
		System.out.println();
	}

	// method takes user input for how much fuel was added and updates the fuel
	// level
	public void addFuel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many gallons of fuel have you added?");
		float fuel = sc.nextFloat();
		if (fuelCapacity < (fuelLevel + fuel)) {
			System.out.println("You can not add more fuel than the boat's capacity.");
		} else {
			this.setFuelLevel((fuelLevel + fuel));
			System.out.println("You now have " + (fuelLevel / fuelCapacity) * 100 + " percent fuel remaining.");
		}
		System.out.println();
	}

	// method changes isFloating to false and isMoving to false
	@Override
	public void sinkBoat() {
		System.out.println(this.getBoatName() + " sank.");
		this.setMoving(false);
		this.setFloating(false);
		System.out.println();
	}

	// method changes isMoving to false
	@Override
	public void anchorBoat() {
		System.out.println(this.getBoatName() + " is now anchored.");
		this.setMoving(false);
		System.out.println();
	}

	// method adds or subtracts to boat size based on user input
	@Override
	public void modifySize() {
		Scanner sd = new Scanner(System.in);
		System.out.println("How much are you changing the boat's length in feet?");
		float change = sd.nextFloat();
		this.setLength(length + change);
		System.out.println();
	}

	// method sets is moving to true so long as boat is floating
	@Override
	public void moveBoat() {
		System.out.println("Let's try to move " + this.getBoatName());
		this.setMoving(true);
	}

	// method returns boat name
	public String getBoatName() {
		return boatName;
	}

	// method sets boat name
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	// method returns whether boat is or is not floating
	public String isFloating() {
		if (isFloating) {
			return "is";
		} else {
			return "is not";
		}
	}

	// method sets isFloating to true or false
	public void setFloating(boolean isFloating) {
		this.isFloating = isFloating;
	}

	// method returns length of boat
	public float getLength() {
		return length;
	}

	// method sets boat length
	public void setLength(float length) {
		this.length = length;
	}

	// method returns whether the boat is or isn't moving
	public String isMoving() {
		if (isMoving) {
			return "is";
		} else {
			return "is not";
		}
	}

	// method changes boat to moving only if it's floating or to not moving
	// based on input
	public void setMoving(boolean isMoving) {
		if (isMoving == true && isFloating == false) {
			System.out.println("I'm sorry your boat is not floating and cannot move. Please quit and make a new boat.");
		} else {
			this.isMoving = isMoving;
		}
		System.out.println();
	}

	// method returns boat model
	public String getBoatModel() {
		return boatModel;
	}

	// method set's boat model
	public void setBoatModel(String boatModel) {
		this.boatModel = boatModel;
	}

	// method returns boat's number of engines
	public int getNumEngines() {
		return numEngines;
	}

	// method sets the boat's number of engines
	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}

	// method returns boat's total horsepower
	public int getTotalHP() {
		return totalHP;
	}

	// method sets boat's total horsepower
	public void setTotalHP(int totalHP) {
		this.totalHP = totalHP;
	}

	// method returns boat's maximum speed
	public float getMaxSpeed() {
		return maxSpeed;
	}

	// method sets the boat's maximum speed
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// method returns the boat's fuel capacity
	public float getFuelCapacity() {
		return fuelCapacity;
	}

	// method set's the boats fuel capacity
	public void setFuelCapacity(float fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	// method return's boat's fuel level
	public float getFuelLevel() {
		return fuelLevel;
	}

	// method set's boats fuel level
	public void setFuelLevel(float fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	// method returns the status of all it's variables
	public void getStatus() {
		System.out.println();
		System.out.println(this.getBoatName() + "'s Status:");
		System.out.println("-" + this.isFloating() + " currently floating");
		System.out.println("-Length: " + this.getLength() + "'");
		System.out.println("-" + this.isMoving() + " currently moving");
		System.out.println("-Model: " + this.getBoatModel());
		System.out.println("-Number of engines: " + this.getNumEngines());
		System.out.println("-Total horesepower: " + this.getTotalHP() + "hp");
		System.out.println("-Max speed: " + this.getMaxSpeed() + "mph");
		System.out.println("-Fuel capacity: " + this.getFuelCapacity() + " gallons");
		System.out.println("-Actual fuel available: " + this.getFuelLevel() + " gallons");
		System.out
				.println("-Fuel Level: " + (this.getFuelLevel() / this.getFuelCapacity()) * 100 + " percent currently");
		System.out.println();
	}

	// method sets isFishing to true
	@Override
	public void goFishing() {
		this.isFishing = true;

	}

	// method sets isFIshing to false
	@Override
	public void stopFishing() {
		this.isFishing = false;

	}

}
