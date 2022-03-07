package com.BridgeLabz.HotelReservationSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationSystemTest {
    @Test
    public void hotelAddTest() //test for add Hotel
    {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel hotel = new Hotel("LakeWood",110);
        Hotel hotel1 = new Hotel("BridgeWood",160);
        Hotel hotel2 = new Hotel("RidgeWood",220);
        hotelReservation.addHotel(hotel);
        List hotelsList=hotelReservation.getHotelsList();
        Assertions.assertTrue(hotelsList.contains(hotel));
    }

}
