package com.burakkacar.yahooweatherapplication.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.activeandroid.ActiveAndroid;
import com.burakkacar.yahooweatherapplication.R;

/**
 * Created by MuhammedBurak on 22.12.2016.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {

    public abstract Fragment CreateFragment();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActiveAndroid.initialize(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.container_layout);

        if (fragment == null)
        {
            Fragment myFragment = CreateFragment();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.container_layout,myFragment)
                    .commit();

        }


    }
}
