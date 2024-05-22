/*
* This is the Truck class.
*
* @author  EMmanuel FN
* @version 1.0
* @since   2024-05-22
*/

/**
* This is the Truck class.
*/
public class Truck extends Vehicle {
    /**
    * The licensePlateNumber of the truck.
    */
    private String licensePlateNumber;

    /**
     * numberOfTires.
    */
    private final int numberOfTires;

    /**
     * Constructor to initialize a truck.
     *
     * @param color             The color of the truck.
     * @param maxSpeed          The maximum speed of the truck.
     * @param licensePlateNumber The license plate number of the truck.
     */
    public Truck(String color, int maxSpeed, String licensePlateNumber) {
        super(color, maxSpeed);
        this.licensePlateNumber = licensePlateNumber;
        this.numberOfTires = 6;
    }

    /**
     * Gets the license plate number of the truck.
     *
     * @return The license plate number of the truck.
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Sets the license plate number of the truck.
     *
     * @param licensePlateNumber The license plate number to set.
     */
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * The status method.
     */
    public void status() {
        super.status();
        System.out.println(" -> License Plate: " + this.licensePlateNumber);
    }

    /**
     * The break method.
     *
     * @param breakPower  The power the brakes were applied with.
     * @param breakTime The time the brakes were applied.
     * @param airPressure The air pressure to apply.
     */
    public void brake(int breakPower, int breakTime, int airPressure) {
        this.speed = this.speed - (breakPower * breakTime) - (airPressure * breakTime);

    }
}
