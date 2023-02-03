package graceClass;

import java.util.Arrays;

public class Hotel {
    private String [] rooms;


    public Hotel(int roomLength){
        this.rooms = new String[roomLength];
    }

    public String bookRoom(String userName) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = userName;
                break;
            }
        }
        return "Room successfully booked!!!";
    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if (rooms[roomNumber - 1]!= null){
            rooms[roomNumber - 1] = null;
            hasCheckedOut = true;
        }
        return hasCheckedOut;
    }

    public int getRooms(){
        return rooms.length;
    }

    public int availableRooms() {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null){
                count++;
            }
        }
        return count;
    }

    public int bookedRooms() {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null){
                count++;
            }
        }
        return count;
    }


    public String getARoomGuest(int roomNumber) {
        String occupantName = "";
        if (rooms[roomNumber - 1] != null) {
            occupantName = rooms[roomNumber-1];
        }
        return occupantName;
    }

    public String getAllRoomGuest() {
        String[] occupantNames = new String[bookedRooms()];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                occupantNames[i]= rooms[i];
            }
        }
        return Arrays.toString(occupantNames);
    }

//    public String [] getAllRoomGuest() {
//        String[] occupantNames = new String[bookedRooms()];
//        for (int i = 0; i < rooms.length; i++) {
//            if (rooms[i] != null) {
//                occupantNames[i]= rooms[i];
//            }
//        }
//        return occupantNames;
//    }
}
