package com.example.cjgreen.a04simplecalcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 변수 선언
    // activity_main.xml의 7개 위젯에 대응하는 위젯 변수 7개
    // 입력되는 2개 문자열을 저장할 문자열 변수 2개
    // 계산 결과를 저장할 정수 변수 1개
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //간단한 계산기 구현을 위한 코드 시작
        setTitle("간단한 계산기:첫번째 앱");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv= (Button) findViewById(R.id.BtnDiv);
        textResult = (TextView) findViewById(R.id.TextResult);

        // 더하기 버튼을 클릭할 때 처리할 내용
        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.length() == 0 || num2.length() == 0){
                    Toast.makeText(getApplicationContext(), "값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }else {
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });
        // 빼기 버튼을 클릭할 때 처리할 내용
        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.length() == 0 || num2.length() == 0){
                    Toast.makeText(getApplicationContext(), "값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }else {
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });
        // 나누기 버튼을 클릭할 때 처리할 내용
        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.length() == 0 || num2.length() == 0){
                    Toast.makeText(getApplicationContext(), "값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }else {
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });
        // 곱하기 버튼을 클릭할 때 처리할 내용
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.length() == 0 || num2.length() == 0){
                    Toast.makeText(getApplicationContext(), "값을 넣어주세요", Toast.LENGTH_SHORT).show();
                }else {
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
                return false;
            }
        });
    }//end of onCreate
}//end of class
