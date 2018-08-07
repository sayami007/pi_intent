package com.planetinnovative.pi_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        final EditText tvUserName = findViewById(R.id.tvUsername);
        Button btnSend = findViewById(R.id.sendButton);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

                intent.putExtra(Constant.KEY_USERNAME, tvUserName.getText().toString());
                intent.putExtra("AGE", 123);
                intent.putExtra("Married", false);

                setResult(Constant.NAME_CODE_RESULT, intent);
                finish();
            }
        });
    }
}
