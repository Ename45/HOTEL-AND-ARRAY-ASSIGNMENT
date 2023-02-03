package graceClass;

import java.util.Scanner;

public class UserEntries {
    Scanner input = new Scanner(System.in);
    Hotel tisemeni = new Hotel(50);
    String response;
    String name;

    public void userEntries() {
//        System.out.print("Hello user. Enter your name: ");
//        String name = input.nextLine();
//        System.out.println();
        System.out.println("Welcome to Tisemeni Hotels!!\n");
        System.out.println();
        System.out.printf("There are %d rooms available%n", tisemeni.availableRooms());
        System.out.println("Do you want to book a room?");
        response = input.nextLine();
        System.out.println();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter your name: \n");
            name = input.next();
            System.out.println(tisemeni.bookRoom(name));
            System.out.println("There are " + tisemeni.availableRooms() + " available rooms currently.");
        }

        System.out.println("There are "+tisemeni.bookedRooms()+ " booked room(s).");
        System.out.println("Mr "+tisemeni.getARoomGuest(1)+ " is in room " +tisemeni.bookedRooms());
        System.out.println();
        System.out.println("Do you wish to check out?");
        response = input.next();
        if(response.equalsIgnoreCase("Yes")){
            tisemeni.checkOut(1);
            System.out.println("We appreciate your patronage. Thank you!");
        }


    }
}
