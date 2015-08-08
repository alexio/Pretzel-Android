package com.nytimes.pretzels;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by alexio on 7/27/15.
 */
public class NYTApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "TQ4PO2mdMvHaO6kRdG6wTaRUpyXUwB9zbsweixBf", "ymd56771SPlaUYyVL1jNqNQYJ9RNaczmUpnN32ZU");
    }
}
