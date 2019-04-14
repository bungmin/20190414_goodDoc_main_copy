package com.hh.a20190414_gooddoc_main_copy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // ID : tjeit, PW : qwer1234 가 입력된 상태로
    // 로그인 버튼을 누르면 => 메인액티비티로 이동
    // 아이디나 비번이 위의 값이 아니라면, 토스트로 "로그인에 실패했습니다. ID/PW 를 확인해주세요."

    EditText userIdEdit;
    EditText userPwEdit;
    Button okLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userIdEdit = findViewById(R.id.userIdEdit);
        userPwEdit = findViewById(R.id.userPwEdit);
        okLogin = findViewById(R.id.okLogin);



        okLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userText = userIdEdit.getText().toString();
                String userPw = userPwEdit.getText().toString();

                /*if (userText.equals("tjeit") && userPw.equals("qwer1234")){

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(LoginActivity.this, "로그인에 실패했습니다. \n ID/PW 를 확인해주세요.", Toast.LENGTH_SHORT).show();

                }*/

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("user_id",userText);
                startActivity(intent);
                finish();




            }
        });


    }
}
