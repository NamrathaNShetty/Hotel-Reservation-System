package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;


public class HotelReservationTest {
    HotelReservationSystem hotelReservation = new HotelReservationSystem();

    @Test
    public void add_Hotels() {
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", 110)));
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", 160)));
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", 220)));
    }

    @Test
    public void toFindTheCheapestHotel() {
        HotelReservationSystem cheapHotel = new HotelReservationSystem();
        cheapHotel.findCheapestHotel();

    }
}