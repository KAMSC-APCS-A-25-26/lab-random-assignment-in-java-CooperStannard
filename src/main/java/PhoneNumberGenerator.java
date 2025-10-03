import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation

        Random rand = new Random();

        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int Num1 = rand.nextInt(8);
        int Num2 = rand.nextInt(8);
        int Num3 = rand.nextInt(8);
        // TODO: Generate second three digits (XXX) 

        // Constraint: Must be <= 742 (000-742)
        int secondNum = rand.nextInt(99,743);

        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int thirdNum = rand.nextInt(99, 1000);

        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        //System.out.println("" + Num1 + Num2 + Num3 + "-"+ secondNum + "-"+ thirdNum);
    }
}
