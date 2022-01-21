package com.brendancode;

public class Main {
    public static void main(String[] args) {

        int weekOfTheMonth = (int) (Math.random() * 5);

        System.out.println("You have booked to have your house painted on the " + weekOfTheMonth + " week of the month");

        int costPerPaintGallon = 22;
        int paintPerRoom = 6;
        int budget = 2000;
        boolean weatherIsNice = false;
        int roomsInHouse = 6;


        String [] typesOfPaint = {"Oil", "Acrylic", "Watercolor"};
        for( int i = 0; i < typesOfPaint.length; i++)  {
            System.out.println(typesOfPaint[i] + " might be a suitable choice of colour for your building");
        }

        int costPerRoom = costPerPaintGallon * paintPerRoom;
        int costPerHouse = costPerRoom * roomsInHouse;

        switch (weekOfTheMonth) {
            case 0 -> System.out.println("I'm not sure if I am busy");
            case 1, 2 -> System.out.println("I'm booked out for the week");
            case 3, 4 -> System.out.println("I might have a slot, let me check");
            default -> System.out.println("Can you please check online");
        }

        String quote = "It will cost you £" + costPerRoom + " to paint your room";
        String quoteForHouse = "It will cost you approximately £" + costPerHouse + " to paint your house";

        System.out.println(quote);
        System.out.println(quoteForHouse);

        if (weatherIsNice && budget > costPerHouse && weekOfTheMonth > 2) {
            System.out.println("Lets get painting!!!");
        } else {
            System.out.println("You'd need to get another quote");
        }




    }
}
