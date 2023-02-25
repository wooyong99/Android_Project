package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextNum1;
    EditText editTextNum2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        textView = findViewById(R.id.activity_main__textView);
    }

    public void btnPlus(View view) {
        if (!checkInputValue()) {
            return;
        }

//        공백 제거한 요소 값의 길이가 0이 아닐경우 int로 형변환
        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());

        int rs = num1 + num2;

//        결과 값을 나타내기 위한 textView 요소 text 값을 설정
        textView.setText("결과 : " + rs);
    }

    private boolean checkInputValue() {
        //        요소의 값이 공백이 있는 경우를 대비하여 공백제거 코드
        editTextNum1.setText(editTextNum1.getText().toString().trim());
        editTextNum2.setText(editTextNum2.getText().toString().trim());

//        공백 제거한 요소 값의 길이가 0일 경우 코드 구현
        if (editTextNum1.getText().toString().length() == 0) {
            Toast.makeText(getApplicationContext(), "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextNum1.requestFocus();
            return false;
        }
        if (editTextNum2.getText().toString().length() == 0) {
            Toast.makeText(getApplicationContext(), "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextNum2.requestFocus();
            return false;
        }
        return true;
    }

    public void btnClear(View view) {
//        모든 요소의 text 값을 초기화
        editTextNum1.setText("");
        editTextNum2.setText("");
        textView.setText("");

//        하단 메시지 알림 표시
        Toast.makeText(getApplicationContext(), "초기화 되었습니다.", Toast.LENGTH_SHORT).show();

    }

    public void btnMinus(View view) {
        if(!checkInputValue()){
            return ;
        }

        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());
        int rs = num1 - num2;
        textView.setText("결과 : " + rs);

    }
}