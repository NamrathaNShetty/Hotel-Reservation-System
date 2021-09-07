package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem(){
        this.hotels = new ArrayList<>();
    }

    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
}

