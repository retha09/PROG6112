/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleapplication;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ConsoleApplication {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String deviceType = "";
        
        System.out.println("=================================================");
        System.out.println("     NUMBER 1 ELECTRONICS - TOTAL SALES SYSTEM   ");
        System.out.println("=================================================\n");
        
        //Select Console Type
        System.out.println("Select the Console Device Type:");
        System.out.println("1. PlayStation 5 (PS5)");
        System.out.println("2. Xbox Series X/S");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3): ");
        
        int selection = 0;
        while (selection < 1 || selection > 3) {
            if (scanner.hasNextInt()) {
                selection = scanner.nextInt();
                if (selection < 1 || selection > 3) {
                    System.out.print("Invalid choice. Please choose 1, 2, or 3: ");
                }
            } else {
                System.out.print("Invalid input. Enter a number (1-3): ");
                scanner.next(); 
            }
        }
        scanner.nextLine();
        
        switch (selection) {
            case 1 -> deviceType = "PlayStation 5";
            case 2 -> deviceType = "Xbox Series X/S";
            case 3 -> deviceType = "Nintendo Switch";
        }
        
        //Enter Store Name
        System.out.print("\nEnter the Electronic Store Name: ");
        String storeName = scanner.nextLine().trim();
        
        //Enter Total Sales Volume
        System.out.print("Enter total amount of sales (units): ");
        int totalSalesAmount = -1;
        while (totalSalesAmount < 0) {
            if (scanner.hasNextInt()) {
                totalSalesAmount = scanner.nextInt();
                if (totalSalesAmount < 0) {
                    System.out.print("Sales cannot be negative. Re-enter: ");
                }
            } else {
                System.out.print("Invalid quantity. Enter a whole number: ");
                scanner.next(); 
            }
        }
        
        ConsoleSales reportObject = new ConsoleSales(deviceType, storeName, totalSalesAmount);
        reportObject.printReport();
        
    }
} 
   
