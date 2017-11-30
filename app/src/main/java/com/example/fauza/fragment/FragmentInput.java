package com.example.fauza.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentInput extends Fragment implements View.OnClickListener {
    private View view;
    private InterfaceParent parent;
    private Button buttonA;
    private Button buttonB;
    private Button buttonSend;
    private EditText editText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        this.view = (View) inflater.inflate(R.layout.fragment_input, container, false);

        this.buttonA = (Button) this.view.findViewById(R.id.button_fragment_a);
        this.buttonB = (Button) this.view.findViewById(R.id.button_fragment_b);
        this.buttonSend = (Button) this.view.findViewById(R.id.button_send);
        this.editText = (EditText) this.view.findViewById(R.id.edit_text_data);

        this.buttonA.setOnClickListener(this);
        this.buttonB.setOnClickListener(this);
        this.buttonSend.setOnClickListener(this);
        return this.view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_fragment_a:
                this.parent.gantiA();
                break;
            case R.id.button_fragment_b:
                this.parent.gantiB();
                break;
            case R.id.button_send:
                String data = editText.getText().toString();
                parent.sendData(data);
                break;
        }
    }

    public void setParent(InterfaceParent parent) {
        this.parent = parent;
    }

}
