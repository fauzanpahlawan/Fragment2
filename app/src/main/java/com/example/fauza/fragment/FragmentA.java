package com.example.fauza.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {
    private View view;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        this.view = (View) inflater.inflate(R.layout.fragment_a, container, false);
        this.textView = view.findViewById(R.id.text_view_message);
        return this.view;

    }

    public void abc() {

    }

    public void setContent(String content) {
        this.textView.setText(content);
    }
}
