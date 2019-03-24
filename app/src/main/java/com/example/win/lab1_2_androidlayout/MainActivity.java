package com.example.win.lab1_2_androidlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button tolinear=null;
    Button toconstraint=null;
    Button totable=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //跳转界面到linear
        tolinear=findViewById(R.id.btn_main_to_linear);
        tolinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });
        //跳转界面到constraint
        toconstraint=findViewById(R.id.btn_main_to_constraint);
        toconstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ConstraintActivity.class);
                startActivity(intent);
            }
        });
        //跳转界面到TABLE
        totable=findViewById(R.id.btn_main_to_table);
        totable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });
    }
}
