package com.cursoandroid2020.minhasanotaes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {

    private final String ARQUIVO_PREFERENCIA = "ArquivoReferencia";
    private final String CHAVE_NOME = "nome";
    private SharedPreferences preferences;
    private Context context;
    private SharedPreferences.Editor editor;

    public AnotacaoPreferencias(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao){
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();
    }

    public String recuperarAnotacao(){
        if(preferences.contains(CHAVE_NOME)){
            return preferences.getString(CHAVE_NOME, "Olá, usuário indefinido");
        }else{
            return "";
        }
    }
}
