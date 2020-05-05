package com.cursoandroid2020.minhasanotaes;

import android.os.Bundle;

import com.cursoandroid2020.minhasanotaes.ui.FirstFragment;
import com.cursoandroid2020.minhasanotaes.ui.FirstViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;

import android.view.View;
import android.widget.EditText;

@SuppressWarnings("ALL")
        public class MainActivity extends AppCompatActivity implements MyInterface{
    //private ViewModel firstViewModel;
    private FirstFragment firstFragment;
    private AnotacaoPreferencias preferencias;
    private EditText editAnotacao;
    private String anotacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferencias = new AnotacaoPreferencias(getApplicationContext());

        firstFragment = new FirstFragment();

        editAnotacao = new EditText(getApplicationContext());

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Teste4 " + editAnotacao.getText().toString());

                if(editAnotacao.equals("")){
                    Snackbar.make(view, "Preencha a anotação", Snackbar.LENGTH_LONG)
                            .show();
                }else{
                    preferencias.salvarAnotacao("BB");

                    System.out.println("TESTE1 " + editAnotacao.getText().toString());
                    Snackbar.make(view, "Anotação salva com sucesso", Snackbar.LENGTH_LONG)
                            .show();
                }
            }
        });


        //Recuperar anotacao
        anotacao = editAnotacao.getText().toString();
        if( !anotacao.equals("") ){
            doSomethingWithData( anotacao );
        }
        System.out.println("TESTE2 " + preferencias.recuperarAnotacao());
    }

    @Override
    public void doSomethingWithData(String anotacao) {

    }
}
