package com.example.myapplication;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

public class Reservation extends AppCompatActivity {
    SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
    SharedPreferences.Editor editor=sharedPref.edit();


    public void timecommit(int timeset) {
        editor.putInt("time",timeset);
        editor.commit();
    }


    public int timeread() {
        int timeset = sharedPref.getInt("time",0);
        return timeset;
    }

    public void swcommit(boolean swset){
        editor.putBoolean("switch",swset);
        editor.commit();
    }

    public boolean swread() {
        boolean swset = sharedPref.getBoolean("swtich", false);
        return swset;
    }
}
