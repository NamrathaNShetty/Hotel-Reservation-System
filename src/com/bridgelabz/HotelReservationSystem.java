package com.bridgelabz;

public class HotelReservationSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

    }

    /* Method to add hotels details with name and rates for regular customer.
     * hotelName   : takes name of the hotel as first argument
     * weekDayRate : takes week day rate of hotel as second argument
     * weekendRate : takes weekend rate of hotel as third argument
     * return the hotel name, week day and weekend rates of the hotel
     */
       public Hotel addHotel (String hotelName,int weekDayRate, int weekendRate){
            return new Hotel(hotelName, weekDayRate, weekendRate);
        }
    }


