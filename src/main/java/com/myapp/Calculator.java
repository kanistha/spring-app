package com.myapp;

/**
 * Created by Hexad GmbH on 21-10-2016.
 */
public class Calculator {

    private double price;
    private double amountPaid;


    public void addProductPrice(double price) {
         this.price+=price;
    }

    public double getPrice() {
        return price;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double getBalance() {
        return getAmountPaid()-getPrice();
    }
}
