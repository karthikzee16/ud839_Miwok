package com.example.android.miwok;

/**
 * Created by karthik zee on 8/23/2018.
 */

public class Word {
    String english_word;
    String miwok_word;
    int resourceId;
    int audiorscId;

    public Word(String english_word, String miwok_word, int audiorscId) {
        this.english_word = english_word;
        this.miwok_word = miwok_word;
        this.audiorscId = audiorscId;
    }

    public Word(String english_word, String miwok_word, int resourceId, int audiorscId) {
        this.english_word = english_word;
        this.miwok_word = miwok_word;
        this.resourceId = resourceId;
        this.audiorscId = audiorscId;
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

    public boolean hasImage(){
        if (this.resourceId>=1)
            return true;
        return false;

    }

    public int getAudiorscId() {
        return audiorscId;
    }
}
