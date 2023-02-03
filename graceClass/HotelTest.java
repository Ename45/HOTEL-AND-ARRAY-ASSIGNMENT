package graceClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach

    @Test
    void startAllTestWith(){
        hotel = new Hotel(10);
        assertNotNull(hotel);
    }

    @Test
    void testThatRoomCanBeBooked(){
        assertEquals("Room successfully booked!!!", hotel.bookRoom("Kinzy"));
    }

    @Test
    void testThatUsersCanCheckOut(){
        hotel.bookRoom("Kinzy");
        assertTrue(hotel.checkOut(1));
    }

    @Test
    void getAllRoomsTest(){
       assertEquals(10, hotel.getRooms());
    }

    @Test
    void testThatWeCanGetAvailableRooms(){
        hotel.bookRoom("Legend");
        hotel.bookRoom("Patricia");
        hotel.bookRoom("Ann");
        hotel.bookRoom("Jumoke");
        hotel.bookRoom("Chioma");
        assertEquals(5, hotel.availableRooms());
    }

    @Test
    void testThatWeCanGetBookedRooms(){
        hotel.bookRoom("Legend");
        hotel.bookRoom("Patricia");
        hotel.bookRoom("Ann");
        hotel.bookRoom("Jumoke");
        hotel.bookRoom("Chioma");
        assertEquals(5, hotel.bookedRooms());
    }

    @Test
    void testThatWeCanGetARoomGuest(){
        hotel.bookRoom("Legend");
        assertEquals("Legend", hotel.getARoomGuest(1));
    }

    @Test
    void testThatWeCanGetAllRoomGuest(){
        hotel.bookRoom("Legend");
        hotel.bookRoom("Patricia");
        hotel.bookRoom("Ann");
        assertEquals("[Legend, Patricia, Ann]", hotel.getAllRoomGuest());
    }
//    @Test
//    void testThatWeCanGetAllRoomGuestTwo() {
//        hotel.bookRoom("Legend");
//        hotel.bookRoom("Patricia");
//        hotel.bookRoom("Ann");
//        String [] names = {"Legend", "Patricia", "Ann"};
//        assertArrayEquals(names, hotel.getAllRoomGuest());
//    }
}
