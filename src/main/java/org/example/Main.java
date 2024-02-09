package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String product1="Computer";
        String product2= "Offce desk";

        int age=30;
        int code=5290;
        char gender='F';

        double price1=2100.0;
        double price2=650.50;
        double mesure=53.234567;

        System.out.println("Products");
        System.out.printf(product1+", which price is $ %.2f%n",price1);
        System.out.printf(product2+", which price is $ %.2f%n",price2);
        System.out.println("\r\n");
        System.out.println("Record: "+age+" years old, code "+code+" and gender "+gender);
        System.out.println("\r\n");
        System.out.printf("Measue with eight decimal places: %.8f%n ",mesure);
        System.out.printf("Rouded (three decimal places): %.3f%n",mesure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point:%.3f%n",mesure);

    }
}