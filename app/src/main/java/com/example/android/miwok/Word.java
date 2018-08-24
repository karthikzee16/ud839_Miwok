package com.example.android.miwok;

/**
 * Created by karthik zee on 8/23/2018.
 */

public class Word {
    String english_word;
    String miwok_word;
    int resourceId;

    public Word(String english_word, String miwok_word) {
        this.english_word = english_word;
        this.miwok_word = miwok_word;
    }

    public Word(String english_word, String miwok_word, int resourceId) {
        this.english_word = english_word;
        this.miwok_word = miwok_word;
        this.resourceId = resourceId;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public int getResourceId() {
        return resourceId;
    }
}
