package object_assignment;

import java.util.Scanner;

public class PowerBoat extends Boat{
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
	
	public PowerBoat() {
	}

	public void modifyEngineData(){
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
	
	public void useFuel(){
		Scanner sb = new Scanner(System.in);
		System.out.println("How many gallons of fuel have you used?");
		float fuel = sb.nextFloat();
		if(fuel>fuelLevel){
			System.out.println("You can not use more fuel than is currently available, which is " + this.getFuelLevel() + " gallons.");
		}else{
			this.setFuelLevel((fuelLevel - fuel));
			System.out.println("You now have " + (fuelLevel/fuelCapacity)*100 + " percent fuel remaining.");
		}
		System.out.println();
	}
	
	public void addFuel(){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many gallons of fuel have you added?");
		float fuel = sc.nextFloat();
		if (fuelCapacity<(fuelLevel + fuel)){
			System.out.println("You can not add more fuel than the boat's capacity.");
		}else{
			this.setFuelLevel((fuelLevel + fuel));
			System.out.println("You now have " + (fuelLevel/fuelCapacity)*100 + " percent fuel remaining.");
		}
		System.out.println();
	}

	@Override
	public void sinkBoat() {
		System.out.println(this.getBoatName() + " sank.");
		this.setMoving(false);
		this.setFloating(false);
		System.out.println();
	}

	@Override
	public void anchorBoat() {
		System.out.println(this.getBoatName() + " is now anchored.");
		this.setMoving(false);
		System.out.println();
	}

	@Override
	public void modifySize() {
		Scanner sd = new Scanner(System.in);
		System.out.println("How much are you changing the boat's length in feet?");
		float change = sd.nextFloat();
		this.setLength(length+change);
		System.out.println();
	}

	@Override
	public void moveBoat() {
		System.out.println("Let's try to move " + this.getBoatName());
		this.setMoving(true);
	}


	public String getBoatName() {
		return boatName;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public String isFloating() {
		if(isFloating){
			return "is";
		}else{
			return "is not";
		}
	}

	public void setFloating(boolean isFloating) {
		this.isFloating = isFloating;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String isMoving() {
		if(isMoving){
			return "is";
		}else{
			return "is not";
		}
	}

	public void setMoving(boolean isMoving) {
		if (isMoving == true && isFloating == false){
			System.out.println("I'm sorry your boat is not floating and cannot move. Please quit and make a new boat.");
		}else{
		this.isMoving = isMoving;
		}
		System.out.println();
	}

	public String getBoatModel() {
		return boatModel;
	}

	public void setBoatModel(String boatModel) {
		this.boatModel = boatModel;
	}

	public int getNumEngines() {
		return numEngines;
	}

	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}

	public int getTotalHP() {
		return totalHP;
	}

	public void setTotalHP(int totalHP) {
		this.totalHP = totalHP;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(float fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public float getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(float fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public void getStatus(){
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
		System.out.println("-Fuel Level: " + (this.getFuelLevel()/this.getFuelCapacity())*100 + " percent currently");
		System.out.println();
	}
	
}
