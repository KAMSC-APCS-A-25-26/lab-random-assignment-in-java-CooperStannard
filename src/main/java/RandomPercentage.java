import java.util.Random;
import java.text.DecimalFormat;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        Random unseeded = new Random();
        // 2. One Random object with any seed value (seeded)
        Random seeded = new Random(67);

        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double num1 = unseeded.nextDouble(1.0);
        double num2 = seeded.nextDouble(1.0);

        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        num1 *= 100;
        num2 *= 100;
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below

    }
}