package com.mixcat.helper;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Helper {
    private final Context mContext;

    public Helper(final @NonNull Context context) {
        this.mContext = context;
    }

    public void show() {
        Toast.makeText(mContext, "Sample Library", Toast.LENGTH_SHORT).show();
    }
}
