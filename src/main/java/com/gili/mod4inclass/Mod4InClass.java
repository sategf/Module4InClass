/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gili.mod4inclass;

/**
 *
 * @author Acer10
 */
public class Mod4InClass {

    public static void main(String[] args) {
        
        //The total amount of sales for each employee 
        double[] grossSales = {2500,905,4582,9653,8434,3575,7897,8168,1534,1235,5239,6506,5984,5763,5311,9131,5000};
        //The calculated salaries for each employee will be stored here
        double[] salaries = new double[grossSales.length];
        //The counters for each salary range
        int[] salaryRange = new int[9];
        //Strings representing each salary range
        String[] salaryStrings = {"$200-299", "$300-399", "$400-499", "$500-599", "$600-699", "$700-799", "$800-899", "$900-999", "$1,000 and over"};
        
        
        for (int i = 0; i < grossSales.length; i++) {
            salaries[i] = ((grossSales[i] * 0.09) + 200);
        }//Calculates the salary for each employee by calculating their comission plus base salary
        
        for (int i = 0; i < grossSales.length; i++) {
            if (salaries[i] >= 200 && salaries[i] <= 299) {
                salaryRange[0]++;
            } else if (salaries[i]>= 300 && salaries[i] <= 399) {
                salaryRange[1]++;
            } else if (salaries[i]>= 400 && salaries[i] <= 499) {
                salaryRange[2]++;
            } else if (salaries[i] >= 500 && salaries[i] <= 599) {
                salaryRange[3]++;
            } else if (salaries[i] >= 600 && salaries[i] <= 699) {
                salaryRange[4]++;
            } else if (salaries[i] >= 700 && salaries[i] <= 799) {
                salaryRange[5]++;
            } else if (salaries[i] >= 800 && salaries[i] <= 899) {
                salaryRange[6]++;
            } else if (salaries[i] >= 900 && salaries[i] <= 999) {
                salaryRange[7]++;
            } else if (salaries[i] >= 100) {
                salaryRange[8]++;
            }
        }//Stores each range into the salaryRange counter array
        
        System.out.printf("%-20s%s%n", "Salary Range", "Number of Salaries");
        for (int i = 0; i < salaryRange.length; i++){
            System.out.printf("%-20s%d%n" , salaryStrings[i] , salaryRange[i]);
        }
       
        
    }
    
}


