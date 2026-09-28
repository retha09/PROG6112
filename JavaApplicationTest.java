/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaapplicationtest;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplicationTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        int[][] salesData = new int[cities.length][consoles.length];
         int[] cityTotals = new int[cities.length];
        
        System.out.println("=================================================");
        System.out.println("  Number 1 Electronics - Sales Data Entry");
        System.out.println("=================================================\n");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println("--- Enter Yearly Sales for " + cities[i] + " ---");
            int runningTotal = 0;
            
            for (int j = 0; j < consoles.length; j++) {
                System.out.print("Enter number of sales for " + consoles[j] + ": ");
                
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
                
                salesData[i][j] = scanner.nextInt();
                runningTotal += salesData[i][j];
            }
            cityTotals[i] = runningTotal;
            System.out.println(); 
        }
        
        //Determine the city with the highest total console sales
        int maxSalesIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxSalesIndex]) {
                maxSalesIndex = i;
            }
        }
        
        //Generate and display the formatted report
        System.out.println("\n==================================================================");
        System.out.println("              NUMBER 1 ELECTRONICS - YEARLY SALES REPORT          ");
        System.out.println("==================================================================");
        System.out.printf("%-15s %-12s %-12s %-18s %-12s\n", "City", "PS5", "XBOX", "SWITCH", "Total Sales");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-12d %-12d %-18d %-12d\n", 
                cities[i], 
                salesData[i][0],
                salesData[i][1], 
                salesData[i][2], 
                cityTotals[i]    
            );
        }
        
        System.out.println("==================================================================");
        System.out.println("Top Performing City: " + cities[maxSalesIndex].toUpperCase() + 
                           " with " + cityTotals[maxSalesIndex] + " total console sales.");
        System.out.println("==================================================================");
        
       
    }
}