package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPlus(View view) {
        EditText editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textView = findViewById(R.id.activity_main__textView);

        editTextNum1.setText(editTextNum1.getText().toString().trim());
        editTextNum2.setText(editTextNum2.getText().toString().trim());

        if( editTextNum1.getText().toString().length() == 0 ){
            Toast.makeText(getApplicationContext(),"숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
            return ;
        }
        if( editTextNum2.getText().toString().length() == 0 ){
            Toast.makeText(getApplicationContext(), "숫자를 입력해주세요.", Toast.LENGTH_SHORT).show();
            return ;
        }

        int num1 = Integer.parseInt(editTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextNum2.getText().toString());

        int rs = num1 + num2;

        textView.setText("결과 : " + rs);
    }

    public void btnClear(View view) {
        EditText editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        EditText editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        TextView textView = findViewById(R.id.activity_main__textView);

        editTextNum1.setText("");
        editTextNum2.setText("");
        textView.setText("");

        Toast.makeText(getApplicationContext(), "초기화 되었습니다.", Toast.LENGTH_SHORT).show();

    }
}