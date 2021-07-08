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
        String choice = "abc";
        while (!choice.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            choice = scanner.next();
            switch (choice) {
                case "back":
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String buyChoice = scanner.next();

                    try {
                        Double newChoice = Double.parseDouble(buyChoice);
                        if (newChoice == 1)
                            espressoPrice();
                        else if (newChoice == 2)
                            lattePrice();
                        else
                            cappuccinoPrice();
                        break;
                    } catch (NumberFormatException e) {
                        break;
                    }

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    water = water + scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk = milk + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans = beans + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cups = cups + scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    coffeeMachineData();
                    break;
                case "exit":
                    break;
            }

        }
        scanner.close();
    }

    // To display Data in coffee machine
    public static void coffeeMachineData() {
        System.out.println("The coffee machine has:\n" + water + " ml of water\n" + milk + " ml of milk\n" + beans
                + " g of coffee beans\n" + cups + " disposable cups\n" + "$" + money + " of money");
    }

    // to Calculate the price for espresso and displaying the status
    public static void espressoPrice() {
        if (water < 250)
            System.out.println("Sorry, not enough water!");
        else if (beans < 16)
            System.out.println("Sorry, not enough beans!");
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 250;
            beans = beans - 16;
            cups = cups - 1;
            money = money + 4;
        }
    }

    // to Calculate the price for latte and displaying the status
    public static void lattePrice() {
        if (water < 350)
            System.out.println("Sorry, not enough water!");
        else if (beans < 20)
            System.out.println("Sorry, not enough beans!");
        else if (milk < 75)
            System.out.println("Sorry, not enough milk!");
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 350;
            milk = milk - 75;
            beans = beans - 20;
            cups = cups - 1;
            money = money + 7;
        }
    }

    // to Calculate the price for cappuccino and displaying the status
    public static void cappuccinoPrice() {
        if (water < 200)
            System.out.println("Sorry, not enough water!");
        else if (beans < 12)
            System.out.println("Sorry, not enough beans!");
        else if (milk < 100)
            System.out.println("Sorry, not enough milk!");
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 200;
            beans = beans - 12;
            milk = milk - 100;
            cups = cups - 1;
            money = money + 6;
        }
    }
}
