package com.example.bookend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookend.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_up,btn_registe;
    EditText et_name,et_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();//调用控件初始化方法
    }
    private void init(){//控件初始化方法
        et_name=(EditText) findViewById(R.id.et_username);
        et_password=(EditText) findViewById(R.id.et_password);
        btn_up=(Button) findViewById(R.id.btn_up);
        btn_registe=(Button) findViewById(R.id.btn_registe);
        btn_up.setOnClickListener(this);
        btn_registe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_up) {//登录功能
            Intent intent = getIntent();
            String Na = intent.getStringExtra("username");
            String Pwd = intent.getStringExtra("password");
            String name = et_name.getText().toString();//获取用户名
            String password = et_password.getText().toString();//获取密码
            if (name.equals(Na) && password.equals(Pwd)) {//判断输入是否等于注册内容
                startActivity(new Intent(this, MainActivity4.class));
                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
            }else if (name.equals("")||password.equals("")){
                Toast.makeText(MainActivity.this, "请输入用户名和密码", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
            }
        }else if (v.getId() == R.id.btn_registe){//进注册页面
            Intent intent = new Intent(MainActivity.this, com.example.bookend.MainActivity3.class);
            startActivity(intent);
        }
    }
//        String un = et_name.getText().toString();//获取用户名
//        String pw = et_password.getText().toString();//获取密码
//        if (un.equals("1234567890") && pw.equals("1234567890")) {//用户名1234567890 密码1234567890
//            Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this, MainActivity2.class);
//            startActivity(intent);
//        } else {
//            Toast.makeText(MainActivity.this, "用户名和密码输入有误", Toast.LENGTH_SHORT).show();
//        }
//    }
}