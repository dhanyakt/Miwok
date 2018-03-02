package com.example.android.miwok;

/**
 * Created by sanjudhanya on 11/3/2017.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String miwokTranslation;
    private String englishTranslation;
    // Initially setting the Word object with no image
    private int imageResourceid = NO_IMAGE_PROVIDED;

    /* Create a new word object
        @param miwokTranslation for setting miword word
        @param englishTranslation for the default given english word
     */

    public Word(String miwokTranslation, String englishTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.englishTranslation = englishTranslation;
    }


    /* Create a Word Object
    @param imageResourceId for the word which provides images for associated words
     */

    public Word(String miwokTranslation, String englishTranslation, int imageResourceid ) {
        this.miwokTranslation = miwokTranslation;
        this.englishTranslation = englishTranslation;
        this.imageResourceid = imageResourceid;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        this.englishTranslation = englishTranslation;
    }



    public int getImageResourceid() {
        return imageResourceid;
    }

    public void setImageResourceid(int imageResourceid) {
        this.imageResourceid = imageResourceid;
    }

    /* Returns whether there is an image associated with the word

     */

    public boolean hasImage() {
       return imageResourceid != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", englishTranslation='" + englishTranslation + '\'' +
                ", imageResourceid=" + imageResourceid +
                '}';
    }

}
