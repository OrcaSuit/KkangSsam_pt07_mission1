package com.example.myapplication;

import java.util.ArrayList;

public class ReservationMachine implements PreferenceTask {
    private ArrayList<Observer> observers;
    private String hour;
    private String minute;
    private boolean enable;

    public ReservationMachine() {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
            for(Observer observer : observers){
                observer.update(hour,minute,enable);
            }
    }

    public void setTimeinfo(String hour, String minute){
        this.hour = hour;
        this.minute = minute;
        notifyObserver();
    }

    public void setReservationinfo(boolean enable){
        this.enable = enable;
        notifyObserver();
    }

    public String getHour(){
        return hour;
    }

    public String getMinute(){
        return minute;
    }

    public boolean getEnable(){
        return enable;
    }
}
