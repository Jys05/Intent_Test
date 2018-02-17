package com.example.mrsu.intent_test;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onToSecondActivityClick(View view) {
//        Intent intent = new Intent(this, SecondActivity.class);
        Intent intent = new Intent();

//        //方法一：setComponent
//        ComponentName componentName  = new ComponentName(this.getPackageName() , SecondActivity.class.getName());
//        intent.setComponent(componentName);

//        //方法二：setComponent
//        ComponentName componentName  = new ComponentName(this, SecondActivity.class.getName());
//        intent.setComponent(componentName);

//        //方法三：setClass
//        intent.setClass(this, SecondActivity.class);

//        //方法四：setClassName
//        intent.setClassName(this, SecondActivity.class.getName());


//        //方法五：setClassName
//        intent.setClassName(this.getPackageName(), SecondActivity.class.getName());

        startActivity(intent);


    }
}
