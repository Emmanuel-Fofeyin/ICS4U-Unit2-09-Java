/*
* This is the Vehicle class.
*
* @author  Emmanuel Fofeyin
* @version 1.0
* @since   2024-05-22
*/

/**
* This is the Vehicle class.
*/
public class Vehicle {
    /**
     * numberOfTires.
    */
    protected int numberOfTires;

    /**
     * The color of the bike.
     */
    private String color;

    /**
     * The maxSpeed of the bike.
     */
    private final int maxSpeed;

    /**
     * The speed of the bike.
     */
    protected int speed;

    /**
     * Constructor to initialize a vehicle.
     *
     * @param color    The color of the vehicle.
     * @param maxSpeed The maximum speed of the vehicle.
     */
    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.numberOfTires = 1;
    }

    /**
     * Gets the color of the vehicle.
     *
     * @return The color of the vehicle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the current speed of the vehicle.
     *
     * @return The current speed of the vehicle.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the maximum speed of the vehicle.
     *
     * @return The maximum speed of the vehicle.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Gets number of tires.
     *
     * @return get tires
     */
    public int getNumberOfTires() {
        return this.numberOfTires;
    }

    /**
     * Sets the color of the vehicle.
     *
     * @param color The color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * The status method.
     */
    public void status() {
        System.out.println(" -> Speed: " + this.speed);
        System.out.println(" -> Max Speed: " + this.maxSpeed);
        System.out.println(" -> Color: " + this.color);
        //System.out.println(" -> Number of tires: " + this.numberOfTires);
    }

    /**
     * The accelerate method.
     *
     * @param accelerationPower The power of acceleration.
     * @param accelerationTime  The time for acceleration.
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        speed = (accelerationPower * accelerationTime) + speed;
        // check if speed exceeds max speed
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    /**
     * The break method.
     *
     * @param brakePower The power of the brake.
     * @param brakeTime  The time for braking.
     */
    public void brake(int brakePower, int brakeTime) {
        speed = speed - (brakePower * brakeTime);
        // check if speed is less than 0, because speed can't be negative!
        if (speed < 0) {
            speed = 0;
        }
    }
}
