package com.example.vraun.aroundme;

/**
 * Created by vraun on 25-01-2017.
 */

public class Description {
    /**
     * Image resource ID
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Description
     */
    private String mDescription;

    /**
     * Place in New Delhi.
     */
    private String mPlace;


    /**
     * Create a new  object.
     *
     * @param description
     * @param imageResourceId
     */
    public Description(String description ,   String place , int imageResourceId ) {
        mDescription = description ;
        mPlace = place;
        mImageResourceId = imageResourceId;


    }
    /**
     * Get the description.
     */
    public String getmDescription(){return mDescription;}

    /**
     * Get the Place.
     */
    public String getmPlace(){return mPlace;}

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED;}

}
