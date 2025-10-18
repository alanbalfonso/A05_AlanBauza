package com.example.alan_uimenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentoSeekBar extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewSeekBar = inflater.inflate(R.layout.fragment_fragmento_seek_bar, container, false);

        return viewSeekBar;
    }
}
