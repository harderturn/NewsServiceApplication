package com.burakkacar.yahooweatherapplication.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.burakkacar.yahooweatherapplication.R;

/**
 * Created by MuhammedBurak on 22.12.2016.
 */
public class FragmentKarsilama extends Fragment
{

    TextView tv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_karsilama,container,false);
        tv = (TextView)v.findViewById(R.id.myTextView);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //retrofite git secildi
                Fragment fragment = new FragmentRetroGetir();
                getFragmentManager().beginTransaction()
                        .replace(R.id.container_layout,fragment)
                        .addToBackStack("Retro")
                        .commit();
            }
        });


        return v;
    }


}
