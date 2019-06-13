package com.example.myapplication;

public interface PreferenceTask {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObserver();
}
