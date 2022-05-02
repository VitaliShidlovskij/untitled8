package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        String[] Auto = {"Lada", "Toyota", "Bentley", "Mercedes", "BMW", "Volkswagen", "Brabus", "Shkoda", "Scania", "Volvo", "Chevrolet", "Jaguar", "Nissan", "Mitsubishi", "Mazda", "MAZ", "KAMAZ", "TATRA", "Fiat"};
        Arrays.sort(Auto);
        for(int i = 0; i <  Auto.length; i++) {
            System.out.println(Auto[i] + "  ");
        }


    }
}

