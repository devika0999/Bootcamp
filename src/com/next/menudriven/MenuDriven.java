package com.next.menudriven;

import java.util.Scanner;

public class MenuDriven
{
    public static void main(String[] args)
    {
        int choice;

        while (true)
        {
            System.out.println("Menu driven");
            System.out.println("1.add student ");
            System.out.println("2.search student");
            System.out.println("3.delete student ");
            System.out.println("4.view student");
            System.out.println("5.exit");

            Scanner opt= new Scanner(System.in);
            choice = opt.nextInt();


            switch (choice)
            {
                case 1:
                    System.out.println("add student selected");

                    break;
                case 2:

                    System.out.println("search student selected");
                    break;
                case 3:

                    System.out.println("delete student selected");
                    break;
                case 4:

                    System.out.println("view student selected");
                    break;
                case 5:
                    System.exit(0);


        }

    }
}
}
