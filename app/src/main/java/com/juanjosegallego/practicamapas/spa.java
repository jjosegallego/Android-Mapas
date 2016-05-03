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
public class spa extends Fragment {

    Button boton;


    public spa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_spa, container, false);
        boton = (Button) root.findViewById(R.id.boton10);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mapa11 = new Intent(getActivity(), spamaps.class);
                startActivity(mapa11);

            }
        });

        return root;
    }
}

