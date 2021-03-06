package com.example.android.miwok;

import android.content.Context;
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
 * Created by karthik zee on 8/24/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorRscId;
    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int mColorRscId) {
        super(context, 0,words);
        this.mColorRscId = mColorRscId;
    }

    @NonNull
    @Override
    //getView need to be overriden to get custom word objects
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if(listView==null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);

        TextView englishWord = (TextView)listView.findViewById(R.id.english_word);
        englishWord.setText(currentWord.getEnglish_word());

        TextView miwokWord = (TextView) listView.findViewById(R.id.miwok_word);
        miwokWord.setText(currentWord.getMiwok_word());

        View container = listView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorRscId);
        container.setBackgroundColor(color);

        ImageView image = (ImageView)listView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getResourceId());
        }
        else
            image.setVisibility(View.GONE);
        return  listView;


    }
}
