package p6;
import java.util.Scanner;

public class Restaurantdemo {
    public static void main(String[] args) {

        int ch, ch1;
        int sum = 0;
        String order = "";
        int quantity;

        FoodItems obj = new FoodItems(10, 15, 140, 80, 50);
        FoodItems obj1 = new FoodItems(15, 20, 145, 85, 55);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("_______MENU______");
            System.out.println("1.Dining          ");
            System.out.println("2 Take Away      ");
            ch1 = sc.nextInt();
            switch (ch1) {
                case 1:
                    while (true) {
                        System.out.println("_______MENU______");
                        System.out.println("1.TEA            " + obj.getTea());
                        System.out.println("2.COFFEE         " + obj.getCoffee());
                        System.out.println("3.BIRIYANI       " + obj.getBiriyani());
                        System.out.println("4.GHEEROAST      " + obj.getNeiroast());
                        System.out.println("5.RICE           " + obj.getRice());
                        System.out.println("6.BILL");
                        System.out.println("7.EXIT");


                        ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                System.out.println("TEA");
                                System.out.println("Enter the quantity");
                                quantity = sc.nextInt();

                                sum = sum + (obj.getTea() * quantity);
                                order = order.concat("TEA" + "\t" + "\t" + "\t" + quantity + "*" + obj.getTea() + "\n");
                                break;
                            case 2:
                                System.out.println("COFFEE");
                                System.out.println("Enter the quantity");
                                quantity = sc.nextInt();

                                sum = sum + (obj.getCoffee() * quantity);
                                order = order.concat("COFFEE" + "\t" + "\t" + quantity + "*" + obj.getCoffee() + "\n");
                                break;
                            case 3:
                                System.out.println("BIRIYANI");
                                System.out.println("Enter the quantity");
                                quantity = sc.nextInt();

                                sum = sum + (obj.getBiriyani() * quantity);
                                order = order.concat("BIRIYANI" + "\t" + "\t" + quantity + "*" + obj.getBiriyani() + "\n");
                                break;
                            case 4:
                                System.out.println("GHEE ROAST");
                                System.out.println("Enter the quantity");
                                quantity = sc.nextInt();

                                sum = sum + (obj.getNeiroast() * quantity);
                                order = order.concat("GHEE ROAST" + "\t" + "\t" + quantity + "*" + obj.getNeiroast() + "\n");
                                break;
                            case 5:
                                System.out.println("RICE");
                                System.out.println("Enter the quantity");
                                quantity = sc.nextInt();

                                sum = sum + (obj.getRice() * quantity);
                                order = order.concat("RICE" + "\t" + "\t" + quantity + "*" + obj.getRice() + "\n");
                                break;
                            case 6:
                                System.out.println("______BILL____" + "\n" + order);
                                System.out.println("______________");
                                System.out.println("total" + "\t" + sum);
                                System.out.println("______________");
                                break;

                            case 7:
                                break;


                        }
                    }

                case 2:
                                while (true) {
                                    System.out.println("_______MENU______");
                                    System.out.println("1.TEA            " + obj1.getTea());
                                    System.out.println("2.COFFEE         " + obj1.getCoffee());
                                    System.out.println("3.BIRIYANI       " + obj1.getBiriyani());
                                    System.out.println("4.GHEEROAST      " + obj1.getNeiroast());
                                    System.out.println("5.RICE           " + obj1.getRice());
                                    System.out.println("6.BILL");
                                    System.out.println("7.EXIT");


                                    ch = sc.nextInt();
                                    switch (ch) {
                                        case 1:
                                            System.out.println("TEA");
                                            System.out.println("Enter the quantity");
                                            quantity = sc.nextInt();

                                            sum = sum + (obj1.getTea() * quantity);
                                            order = order.concat("TEA" + "\t" + "\t" + "\t" + quantity + "*" + obj1.getTea() + "\n");
                                            break;
                                        case 2:
                                            System.out.println("COFFEE");
                                            System.out.println("Enter the quantity");
                                            quantity = sc.nextInt();

                                            sum = sum + (obj1.getCoffee() * quantity);
                                            order = order.concat("COFFEE" + "\t" + "\t" + quantity + "*" + obj1.getCoffee() + "\n");
                                            break;
                                        case 3:
                                            System.out.println("BIRIYANI");
                                            System.out.println("Enter the quantity");
                                            quantity = sc.nextInt();

                                            sum = sum + (obj1.getBiriyani() * quantity);
                                            order = order.concat("BIRIYANI" + "\t" + "\t" + quantity + "*" + obj1.getBiriyani() + "\n");
                                            break;
                                        case 4:
                                            System.out.println("GHEE ROAST");
                                            System.out.println("Enter the quantity");
                                            quantity = sc.nextInt();

                                            sum = sum + (obj1.getNeiroast() * quantity);
                                            order = order.concat("GHEE ROAST" + "\t" + "\t" + quantity + "*" + obj1.getNeiroast() + "\n");
                                            break;
                                        case 5:
                                            System.out.println("RICE");
                                            System.out.println("Enter the quantity");
                                            quantity = sc.nextInt();

                                            sum = sum + (obj1.getRice() * quantity);
                                            order = order.concat("RICE" + "\t" + "\t" + quantity + "*" + obj1.getRice() + "\n");
                                            break;
                                        case 6:
                                            System.out.println("______BILL____" + "\n" + order);
                                            System.out.println("______________");
                                            System.out.println("total" + "\t" + sum);
                                            System.out.println("______________");
                                            break;

                                        case 7:
                                            break;

                                    }
                                }

                                    case 3:
                                        System.exit(0);
                                }
                        }
                    }
            }


