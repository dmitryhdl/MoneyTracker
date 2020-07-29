package com.hdl.moneytracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainokno);

        /*
        Можно перенести переменные выше метода Create
         */
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText price = (EditText) findViewById(R.id.price);
        final Button add = (Button) findViewById(R.id.add);
        final ListView items = (ListView) findViewById(R.id.items);

        items.setAdapter(new ItemsAdapter() );


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Item(name.getText().toString(), Integer.valueOf(price.getText().toString()));
            }
        });


    }
}

