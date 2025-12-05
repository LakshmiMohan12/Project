package com.jspiders.ems.main;
import com.jspiders.ems.services.EmployeeServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Please select the option");

        System.out.println("1. Add employee");
        System.out.println("2. View employee");
        System.out.println("3. Update employee");
        System.out.println("4. Delete2 employee");
        System.out.println("0. EXIT");

        EmployeeServiceImpl empSrv = new EmployeeServiceImpl();

        Scanner s1 = new Scanner(System.in);
        int choice = s1.nextInt();

        switch (choice)
        {
            case 1 : empSrv.addEmployee();
                break;
            case 2 :
                System.out.println("View employee:");
                break;
            case 3 :
                System.out.println("Update employee:");
                break;
            case 4 :
                System.out.println("Delete employee:");
                break;
            default : System.exit(0);
        }
        System.out.println();
        System.out.println("Compleated.....");
    }

}
