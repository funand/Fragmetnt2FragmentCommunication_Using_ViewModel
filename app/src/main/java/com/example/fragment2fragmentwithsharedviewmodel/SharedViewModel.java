package com.example.fragment2fragmentwithsharedviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<CharSequence> text =  new MutableLiveData<>();

    public void setText(CharSequence input){
        text.setValue(input);
    }//setvalue ui thread
    //postvalue background thread

    public LiveData<CharSequence> getText(){
        return text;
    }
}
