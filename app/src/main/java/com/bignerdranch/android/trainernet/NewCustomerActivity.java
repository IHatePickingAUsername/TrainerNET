package com.bignerdranch.android.trainernet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Admin on 9/25/2017.
 */

public class NewCustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_customer);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new Fragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_new_customer, container, false);

        EditText mFirstET = (EditText) view.findViewById(R.id.newCustomerFirstET);
        EditText mLastET = (EditText) view.findViewById(R.id.newCustomerLastET);
        EditText mAddressET = (EditText) view.findViewById(R.id.newCustomerAddressET);
        EditText mCityET = (EditText) view.findViewById(R.id.newCustomerCityET);
        EditText mStateET = (EditText) view.findViewById(R.id.newCustomerStateET);
        EditText mZipET = (EditText) view.findViewById(R.id.newCustomerZipET);
        EditText mPhoneET = (EditText) view.findViewById(R.id.newCustomerPhoneET);

        Button mSaveBT = (Button) view.findViewById(R.id.newCustomerSaveBT);
        mSaveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Save information here
            }
        });
        return view;
    }
}
