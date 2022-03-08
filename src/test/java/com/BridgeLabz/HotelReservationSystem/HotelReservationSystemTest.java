package com.BridgeLabz.HotelReservationSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelReservationSystemTest {
    @Test
    public void hotelAddTest() //////
    {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel hotel = new Hotel("LakeWood",110);
        hotelReservation.addHotel(hotel);
        List hotelsList=hotelReservation.getHotelsList();
        Assertions.assertTrue(hotelsList.contains(hotel));
    }
    @Test
    public void checkCheapestRateHotel(){
        HotelReservation hotelReservation=new HotelReservation();
        Hotel hotel1=new Hotel("LakeWood",110);
        Hotel hotel2=new Hotel("BridgeWood",160);
        Hotel hotel3=new Hotel("RidgeWood",220);
        hotelReservation.addHotel(hotel1);
        hotelReservation.addHotel(hotel2);
        hotelReservation.addHotel(hotel3);
        int days=hotelReservation.noOfDays("05-20-2020","05-22-2020");
        Hotel result=hotelReservation.checkCheapestRateHotel(days);
        System.out.println(result);
        Assertions.assertEquals(hotel1,result);
    }
}
