package com.brendancode;

public class Main {
    public static void main(String[] args) {

        int weekOfTheMonth = (int) (Math.random() * 5);

        System.out.println("You have booked to have your house painted on the " + weekOfTheMonth + " week of the month");

        costPerRoom(20, 6);
        costPerHouse (20,6, 6);

        String[] typesOfPaint = {"Oil", "Acrylic", "Watercolor"};
        for (int i = 0; i < typesOfPaint.length; i++) {
            System.out.println(typesOfPaint[i] + " might be a suitable choice of colour for your building");
        }

        switch (weekOfTheMonth) {
            case 0 -> System.out.println("I'm not sure if I am busy");
            case 1, 2 -> System.out.println("I'm booked out for the week");
            case 3, 4 -> System.out.println("I might have a slot, let me check");
            default -> System.out.println("Can you please check online");
        }
    }

    public static void costPerRoom (int costPerPaintGallon, int paintPerRoom) {
        System.out.println("The average cost per room is " + costPerPaintGallon * paintPerRoom);
    }
    public static void costPerHouse (int costPerPaintGallon , int roomsInHouse, int paintPerRoom) {
        System.out.println("The average cost for the whole house is " + costPerPaintGallon * roomsInHouse * paintPerRoom);
    }
}
