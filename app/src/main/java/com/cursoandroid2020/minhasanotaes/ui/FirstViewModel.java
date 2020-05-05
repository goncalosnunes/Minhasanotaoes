package com.cursoandroid2020.minhasanotaes.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FirstViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is contact fragment");
    }

    public void select(String item) {
        mText.setValue(item);
    }

    public LiveData<String> getSelected() {
        return mText;
    }
}
