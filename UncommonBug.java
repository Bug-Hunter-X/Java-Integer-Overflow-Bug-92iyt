public class UncommonBug {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = 1;
        int z = x + y; // Integer overflow
        System.out.println(z); // Unexpected result due to overflow
    }
}