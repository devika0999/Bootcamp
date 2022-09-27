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

            System.out.println("enter two numbers");
            x = opt.nextDouble();
            y = opt.nextDouble();


            switch (choice)
            {
                case 1:

                    res = x+y;
                    System.out.println("result"+ res);
                    break;
                case 2:

                    res = x-y;
                    System.out.println("result"+ res);
                    break;
                case 3:

                    res = x*y;
                    System.out.println("result"+ res);
                    break;
                case 4:

                    try {
                        res = x / y;
                        System.out.println("result" + res);
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println(e);

                }
                    break;
                case 5:
                    System.exit(0);


            }

        }
    }
}


