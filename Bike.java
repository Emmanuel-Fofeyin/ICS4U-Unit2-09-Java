/*
* This is the Bike class.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-05-22
*/

/**
* This is the Bike class.
*/
public class Bike extends Vehicle {
    /**
     * The caadence of the bike.
     */
    private int cadence;

     /**
     * numberOfTires.
    */
    private int numberOfTires;

    /**
     * Constructor to initialize a bike.
     *
     * @param color    The color of the bike.
     * @param maxSpeed The maximum speed of the bike.
     */
    public Bike(String color, int maxSpeed) {
        super(color, maxSpeed);
        this.cadence = 0;
        this.numberOfTires = 2;
    }

    /**
     * Gets the cadence of the bike.
     *
     * @return The cadence of the bike.
     */
    public int getCadence() {
        return cadence;
    }

    /**
     * Sets the cadence of the bike.
     *
     * @param cadence The cadence to set.
     */
    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    /**
     * The status method.
     */
    public void status() {
        super.status();
        System.out.println(" -> Cadence: " + this.cadence);
    }

    /**
     * The accelerate method.
     *
     * @param appliedPower The power of acceleration.
     */
    public void accelerate(int appliedPower) {
        cadence += appliedPower;
    }

    /**
     * The ringBell method.
     */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
