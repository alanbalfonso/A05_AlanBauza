package com.example.alan_uimenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class homeScreen extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewOnScreen = inflater.inflate(R.layout.fragment_home_screen, container, false);
        // Inflate the layout for this fragment
        return viewOnScreen;
    }
}