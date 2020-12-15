
class PrePostDemo {

    public static void main(String[] args) {
        int bitmask = 0xF11F;
        int val = 0xF223;
        // prints "2"
        System.out.println(Integer.toString((val & bitmask),2));
        System.out.println(Integer.toString((val & bitmask),16));

    }
}