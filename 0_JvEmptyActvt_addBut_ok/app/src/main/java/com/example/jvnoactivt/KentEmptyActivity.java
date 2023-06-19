package com.example.jvnoactivt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KentEmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.first_layout);
    }

    TextView textView;

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        //使用findViewById 得到TextView对象
        textView = (TextView)findViewById(R.id.textView2);
//使用setText()方法修改文本
//        textView.setText(R.string.modify);
        textView.setText( "you have clicked once.");
    }
}