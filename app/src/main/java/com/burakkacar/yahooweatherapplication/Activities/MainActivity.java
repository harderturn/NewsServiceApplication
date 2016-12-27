package com.burakkacar.yahooweatherapplication.Activities;

import android.support.v4.app.Fragment;

import com.burakkacar.yahooweatherapplication.Fragments.FragmentKarsilama;

public class MainActivity extends SingleFragmentActivity {

    @Override
    public Fragment CreateFragment() {
        return new FragmentKarsilama();
    }

}
