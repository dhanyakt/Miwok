package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sanjudhanya on 11/3/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwok_text);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        TextView englishText = (TextView) listItemView.findViewById(R.id.english_text);
        miwokText.setText(currentWord.getMiwokTranslation());
        englishText.setText(currentWord.getEnglishTranslation());


        // Find the ImageView in the list_item.xmlem.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceid());
        } else {
            imageView.setVisibility(View.GONE);
        }

        View listContainer = listItemView.findViewById(R.id.list_item_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        listContainer.setBackgroundColor(color);

        // Set the theme color for list item




        return listItemView;


        //return super.getView(position, convertView, parent);
    }
}
