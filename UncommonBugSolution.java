import java.math.BigInteger;

public class UncommonBugSolution {
    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger y = BigInteger.valueOf(1);
        BigInteger z = x.add(y); // Use BigInteger for arbitrary precision
        System.out.println(z); // Correct result using BigInteger
    }
}