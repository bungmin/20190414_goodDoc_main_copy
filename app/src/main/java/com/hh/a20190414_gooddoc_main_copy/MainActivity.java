package com.hh.a20190414_gooddoc_main_copy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtSearch;
    Button btnSearch;
    TextView welcomeMsgTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSearch = findViewById(R.id.edtSearch);
        btnSearch = findViewById(R.id.btnSearch);
        welcomeMsgTxt = findViewById(R.id.welcomeMsgTxt);

        String loginUserId = getIntent().getStringExtra("user_id").toString();
        welcomeMsgTxt.setText(String.format("%s 님 환영합니다.", loginUserId));

        
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String edtText = edtSearch.getText().toString();
                String formatEdtText = String.format("[%s]", edtText);


                Toast.makeText(MainActivity.this, formatEdtText, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
