/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //Create an arraylist of words
        // This is a custom list as it requires two list items
        ArrayList<Word> words = new ArrayList<Word>();

        /*// Creating a new word object
        Word w = new Word("lutti","one");
        // Adding word object to arraylist words
        words.add(w);*/

       // Above two line of codes can be combined as follows
        words.add(new Word("lutti","one",R.drawable.number_one));
        words.add(new Word("otiiko","two",R.drawable.number_two));
        words.add(new Word("tolookosu","three",R.drawable.number_three));
        words.add(new Word("oyyisa","four",R.drawable.number_four));
        words.add(new Word("massokka","five",R.drawable.number_five));
        words.add(new Word("temmokka","six",R.drawable.number_six));
        words.add(new Word("lutti","seven",R.drawable.number_seven));
        words.add(new Word("lutti","eight", R.drawable.number_eight));
        words.add(new Word("l","nine", R.drawable.number_nine));
        words.add(new Word("m","ten", R.drawable.number_ten));


        WordAdapter itemsAdapter= new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }

}


