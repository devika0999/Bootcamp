package p5;

import java.util.Scanner;

public class RestaurantBilling {
    public static void main(String[] args) {

        int ch;
        int tea=10,coffee=15,biriyani=140,neiroast=80,rice=50, sum=0;
        String order="";
        int quantity;
        while (true) {
            System.out.println("_______MENU______");
            System.out.println("1.TEA            10");
            System.out.println("2.COFFEE         15");
            System.out.println("3.BIRIYANI       140");
            System.out.println("4.GHEEROAST      80");
            System.out.println("5.RICE           50");
            System.out.println("6.BILL");
            System.out.println("7.EXIT");

            Scanner sc = new Scanner(System.in);
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("TEA");
                    System.out.println("Enter the quantity");
                    quantity=sc.nextInt();

                    sum= sum+(tea*quantity);
                    order=order.concat("TEA"+"\t"+quantity+"\n");
                    break;
                case 2:
                    System.out.println("COFFEE");
                    System.out.println("Enter the quantity");
                    quantity=sc.nextInt();

                    sum=sum+(coffee*quantity);
                    order=order.concat("COFFEE"+"\t"+quantity+"\n");
                    break;
                case 3:
                    System.out.println("BIRIYANI");
                    System.out.println("Enter the quantity");
                    quantity=sc.nextInt();

                    sum=sum+(biriyani*quantity);
                    order=order.concat("BIRIYANI"+"\t"+quantity+"\n");
                    break;
                case 4:
                    System.out.println("GHEE ROAST");
                    System.out.println("Enter the quantity");
                    quantity=sc.nextInt();

                    sum=sum+(neiroast*quantity);
                    order=order.concat("GHEE ROAST"+"\t"+quantity+"\n");
                    break;
                case 5:
                    System.out.println("RICE");
                    System.out.println("Enter the quantity");
                    quantity=sc.nextInt();

                    sum=sum+(rice*quantity);
                    order=order.concat("RICE"+"\t"+quantity+"\n");
                    break;
                case 6:
                    System.out.println("______BILL____"+"\n"+order);
                    System.out.println("______________");
                    System.out.println("total"+"\t"+sum);
                    System.out.println("______________");
                    break;

                case 7:
                    System.exit(0);
            }
        }

    }
}
