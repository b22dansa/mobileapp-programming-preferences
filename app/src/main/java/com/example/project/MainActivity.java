package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TextView SharedText;
    private Button button;

    private static final String SHARED_PREF_NAME = "myPref";
    private static final String KEY_TEXT = "myText";

    private String SavedText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedText = findViewById(R.id.TextViewTop);
        button = (Button) findViewById(R.id.ButtonToActivity2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();

            }
        });

    }

    public void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        SavedText = sharedPreferences.getString(KEY_TEXT,"");

        SharedText.setText("Your text: " + SavedText);
    }

    private void openSecondActivity() {

        Intent secondActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(secondActivityIntent);




    }


}
