package bicycle;

interface IntBicycle {

    // wheel revolutions per minute
    void changeCadence(int newValue);

    // selected gear
    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

public class Bicycle implements IntBicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    String type = "Bike";

    // Constructor
    public void bicycle(){

        System.out.println("test");
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}