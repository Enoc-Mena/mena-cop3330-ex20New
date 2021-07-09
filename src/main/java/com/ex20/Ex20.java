/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

    private static DecimalFormat df2 = new DecimalFormat("#.##"); //Formats output to 2 decimal places

    public static void main(String[] args) {

        //Strings used to compare with users input
        String wisconsin = "Wisconsin";
        String illinois = "Illinois";
        String euaClaire = "Eua Claire";
        String dunn = "Dunn";

        double orderAmount;

        String userState;

        //Prompt for order amount
        Scanner amount = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        orderAmount = amount.nextDouble();

        //Prompts for state
        Scanner state = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        userState = state.nextLine();

        //if user lives in wisconsin
        if(userState.equalsIgnoreCase(wisconsin)) {

            String county;

            //Prompts for county in wisconsin
            Scanner userCounty = new Scanner(System.in);
            System.out.print("What county do you live in? ");
            county = userCounty.nextLine();

            //if user lives in Eua Claire county
            if(county.equalsIgnoreCase(euaClaire)) {

                double wisconsinTax = 0.05;
                double additionalTax = 0.005;

                double total1 = orderAmount * wisconsinTax;
                double total2 = orderAmount * additionalTax;
                double total3 = orderAmount + total1 + total2;
                double totalTax = total1 + total2;

                System.out.print("The tax is: $" + df2.format(totalTax));
                System.out.println("");
                System.out.print("The total is: $" + df2.format(total3));

            }

            //if user lives in Dunn county
            if(county.equalsIgnoreCase(dunn)) {

                double wisconsinTax2 = 0.05;
                double additionalTax2 = 0.004;

                double dunnTotal = orderAmount * wisconsinTax2;
                double dunnTotal2 = orderAmount * additionalTax2;
                double dunnTotal3 = orderAmount + dunnTotal + dunnTotal2;
                double totalDunnTax = dunnTotal + dunnTotal2;

                System.out.print("The tax is: $" + df2.format(totalDunnTax));
                System.out.println("");
                System.out.print("The total is: $" + df2.format(dunnTotal3));

            }

            //if the user does not live in Eua Claire county or Dunn county
            if(!county.equalsIgnoreCase(euaClaire) && !county.equalsIgnoreCase(dunn)) {

                double noCountyTax = 0.05;
                double noCountyTotal1 = orderAmount * noCountyTax;
                double orderTotal = orderAmount + noCountyTotal1;

                System.out.print("The tax is: $" + df2.format(noCountyTotal1));
                System.out.println("");
                System.out.print("The total is: $" + df2.format(orderTotal));

            }

        } //End if-statement

        //if user lives in illinois
        if(userState.equalsIgnoreCase(illinois)) {

            double illinoisTax = 0.08;
            double illinoisTaxCalc = orderAmount * illinoisTax;
            double illinoisTotal = orderAmount + illinoisTaxCalc;

            System.out.print("The tax is: $" + df2.format(illinoisTaxCalc));
            System.out.println("");
            System.out.print("The total is: $" + df2.format(illinoisTotal));

        } //End if-statement

        //if user lives in any other state
        if(!userState.equalsIgnoreCase(wisconsin) && !userState.equalsIgnoreCase(illinois)) {

            System.out.print("Your taxes are: $0.00");
            System.out.println("");
            System.out.print("The total is: $" + orderAmount);

        } //End else-statement

    }

}
