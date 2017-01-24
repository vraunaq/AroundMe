package com.example.vraun.aroundme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_list);

        // Create a list of words
        final ArrayList<Description> description = new ArrayList<>();
        description.add(new Description(getString(R.string.food_1), getString(R.string.food_desc1), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_2), getString(R.string.food_desc2), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_3), getString(R.string.food_desc3), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_4), getString(R.string.food_desc4), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_5), getString(R.string.food_desc5), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_6), getString(R.string.food_desc6), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_7), getString(R.string.food_desc7), R.drawable.restaurant_icon));
        description.add(new Description(getString(R.string.food_8), getString(R.string.food_desc8), R.drawable.restaurant_icon));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        DescriptionAdapter adapter = new DescriptionAdapter(this, description, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
