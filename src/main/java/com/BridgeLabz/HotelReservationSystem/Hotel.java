package com.BridgeLabz.HotelReservationSystem;

public class Hotel {
    String hotelName;
    int regularRate;
    
    public String getHotelName(){
        return hotelName;
    }
    public void setHotelName( String hotelName){
        this.hotelName=hotelName;
    }
    public int getRegularRate(){
        return regularRate;
    }

    public void setRegularRate(int regularRate) {
        this.regularRate = regularRate;
    }
    public Hotel(String hotelName,int regularRate){
        this.hotelName=hotelName;
        this.regularRate=regularRate;
    }
    public void setRate(int noOfDays) {
        this.regularRate = this.regularRate*noOfDays;
    }
}
