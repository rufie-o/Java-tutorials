package bitwise;

public class BinaryMask {

    public void runDemo() {
        int bitmask = 0xF11F;
        int val = 0xF223;
        // prints "2"
        System.out.println(Integer.toString((val & bitmask),2));
        System.out.println(Integer.toString((val & bitmask),16));

    }
}