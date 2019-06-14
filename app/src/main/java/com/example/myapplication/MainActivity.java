package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}



/*
package com.example.myapplication;


import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final String PREFERENCE = "settings_preference";
    public final String Enable = "reservation";

    FloatingActionButton fab;
    TextView timeTextView;
    Switch switchView;

    SharedPreferences.Editor mEditor;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context;

        ReservationMachine rm = new ReservationMachine();
        EnableRM erm = new EnableRM(rm);

        fab = findViewById(R.id.mission1_fab);
        fab.setOnClickListener(this);

        switchView = findViewById(R.id.mission1_switch);

        pref = getSharedPreferences(Context,MODE_PRIVATE);
        mEditor = pref.edit();

        //erm = switchView.isChecked();
       // erm.update(null,null,switchView.isChecked());
        //rm.setReservationinfo(switchView.isChecked());

    }


    @Override
    public void onClick(View v) {
        if(v==fab) {
            Calendar c = Calendar.getInstance();
            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    timeTextView = findViewById(R.id.mission1_time);
                    timeTextView.setText(hourOfDay+":"+minute);
                    switchView.setChecked(true);
                }
            }, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE),false);

            timePickerDialog.show();

        } else if (v==switchView) {
            mEditor.putBoolean(Enable,switchView.isChecked());
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        boolean checked = pref.getBoolean(Enable,false);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mEditor.putBoolean(Enable,switchView.isChecked());

    }
}*/

/*

/*

package com.example.myapplication;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final String PREFERENCE = "settings_preference";
    public final String Enable = "reservation";

    FloatingActionButton fab;
    TextView timeTextView;
    Switch switchView;

    SharedPreferences.Editor mEditor;
    SharedPreferences pref;

    boolean reservation;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.mission1_fab);
        fab.setOnClickListener(this);

        switchView = findViewById(R.id.mission1_switch);

        pref = getSharedPreferences(PREFERENCE,MODE_PRIVATE);
        mEditor = pref.edit();

    }


    @Override
    public void onClick(View v) {
        if(v==fab) {
            Calendar c = Calendar.getInstance();
            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    timeTextView = findViewById(R.id.mission1_time);
                    timeTextView.setText(hourOfDay+":"+minute);
                    setChecked(true);
                }
            }, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), false);

            timePickerDialog.show();

        } else if (v==switchView) {
            switchView.toggle();
        }
    }
    public void setChecked(boolean checked){
        if(checked == true){
            switchView.setChecked(true);
        } else {
            switchView.setChecked(false);
        }
        mEditor.putBoolean(Enable,checked); //등록
    }

    public boolean getChecked(){
        boolean checked = pref.getBoolean(Enable,false); //읽기
        return checked;
    }

    @Override
    protected void onResume() {
        super.onResume();
        setChecked(getChecked());
    }

    @Override
    protected void onPause() {
        super.onPause();
        mEditor.commit(); //저장
    }
}

*/
