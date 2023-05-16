package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {

    private EditText EditField;
    private Button buttonToMain;



    private static final String SHARED_PREF_NAME = "myPref";
    private static final String KEY_TEXT = "myText";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditField = (EditText) findViewById(R.id.EditTextField);
        buttonToMain = (Button) findViewById(R.id.ButtonToActivity);

        buttonToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_TEXT,EditField.getText().toString());
                editor.commit();

                finish();
            }
        });


    }




}
