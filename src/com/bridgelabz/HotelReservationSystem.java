package com.bridgelabz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
    private List<Hotel> hotels;

    public HotelReservationSystem(){
        this.hotels = new ArrayList<>();
    }

    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
    public int findCheapestHotel(){
        int LakeWoodRate = 110; int BridgeWoodRate = 160; int Ridgewood = 220;
        int cheapestHotel = (LakeWoodRate>BridgeWoodRate) ?
                (LakeWoodRate>Ridgewood ? LakeWoodRate : Ridgewood) :
                (BridgeWoodRate>Ridgewood ? BridgeWoodRate : Ridgewood) ;
        System.out.println("The cheapest Hotel is " +cheapestHotel);
        return cheapestHotel;
    }

    public static void main(String[] args) throws Exception {

        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1 + "\t" + date1);
        System.out.println(sDate2 + "\t" + date2);
        HotelReservationSystem hotel = new HotelReservationSystem();
        hotel.findCheapestHotel();
    }
}




