package com.brendancode;

public class Main {
    public static void main(String[] args) {

        int luckyNumber = (int) (Math.random() * 9);

        System.out.println(luckyNumber);

        int costPerPaintGallon = 22;
        int paintPerRoom = 6;
        int budget = 2000;
        boolean weatherIsNice = false;
        int roomsInHouse = 3;

        int costPerRoom = costPerPaintGallon * paintPerRoom;
        int costPerHouse = costPerRoom * roomsInHouse;

        switch (roomsInHouse) {
            case 0:
                System.out.println("This is a caravan");
                break;
            case 1,2,3:
                System.out.println("This is decent");
                break;
            default:
                System.out.println("Let us chat about it");
        };

        String quote = "It will cost you £" + costPerRoom + " to paint your room";
        String quoteForHouse = "It will cost you approximately £" + costPerHouse + " to paint your house";

        System.out.println(quote);
        System.out.println(quoteForHouse);

        if (budget > costPerHouse && weatherIsNice) {
            System.out.println("Lets get painting!!!");
        } else {
            System.out.println("You'd need to think about it");
        }




    }
}
