package com.example.alan_uimenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fragmentoTextView extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewTextView = inflater.inflate(R.layout.fragment_fragmento_text_view, container, false);

        return viewTextView;
    }
}
