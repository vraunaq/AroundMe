package com.example.vraun.aroundme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_list);

        // Create a list of words
        final ArrayList<Description> description = new ArrayList<>();
        description.add(new Description(getString(R.string.event_1), getString(R.string.event_desc_1), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_2), getString(R.string.event_desc_2), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_3), getString(R.string.event_desc_3), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_4), getString(R.string.event_desc_4), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_5), getString(R.string.event_desc_5), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_6), getString(R.string.event_desc_6), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_7), getString(R.string.description7), R.drawable.event_icon));
        description.add(new Description(getString(R.string.event_8), getString(R.string.description8), R.drawable.event_icon));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        DescriptionAdapter adapter = new DescriptionAdapter(this, description, R.color.category_event);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
    }

