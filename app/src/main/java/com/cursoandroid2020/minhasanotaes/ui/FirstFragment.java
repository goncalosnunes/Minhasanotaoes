package com.cursoandroid2020.minhasanotaes.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cursoandroid2020.minhasanotaes.MyInterface;
import com.cursoandroid2020.minhasanotaes.R;

public class FirstFragment extends Fragment {

    private MyInterface listener;
    private final String ARQUIVO_PREFERENCIA = "ArquivoReferencia";
    private SharedPreferences preferences;
    private EditText savedata;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MyInterface) {
            listener = (MyInterface) context;
        }
    }

    @Override
    public void onDetach() {
        listener = null;
        super.onDetach();
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,


            Bundle savedInstanceState
    ) {
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        savedata = (EditText)root.findViewById(R.id.editTextAnotacao);
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }



}
