package com.foodizz.www.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gil on 4/30/2015.
 */
public class EventItemAdapter extends ArrayAdapter<EventItem> {

    public EventItemAdapter(Context context, int resource, List<EventItem> events) {
        super(context, resource, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(getContext());
//        View view = inflater.inflate(R.layout.event_list_item, null);


        View v = convertView;

        if (v == null) {

            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.event_list_item, null);
        }
        else {
//            TextView location = (TextView) v.findViewById(R.id.event_item_location_text);
//            location.setTextColor(Color.RED);
        }


            return v;

    }
}