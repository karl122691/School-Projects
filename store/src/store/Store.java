/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package store;

import java.util.Scanner;

/**
 *
 * @author BONCAVIL_COMP111
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nextcustomer = true;
        double allcost = 0.0;
        int i = 1;

        do {
            int choice;

            double totalCost = 0.0;
            boolean isBuying = true;

            do {
                System.out.println("""
                Welcome to Karl's Bookstore! Choose an item to buy:
                1. Pencils - PHP 5.00
                2. Ballpoint Pens - PHP 10.00
                3. Notebooks - PHP 50.00
                4. Sharpeners - PHP 15.00
                5. Erasers - PHP 5.00
                6. Exit
                """);

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                double itemCost = 0.0;
                String itemName = "";

                switch (choice) {
                    case 1 -> {
                        itemCost = 5.00;
                        itemName = "Pencils";
                    }
                    case 2 -> {
                        itemCost = 10.00;
                        itemName = "Ballpoint Pens";
                    }
                    case 3 -> {
                        itemCost = 50.00;
                        itemName = "Notebooks";
                    }
                    case 4 -> {
                        itemCost = 15.00;
                        itemName = "Sharpeners";
                    }
                    case 5 -> {
                        itemCost = 5.00;
                        itemName = "Erasers";
                    }
                    case 6 -> {
                        isBuying = false;
                        System.out.println("Exiting the bookstore.");
                    }
                    default ->
                        System.out.println("Invalid choice. Please select again.");
                }

                if (choice >= 1 && choice <= 5) {
                    System.out.println("You selected " + itemName + ".");

                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();

                    if (quantity > 0) {
                        totalCost += itemCost * quantity;
                        System.out.printf("Added %d of your selected item to the cart.%n", quantity);
                        System.out.printf("Current total cost: PHP %.2f%n", totalCost);
                    } else {
                        System.out.println("Invalid quantity. Please enter a positive number.");
                    }
                }

                if (isBuying) {
                    System.out.print("Do you want to continue shopping? (y/n): ");
                    String continueShopping = scanner.next();
                    if (continueShopping.equalsIgnoreCase("n")) {
                        isBuying = false;
                    }
                }

            } while (isBuying);

            System.out.printf("Your final total cost is: PHP %.2f%n", totalCost);

            double amountPaid = 0.0;

            while (amountPaid < totalCost) {
                System.out.print("Enter the amount of money you have: PHP ");
                double additionalPayment = scanner.nextDouble();
                amountPaid += additionalPayment;

                if (amountPaid >= totalCost) {
                    double change = amountPaid - totalCost;
                    System.out.printf("Payment successful! Your change is: PHP %.2f%n", change);
                    break;
                } else {
                    double amountOwed = totalCost - amountPaid;
                    System.out.printf("Not enough money. You still owe: PHP %.2f%n", amountOwed);
                    System.out.print("Do you want to add more money? (y/n): ");
                    String addMore = scanner.next();
                    if (addMore.equalsIgnoreCase("n")) {
                        System.out.println("Transaction canceled. Exiting the bookstore.");
                        break;
                    }
                }
            }
            System.out.println("Thank you for shopping with us!\n\n\n");
            if (amountPaid >= totalCost){
            System.out.printf("Transaction total is: PHP %.2f%n", allcost += totalCost);
            System.out.println("Total number of transactions:" + i++);}
            if (nextcustomer) {
                System.out.print("next customer? (y/n): ");
                String continueprogram = scanner.next();
                if (continueprogram.equalsIgnoreCase("n")) {
                    nextcustomer = false;
                }
            }
         
        } while (nextcustomer);

        System.out.println("Thank you for using Karl's store program!");

        scanner.close();
    }
}
