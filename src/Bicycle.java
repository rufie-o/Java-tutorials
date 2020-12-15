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

class MountainBike extends Bicycle {

    // new fields and methods defining
    // a mountain bike would go here
    String type = "Mountain bike";
    String bikeName = "";

    public void giveName(String name){
        bikeName = name;
    }

    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " name:" +bikeName);
    }
}