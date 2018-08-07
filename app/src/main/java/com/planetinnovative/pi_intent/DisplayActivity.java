package com.planetinnovative.pi_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView tvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tvUserName = findViewById(R.id.tvUsername);
        Intent intent = getIntent();
        tvUserName.setText("Hello, " + intent.getStringExtra(Constant.KEY_USERNAME));
    }
}
