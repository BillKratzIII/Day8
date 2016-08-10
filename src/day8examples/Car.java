package day8examples;

public class Car extends Vehicle{
	
	public int numDoors = 0;
	public int numWindows = 0;
	public String color = null;
	public int numSeats = 0;
	public int numWheels = 0;
	public String model = null;

	public Car(int numDoors, int numWindows, String color, int numSeats, int numWheels, String model) {
		this.numDoors = numDoors;
		this.numWindows = numWindows;
		this.color = color;
		this.numSeats = numSeats;
		this.numWheels = numWheels;
		this.model = model;
	}
	
	

	public Car() {
	}



	public int getNumDoors() {
		return numDoors;
	}



	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}



	public int getNumWindows() {
		return numWindows;
	}



	public void setNumWindows(int numWindows) {
		this.numWindows = numWindows;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getNumSeats() {
		return numSeats;
	}



	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}



	public int getNumWheels() {
		return numWheels;
	}



	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	@Override
	public void moves() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stops() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "Car [numDoors=" + numDoors + ", numWindows=" + numWindows + ", color=" + color + ", numSeats="
				+ numSeats + ", numWheels=" + numWheels + ", model=" + model + "]";
	}

	
	
	
}
