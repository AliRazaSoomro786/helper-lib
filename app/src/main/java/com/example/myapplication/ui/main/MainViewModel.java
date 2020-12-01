package com.example.myapplication.ui.main;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.myapplication.data.Record;

public class MainViewModel extends ViewModel {
    private final Record record;

    void onStart() {
        record.setName("Ali Raze");
        Log.d("TAG", record.getName());
    }

    MainViewModel(Record record) {
        this.record = record;
    }

}
