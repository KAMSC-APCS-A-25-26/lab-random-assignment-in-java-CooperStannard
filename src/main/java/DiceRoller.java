import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        // 2. One Random object with any seed value (seeded die)
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand = new Random(67);

        // TODO: Generate random integers for dice rolls
        int dice1 = rand1.nextInt(6)+1;
        int dice2 = rand2.nextInt(6)+1;
        int dice3 = rand3.nextInt(6)+1;
        int dice = rand.nextInt(6)+1;

        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        System.out.println("Unseeded die 1: " + dice1);
        System.out.println("Unseeded die 2: " + dice2);
        System.out.println("Unseeded die 3: " + dice3);
        System.out.println("Seeded die 1: " + dice);

        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
