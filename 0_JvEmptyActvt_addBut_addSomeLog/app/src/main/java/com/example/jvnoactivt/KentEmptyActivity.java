package com.example.jvnoactivt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KentEmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
    }

    TextView textView;
    int flag = 0;

    /**
     * Called when the user touches the button
     */
    public void sendMessage(View view) {
        // Do something in response to button click
        //使用findViewById 得到TextView对象
        textView = (TextView) findViewById(R.id.textView2);
//使用setText()方法修改文本
//        textView.setText(R.string.modify);
//        textView.setBackgroundColor( 0xff00ff );
        if (flag < 100) flag++;
        else flag = 0;

        textView.setText("you have clicked once. flag = " + flag);

        if (flag % 2 == 0)  textView.setTextColor(0xff00ffff);
        else textView.setTextColor(0x00ff00ff);
    }
}