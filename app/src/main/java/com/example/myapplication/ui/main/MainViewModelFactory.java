package com.example.myapplication.ui.main;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.data.Record;

public class MainViewModelFactory implements ViewModelProvider.Factory {
    private final Record record;

    public MainViewModelFactory(Record record) {
        this.record = record;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(record);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
