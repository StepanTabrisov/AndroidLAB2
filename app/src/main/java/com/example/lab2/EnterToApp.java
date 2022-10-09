package com.example.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class EnterToApp extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_scene);

        Button enter = findViewById(R.id.enterBtn);
        EditText inName = findViewById(R.id.inputName);
        EditText inPsw = findViewById(R.id.inputPassword);

        Intent intent = new Intent(this, SecondActivity.class);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
