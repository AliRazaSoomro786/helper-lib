package com.example.myapplication.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;
import com.example.myapplication.data.Record;
import com.example.myapplication.ui.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainViewModel> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        startLockTask();

    }

    @NonNull
    @Override
    protected MainViewModel createViewModel() {
        MainViewModelFactory factory = new MainViewModelFactory(new Record());
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }

    @OnClick(R.id.start)
    void start() {
        viewModel.onStart();
    }
}
