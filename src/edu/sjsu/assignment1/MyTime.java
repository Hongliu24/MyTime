package edu.sjsu.assignment1;

import java.util.Scanner;
public class MyTime {

    public static void main(String[] args) {


        printTimeDifference("0120", "1510");
        printTimeDifference("1635", "0250");


    }
        public static void printTimeDifference (String time1, String time2){
            int hr1, hr2, m1, m2;
            int first = convertMilitaryToMins(time1);
            int second = convertMilitaryToMins(time2);


            int difference = second - first;
            if (difference < 0)
                difference += 24 * 60;

            int hours = difference / 60;
            int mins = difference % 60;

            System.out.println(hours + " hour(s) " + mins + " minute(s)");


        }


        private static int convertMilitaryToMins (String time){


            int timeInt = Integer.parseInt(time);

            int hour = timeInt / 100;
            int min = timeInt % 100;
            return hour * 60 + min;
        }
    }


