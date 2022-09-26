package p2;

import java.util.Scanner;

public class Menuclass {

    public static void main(String[] args)
    {
        int choice;
        double  x, y ,res;
        while (true)
        {
            System.out.println("Menu driven");
            System.out.println("1.add ");
            System.out.println("2.subtract");
            System.out.println("3.multiply ");
            System.out.println("4.divide");
            System.out.println("5.exit");

            Scanner opt= new Scanner(System.in);
            choice = opt.nextInt();


            switch (choice)
            {
                case 1:
                    System.out.println("enter two numbers");
                    x = opt.nextDouble();
                    y = opt.nextDouble();
                    res = x+y;
                    System.out.println("result"+ res);
                    break;
                case 2:
                    System.out.println("enter two numbers");
                    x = opt.nextDouble();
                    y = opt.nextDouble();
                    res = x-y;
                    System.out.println("result"+ res);
                    break;
                case 3:
                    System.out.println("enter two numbers");
                    x = opt.nextDouble();
                    y = opt.nextDouble();
                    res = x*y;
                    System.out.println("result"+ res);
                    break;
                case 4:
                    System.out.println("enter two numbers");
                    x = opt.nextDouble();
                    y = opt.nextDouble();
                    res = x/y;
                    System.out.println("result"+ res);
                    break;
                case 5:
                    System.exit(0);


            }

        }
    }
}


