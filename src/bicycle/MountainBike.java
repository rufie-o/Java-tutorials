package bicycle;

public class MountainBike extends Bicycle {

    // new fields and methods defining
    // a mountain bike would go here
    String type = "Mountain bike";
    String bikeName;

    // Constructor
    MountainBike(){
        this.bikeName = "Peter"; 
        System.out.println(this.bikeName);
        System.out.println("test");
    }

    public void giveName(String name){
        this.bikeName = name;
    }

    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " name:" +bikeName);
    }
}