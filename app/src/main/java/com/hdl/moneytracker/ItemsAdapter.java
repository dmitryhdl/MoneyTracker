package com.hdl.moneytracker;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Item> {
    public ItemsAdapter(@NonNull Context context, int resource) {
        super(context,R.layout.item);
    }

}
