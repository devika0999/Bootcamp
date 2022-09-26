package p3;

import java.util.ArrayList;
import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> empList = new ArrayList<String>();

        while (true) {
            System.out.println("Menu driven");
            System.out.println("1.Add new EMployee ");
            System.out.println("2.View Employee list");
            System.out.println("2.exit");


            Scanner opt = new Scanner(System.in);
            choice = opt.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter name");
                    empName = opt.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0)
                    System.out.println("empty List");
                    else
                        System.out.println(empList);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}