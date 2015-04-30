package com.foodizz.www.myapplication;

/**
 * Created by Gil on 4/30/2015.
 */
public class EventItem {

    private String location;
    private String time;

    public EventItem(String location, String time) {
        this.location = location;
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }
}
