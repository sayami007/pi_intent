package com.planetinnovative.pi_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetAgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_aget);

        final EditText tvUserName = findViewById(R.id.tvAge);
        Button btnSend = findViewById(R.id.sendAge);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.putExtra(Constant.KEY_USERNAME, tvUserName.getText().toString());
                setResult(Constant.AGE_CODE_RESULT, intent);
                finish();
            }
        });
    }
}
