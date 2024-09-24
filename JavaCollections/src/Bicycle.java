
public class Bicycle {
	/// Three fields
	public int cadence;
	public int gear;
	public int speed;
	
	/// Constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
	}
	
	public Bicycle() {
		cadence = 0;
		gear = 0;
		speed = 0;
	}
	
	// Methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void gearUp() {
		gear += 1;
	}
	
	public void gearDown() {
		gear -= 1;
	}
}
