package com.planetinnovative.pi_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvUsername;
    private Button getName, getAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvUsername = findViewById(R.id.tvUsername);
        getName = findViewById(R.id.getName);
        getAge = findViewById(R.id.getAge);
        getName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GetNameActivity.class);
                startActivityForResult(intent, Constant.NAME_CODE);
            }
        });
        getAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GetAgetActivity.class);
                startActivityForResult(intent, Constant.AGE_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constant.NAME_CODE) {
            if (resultCode == Constant.NAME_CODE_RESULT) {
                tvUsername.setText(data.getStringExtra(Constant.KEY_USERNAME));
            }
        } else if (requestCode == Constant.AGE_CODE) {
            if (resultCode == Constant.AGE_CODE_RESULT) {
                tvUsername.setText(data.getStringExtra(Constant.KEY_USERNAME));
            }
        }

    }
}
