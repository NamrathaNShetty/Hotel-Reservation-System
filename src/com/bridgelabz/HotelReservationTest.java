package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelReservationTest {
    HotelReservationSystem hotelReservation = new HotelReservationSystem();
    Hotel newHotel = hotelReservation.addHotel("Lakewood", 110, 90);
    Hotel newHotel1 = hotelReservation.addHotel("BridgeWood", 150, 60);
    Hotel newHotel2 = hotelReservation.addHotel("RidgeWood", 220, 150);


    /*
     *To perform test case to add hotel details.
     *return hotel name
     */
    @Test
    public void givenHotelDetails_whenAdded_ShouldReturnEnteredName() {
        assertEquals(newHotel.getHotelName(), "Lakewood");
        assertEquals(newHotel1.getHotelName(), "BridgeWood");
        assertEquals(newHotel2.getHotelName(), "RidgeWood");
    }

    /*
     * To perform test case to add hotel details.
     * return Hotel's week day rate for regular customer.
     */

    @Test
    public void givenHotelDetails_whenAddedWeekDayRate_ShouldReturnEnteredWeekDayRate() {
        assertEquals(newHotel.getWeekDayRegularRate(), 110);
        assertEquals(newHotel1.getWeekDayRegularRate(), 150);
        assertEquals(newHotel2.getWeekDayRegularRate(), 220);
    }

    /*
     * To perform test case to add hotel details.
     * return Hotel's weekend rate for regular customer.
     */
    @Test
    public void givenHotelDetails_whenAddedWeekEndRate_ShouldReturnEnteredWeekendRate() {
        assertEquals(newHotel.getWeekEndRegularRate(), 90);
        assertEquals(newHotel1.getWeekEndRegularRate(), 60);
        assertEquals(newHotel2.getWeekEndRegularRate(), 150);
    }
}