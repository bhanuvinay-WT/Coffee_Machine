package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static int cups = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Writing steps to make a coffee
        /*
         * System.out.println("Starting to make a coffee\n" + "Grinding coffee beans\n"
         * + "Boiling water\n" + "Mixing boiled water with crushed coffee beans\n" +
         * "Pouring coffee into the cup\n" + "Pouring some milk into the cup\n" +
         * "Coffee is ready!");
         */
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();
        ingredientsNeeded();
        scanner.close();
    }

    /*
     * calculating the amount of ingredients needed to make coffee for a given
     * number of people
     */
    public static void ingredientsNeeded() {
        System.out.println("For "+cups +" cups of coffee you will need:");
        System.out.println(cups*200+" ml of water");
        System.out.println(cups*50+" ml of milk");
        System.out.println(cups*15+" of coffee beans");

    }
}
