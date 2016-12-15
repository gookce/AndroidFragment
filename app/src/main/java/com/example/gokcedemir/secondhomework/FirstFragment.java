package com.example.gokcedemir.secondhomework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        Button buton = (Button) getActivity().findViewById(R.id.btnSend);

        buton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText adText = (EditText)getActivity().findViewById(R.id.adtextEdit);
                EditText soyadText = (EditText)getActivity().findViewById(R.id.soyadtextEdit);

                String data = adText.getText().toString()+" "+soyadText.getText().toString();

                TextView text = (TextView) getActivity().findViewById(R.id.lbperson);
                text.setText(data);

                Toast.makeText(getActivity(),"Successful :) Please scroll for other fragment ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
