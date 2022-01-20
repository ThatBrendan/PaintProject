package com.brendancode;

public class Main {
    public static void main(String[] args) {

       int paintGallonPerSquareFoot = 2;
        int costPerPaintGallon = 22;
        int paintPerRoom = 8;
        int squareFoot = 400;
        int roomsInHouse = 8;

        int costPerRoom = costPerPaintGallon * paintPerRoom;
        int costPerHouse = costPerRoom * roomsInHouse;

        String quote = "It will cost you £" + costPerRoom + " to paint your room";
        String quoteForHouse = "It will cost you approximately £" + costPerHouse + " to paint your house";

        System.out.println(quote);
        System.out.println(quoteForHouse);


        int luckyNumber = (int) (Math.random() * 9);

        System.out.println(luckyNumber);
    }
}
