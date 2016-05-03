package com.juanjosegallego.practicamapas;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class sanjose extends Fragment {

    Button boton;


    public sanjose() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_sanjose, container, false);
        boton = (Button) root.findViewById(R.id.boton9);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mapa10 = new Intent(getActivity(), josemaps.class);
                startActivity(mapa10);

            }
        });

        return root;
    }
}