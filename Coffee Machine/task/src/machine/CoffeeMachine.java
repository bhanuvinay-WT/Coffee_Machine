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
            System.out.println("Write how many ml of water the coffee machine has:");
            int water = scanner.nextInt();
            System.out.println("Write how many ml of milk the coffee machine has: ");
            int milk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans the coffee machine has: ");
            int beans = scanner.nextInt();
            System.out.println("Write how many cups of coffee you will need:");
            cups = scanner.nextInt();
            noOfCoffee(water, milk, beans, cups);
            // ingredientsNeeded();
            scanner.close();
        }

        // to Calculate the no of coffee cups can be made depends on the given data
        public static void noOfCoffee(int water, int milk, int beans, int cups) {
            int count = 0;
            while (true) {
                if (water >= 200 && milk >= 50 && beans >= 15) {
                    count++;
                    water = water - 200;
                    milk = milk - 50;
                    beans = beans - 15;

                } else {
                    break;
                }
            }
            if (count == cups)
                System.out.println("Yes, I can make that amount of coffee");
            else if (count < cups)
                System.out.println("No, I can make only " + count + " cup(s) of coffee");
            else
                System.out
                        .println("Yes, I can make that amount of coffee (and even " + (count - cups) + " more than that)");
        }
        /*
         * calculating the amount of ingredients needed to make coffee for a given
         * number of people
         *
         * public static void ingredientsNeeded() { System.out.println("For "+cups
         * +" cups of coffee you will need:");
         * System.out.println(cups*200+" ml of water");
         * System.out.println(cups*50+" ml of milk");
         * System.out.println(cups*15+" of coffee beans");
         *
         * }
         */
}
