package com.example.myapplication;

import android.util.Log;

public class EnableRM implements Observer {
    private  boolean enableString;
    private  PreferenceTask mTask;

    public EnableRM(PreferenceTask preferenceTask){
        this.mTask = preferenceTask;
        mTask.add(this);
    }

    @Override
    public void update(String hour, String minute, boolean enable) {
        enableString = enable;
    }







}
