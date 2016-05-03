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
public class natural extends Fragment {

    Button boton;


    public natural() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_natural, container, false);
        boton = (Button) root.findViewById(R.id.boton7);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mapa7 = new Intent(getActivity(), naturalmaps.class);
                startActivity(mapa7);

            }
        });

        return root;
    }
}

