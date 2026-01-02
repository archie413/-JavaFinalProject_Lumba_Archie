/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafinalproject;

/**
 *
 * @author Asus
 */
public class BmiData {
    // Encapsulation (Private attributes)
    private double weight;
    private double height;
    private String gender;

    // Constructor: Initializes the object with data passed from Main
    public BmiData(double weight, double height, String gender) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }
    
    // Method 1: Perform calculation
    public double calculateBMI() {
        // Formula: weight / (height in meters)^2
        // Since input is cm, we multiply by 10000
        return (this.weight / (this.height * this.height)) * 10000;
    }

    // Method 2: Determine category based on Gender and BMI
    public String getCategory() {
        double bmi = calculateBMI(); // Call the internal method
        String category = "Unknown";

        if (this.gender.equalsIgnoreCase("Male")) { // FOR MALE
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }
        } else if (this.gender.equalsIgnoreCase("Female")) { // FOR FEMALE
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 24) {
                category = "Normal";
            } else if (bmi < 29) {
                category = "Overweight";
            } else {
                category = "Obese";
            }
        }
        return category;
    }
}
