package com.example.test.myapplication;

import java.text.DecimalFormat;

/**
 * Created by 100040 on 4/13/2016.
 */
public class Test {
    public static void main(String [] args){
        String stringLitersOfPetrol = "123";
        System.out.println("string liters of petrol putting in preferences is "+stringLitersOfPetrol);
        Float litersOfPetrol=Float.parseFloat(stringLitersOfPetrol);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        stringLitersOfPetrol = df.format(litersOfPetrol);
        System.out.println("liters of petrol before putting in editor : "+stringLitersOfPetrol);
    }
}
