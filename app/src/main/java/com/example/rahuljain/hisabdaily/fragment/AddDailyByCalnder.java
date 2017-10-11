package com.example.rahuljain.hisabdaily.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahuljain.hisabdaily.R;


public class AddDailyByCalnder extends Fragment {

    public AddDailyByCalnder() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_daily_by_calnder, container, false);


        return view;
    }
}
