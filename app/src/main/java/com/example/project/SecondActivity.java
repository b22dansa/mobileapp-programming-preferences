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

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditField = findViewById(R.id.EditTextField);
        buttonToMain = (Button) findViewById(R.id.ButtonToActivity1);

        buttonToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

    }

    private void openMainActivity() {
        Intent mainActivityIntent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(mainActivityIntent);


    }

}
