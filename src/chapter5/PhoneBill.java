package chapter5;

import chapter6.PhoneBillCalculator;
import java.util.Scanner;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allotedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allotedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allotedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allotedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allotedMinutes = allotedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allotedMinutes;
    }

    public void setAllottedMinutes(int minutes){
        allotedMinutes = minutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutes){
        minutesUsed = minutes;
    }

    public double calculateOverage(){
        if (minutesUsed<= allotedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allotedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}