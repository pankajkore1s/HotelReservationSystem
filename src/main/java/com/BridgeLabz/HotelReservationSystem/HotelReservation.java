package com.BridgeLabz.HotelReservationSystem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class HotelReservation {
    static List<Hotel> hotelsList=new ArrayList<Hotel>();
    static Scanner sc = new Scanner(System.in);
    public static void addHotel( Hotel hotel) // add hotels
    {
        hotelsList.add(hotel);
    }
    public List<Hotel> getHotelsList() {
        return hotelsList;
    }
    public int noOfDays(String firstDate,String lastDate) {
        SimpleDateFormat obj = new SimpleDateFormat("MM-DD-YYYY");

        try {
            Date date1 = obj.parse(firstDate);
            Date date2 = obj.parse(lastDate);

            int time_difference = (int) (date2.getTime() - date1.getTime());

            int days_difference = (int) (TimeUnit.MILLISECONDS.toDays(time_difference) % 365);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        int days_difference = 0;
        return days_difference;
    }
    public Hotel checkCheapestRateHotel(int noOfDays){
        hotelsList.stream().map(p->{p.setRate(noOfDays);return p.regularRate;}).collect(Collectors.toList());
        Hotel cheapestRate=hotelsList.stream().min(Comparator.comparing(Hotel::getRegularRate)).orElse(null);
        return cheapestRate;
    }

    public static void main(String [] args) {
        System.out.println("Welcome to the hotel management system");
    }
}
