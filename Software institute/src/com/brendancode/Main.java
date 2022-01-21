package com.brendancode;

public class Main {
    public static void main(String[] args) {

        int luckyNumber = (int) (Math.random() * 9);

        System.out.println(luckyNumber);

        int costPerPaintGallon = 22;
        int paintPerRoom = 6;
        int budget = 2000;
        boolean weatherIsNice = true;
        int roomsInHouse = 3;

        int costPerRoom = costPerPaintGallon * paintPerRoom;
        int costPerHouse = costPerRoom * roomsInHouse;

        switch (luckyNumber) {
            case 0 -> System.out.println("Damn son you ain't lucky");
            case 1, 2, 3 -> System.out.println("You kinda lucky");
            case 4, 5, 6, 7, 8 -> System.out.println("You luckyyyyy!!!");
            default -> System.out.println("Let us chat about it");
        }
        ;

        String quote = "It will cost you £" + costPerRoom + " to paint your room";
        String quoteForHouse = "It will cost you approximately £" + costPerHouse + " to paint your house";

        System.out.println(quote);
        System.out.println(quoteForHouse);

        if (weatherIsNice) {
            System.out.println("Lets get painting!!!");
        } else {
            System.out.println("You'd need to think about it");
        }




    }
}
