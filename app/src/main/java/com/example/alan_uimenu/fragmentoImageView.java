package com.example.alan_uimenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentoImageView extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewImageView = inflater.inflate(R.layout.fragment_fragmento_image_view, container, false);

        return viewImageView;
    }
}
