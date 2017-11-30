package com.example.fauza.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements InterfaceParent {

    private FragmentManager fragmentManager;
    private FragmentInput fragmentInput;
    private FragmentA fragmentA;
    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fragmentInput = new FragmentInput();
        this.fragmentInput.setParent(this);
        this.fragmentA = new FragmentA();
        this.fragmentB = new FragmentB();

        this.fragmentManager = this.getSupportFragmentManager();
        this.fragmentManager.beginTransaction()
                .add(R.id.fragment_input, this.fragmentInput)
                .add(R.id.fragment_content, this.fragmentA)
                .commit();
    }

    @Override
    public void gantiA() {
        this.fragmentManager.beginTransaction()
                .replace(R.id.fragment_content, this.fragmentA)
                .commit();
    }

    @Override
    public void gantiB() {
        this.fragmentManager.beginTransaction()
                .replace(R.id.fragment_content, this.fragmentB)
                .commit();
    }

    @Override
    public void sendData(String data) {
        try {
            this.fragmentA.setContent(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.fragmentB.setContent(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
