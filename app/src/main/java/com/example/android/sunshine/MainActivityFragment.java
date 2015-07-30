package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<String> forecastList = new ArrayList<String>();
        forecastList.add("Today - Sunny - 21/33");
        forecastList.add("Tomorrow - Cloudy - 20/29");
        forecastList.add("Saturday - Sunny - 21/34");
        forecastList.add("Sunday - Sunny - 20/30");

        return inflater.inflate(R.layout.fragment_main, container, false);



    }
}
