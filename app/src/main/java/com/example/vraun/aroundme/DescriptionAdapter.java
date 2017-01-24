package com.example.vraun.aroundme;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vraun on 25-01-2017.
 */

public class DescriptionAdapter extends ArrayAdapter<Description> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link DescriptionAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param words           is the list of {@link Description}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public DescriptionAdapter(Context context, ArrayList<Description> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // {@link Description} object located at this position in the list
        Description currentDescription = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the discription from the currentDescription object and set this text on
        // the description TextView.
        descriptionTextView.setText(currentDescription.getmDescription());

        // Find the TextView in the list_item.xml layout with the ID place_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        // Get the place from the currentDescription object and set this text on
        // the place TextView.
        defaultTextView.setText(currentDescription.getmPlace());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Check if an image is provided for this word or not
        if (currentDescription.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentDescription.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;


    }
}