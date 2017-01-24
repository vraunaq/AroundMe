package com.example.vraun.aroundme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding all the text views.
        TextView events = (TextView) findViewById(R.id.event_text_view);
        TextView food = (TextView) findViewById(R.id.food_text_view);
        TextView flea = (TextView) findViewById(R.id.flea_text_view);
        TextView hotel = (TextView) findViewById(R.id.hotel_text_view);

        //Setting intents to each of the text views.
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link EventActivity}
                Intent Intent = new Intent(MainActivity.this, Events.class);

                // Start the new activity
                startActivity(Intent);
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FoodActivity}
                Intent Intent = new Intent(MainActivity.this, Food.class);

                // Start the new activity
                startActivity(Intent);

            }
        });

        flea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FleaMarketsActivity}
                Intent Intent = new Intent(MainActivity.this, FleaMarkets.class);

                // Start the new activity
                startActivity(Intent);
            }


        });

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link HotelsActivity}
                Intent Intent = new Intent(MainActivity.this, Hotels.class);

                // Start the new activity
                startActivity(Intent);
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

