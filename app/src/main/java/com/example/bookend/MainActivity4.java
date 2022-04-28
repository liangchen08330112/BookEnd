package com.example.bookend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button://查询
                Intent intent = new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.button2://退出
                intent = new Intent(MainActivity4.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.button3://购买指南
                intent = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
                break;
        }
    }
}