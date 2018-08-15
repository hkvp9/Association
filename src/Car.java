
public class Car {
	
	private Wheel wheels;
	private Engine engine;
	private int x;
	private Seat seat;
	
	Car() {
		
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Car [wheels=" + wheels + ", \n engine=" + engine + ", x=" + x
				+ ", \n seat=" + seat + "]";
	}



	Car(Engine e, Wheel w, Seat s) {
		this.engine = e;
		this.wheels = w;
		this.seat= s;
	}

	
	/*
	 * public Engine(double cylinderCapacity, String engineType,
			int numberOfCylinders, double horsePower) {
	 */
	public static void main(String[] args) {
		//String material, String filler, String brand, String suitableSeason, boolean isInfantSafe, boolean isHeated
		Car c = new Car(new Engine(1.8, "Petrol", 5, 250), new Wheel(34.5, "Tata", 24), new Seat("Leather"," Rocks", " Gortex", " All Weather", false, false));
		System.out.println(c.wheels.getPressure());
	}

}