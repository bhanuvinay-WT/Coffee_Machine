package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static int cups = 9;
    public static int milk = 540;
    public static int water = 400;
    public static int beans = 120;
    public static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        coffeeMachineData();
        System.out.println("");
        System.out.println("Write action (buy, fill, take): ");
        String choice = scanner.next();

        switch (choice) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int buyChoice = scanner.nextInt();
                switch (buyChoice) {
                    case 1:
                        espressoPrice();
                        coffeeMachineData();
                        break;
                    case 2:
                        lattePrice();
                        coffeeMachineData();
                        break;
                    case 3:
                        cappuccinoPrice();
                        coffeeMachineData();
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                water = water + scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                milk = milk + scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                beans = beans + scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                cups = cups + scanner.nextInt();
                coffeeMachineData();
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                coffeeMachineData();
                break;
        }
        scanner.close();
    }

    // To display Data in coffee machine
    public static void coffeeMachineData() {
        System.out.println("The coffee machine has:\n" + water + " ml of water\n" + milk + " ml of milk\n" + beans
                + " g of coffee beans\n" + cups + " disposable cups\n" + "$" + money + " of money");
    }

    // to Calculate the price for espresso
    public static void espressoPrice() {
        water = water - 250;
        beans = beans - 16;
        cups = cups - 1;
        money = money + 4;
    }

    // to Calculate the price for latte
    public static void lattePrice() {
        water = water - 350;
        milk = milk - 75;
        beans = beans - 20;
        cups = cups - 1;
        money = money + 7;
    }

    // to Calculate the price for cappuccino
    public static void cappuccinoPrice() {
        water = water - 200;
        beans = beans - 12;
        milk = milk - 100;
        cups = cups - 1;
        money = money + 6;
    }
}
