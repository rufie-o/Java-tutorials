package bicycle;

public class BicycleDemo {
    
    //public void runDemo() {
    public static void main(String[] args) {
        // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        MountainBike bike2 = new MountainBike();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        System.out.println(bike1.type);
        System.out.println(bike2.type);
        // bike2.giveName("John Doe");
        // System.out.println(bike2.bikeName);
        
        System.out.println("bike1 instanceof MountainBike: "
        + (bike1 instanceof MountainBike));

        System.out.println("bike2 instanceof Bicycle: "
        + (bike2 instanceof Bicycle));

        System.out.println("bike2 instanceof MountainBike: "
        + (bike2 instanceof MountainBike));

        System.out.println("bike2 instanceof IntBicycle: "
        + (bike2 instanceof IntBicycle));

    }
}