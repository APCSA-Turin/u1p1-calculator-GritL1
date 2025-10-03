package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        // learned Math.round from raymond
        double totalTip = ((Math.round(percent * cost)) / (double) 100) ;

        double totalBill = (Math.round(100 * (totalTip + cost)) / (double) 100);

        double perPersonCost = (Math.round(100 * (cost / people)) / (double) 100) ;
        
        double tipPerPerson = (Math.round(100 * (totalTip / people)) / (double) 100) ;

        double costPerPerson = (Math.round( 100 * ((cost/people) + ((cost * percent / 100) / people))) / (double) 100);

        
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalBill + "\n" +
                       "Per person cost before tip: $" + perPersonCost + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + costPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        Scanner scan = new Scanner(System.in);
        String menuItem = "";
        String menuList = "Items ordered:\n";
        Boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double totalTip = ((Math.round(percent * cost)) / (double) 100) ;

        double totalBill = (Math.round(100 * (totalTip + cost)) / (double) 100);

        double perPersonCost = (Math.round(100 * (cost / people)) / (double) 100) ;
        
        double tipPerPerson = (Math.round(100 * (totalTip / people)) / (double) 100) ;

        double costPerPerson = (Math.round( 100 * ((cost/people) + ((cost * percent / 100) / people))) / (double) 100);
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("Enter an item name or type '-1' to finish: ");
            menuItem = scan.nextLine();
            String numb = "-1";
            if (menuItem.equals(numb)){ // learned from https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java 
                condition = false;
                break; // learned from https://stackoverflow.com/questions/7951690/how-do-i-exit-a-while-loop-in-java
            }
            menuList = menuList + menuItem + "\n"; //got the idea from https://www.reddit.com/r/javahelp/comments/1b1j9q4/is_it_possible_to_store_multiple_outputs_from_a/
            
        }
       
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalBill + "\n" +
                       "Per person cost before tip: $" + perPersonCost + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + costPerPerson + "\n" +
                       "-------------------------------\n" +
                       menuList + "-------------------------------\n";
        return result;
    }
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=6; 
        int percent=25;
        double cost=52.27;     
        
        // System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
