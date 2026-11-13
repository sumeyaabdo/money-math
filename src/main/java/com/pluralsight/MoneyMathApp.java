package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMathApp {
    public static void main(String[] args) {

        //Creating variables

        float laptop = 0;
        double ipad = 0;
        BigDecimal phone = BigDecimal.ZERO;

        //Creating a loop
        for (int i = 0; i < 10; i++) {
            laptop += 0.10f;
            ipad += 0.10;
            phone = phone.add(new BigDecimal("0.10"));
            System.out.println(laptop + " | " + ipad + " | " + phone);
        }

        laptop = 0;
        ipad = 0;
        phone = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {
            laptop += 19.99f;
            ipad += 19.99;
            phone = phone.add(new BigDecimal("19.99"));
        }
        System.out.println(laptop + " | " + ipad + " | " + phone);

        // Comparing
        System.out.println("Float vs Double: " + (laptop == ipad));

        System.out.println("Double vs BigDecimal: " +
                (BigDecimal.valueOf(ipad).compareTo(phone) == 0));
    }
}
