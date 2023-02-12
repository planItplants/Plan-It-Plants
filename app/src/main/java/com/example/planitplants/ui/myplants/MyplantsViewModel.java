package com.example.planitplants.ui.myplants;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyplantsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MyplantsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is My Plants fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}