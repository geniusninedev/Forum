package com.geniusnine.android.forum;

import com.firebase.client.Firebase;

/**
 * Created by Supriya on 14-03-2017.
 */

public class CustomApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}