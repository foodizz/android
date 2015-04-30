package com.foodizz.www.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {


    private List<EventItem> eventItems;
    private ArrayAdapter<EventItem> adapter;
    private ListView eventsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        eventsListView = (ListView) findViewById(R.id.events_list);
        eventItems = new ArrayList<EventItem>();
        eventItems.add(new EventItem("hello", "world"));
        adapter = new EventItemAdapter(this, R.layout.event_list_item, eventItems);
        eventsListView.setAdapter(adapter);
        registerForContextMenu(eventsListView);

        Button event = (Button) findViewById(R.id.new_event_button);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        EventItem event = new EventItem("hello", "world");
                        adapter.add(event);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds eventItems to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
