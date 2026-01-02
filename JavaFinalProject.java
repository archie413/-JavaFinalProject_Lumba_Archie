/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafinalproject;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Asus
 */
public class JavaFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean looping = true;

        while (looping) {
            System.out.println();
            System.out.println("1. Calculate BMI (Male)");
            System.out.println("2. Calculate BMI (Female)");
            System.out.println("3: GUI");
            System.out.println("4: Exit");
            System.out.print("Choose number: ");
            int number = input.nextInt();

            try {
                double weightInput;
                double heightInput;

                if (number == 1) { // FOR MALE                   
                    System.out.print("\nEnter Weight (kg): ");
                    weightInput = input.nextDouble();
                    System.out.print("Enter Height (cm): ");
                    heightInput = input.nextDouble();

                    // OOP: Create object for Male (Passing "Male" to constructor)
                    BmiData userData = new BmiData(weightInput, heightInput, "Male");

                    // OOP: Call methods from the object
                    System.out.println("\n--- Result (Male) ---");
                    System.out.printf("BMI: %.2f\n", userData.calculateBMI());
                    System.out.println("Category: " + userData.getCategory());

                } else if (number == 2) { // FOR FEMALE                  
                    System.out.print("\nEnter Weight (kg): ");
                    weightInput = input.nextDouble();
                    System.out.print("Enter Height (cm): ");
                    heightInput = input.nextDouble();

                    // OOP: Create object for Female (Passing "Female" to constructor)
                    BmiData userData = new BmiData(weightInput, heightInput, "Female");

                    // OOP: Call methods from the object
                    System.out.println("\n--- Result (Female) ---");
                    System.out.printf("BMI: %.2f\n", userData.calculateBMI());
                    System.out.println("Category: " + userData.getCategory());
                    
                } else if (number == 3) {  
                    callGUI(); // this will be use to call in the method

                } else if (number == 4) { //TO EXIT THE PROGRAM
                    looping = false;
                    System.out.println("Thank you for using my final project.");
                }
            } catch (InputMismatchException e) { // if the input is not a number then this will catch the error
                System.out.println("Error: Invalid input. Please enter numbers only.");
                input.nextLine();
            }
        }

    }
    //METHOD
    public static void callGUI() { 
        java.awt.EventQueue.invokeLater(() -> {
            BmiCalculator gui = new BmiCalculator();

            gui.setVisible(true);   // to open the GUI
            gui.setAlwaysOnTop(true);  // to open the GUI directly
            gui.toFront();
            gui.requestFocus();
        });
    }
}
