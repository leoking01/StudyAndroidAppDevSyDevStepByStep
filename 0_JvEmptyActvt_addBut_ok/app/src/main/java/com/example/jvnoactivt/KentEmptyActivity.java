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
        if (flag < 100) flag++;
        else flag = 0;
        textView.setText("you have clicked once. flag = " + flag);
        if (flag % 3 == 0)  {
            textView.setTextColor(0xffff0000); //   透明度   rgb
        }
        else if (flag % 3 == 1)  {
            textView.setTextColor(0xff00ff00);
        }
        else if (flag % 3 == 2)  {
            textView.setTextColor(0xff0000ff);
        }
    }
}