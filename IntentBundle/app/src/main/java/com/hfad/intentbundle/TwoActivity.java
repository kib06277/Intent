package com.hfad.intentbundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity
{
    Button button;
    TextView textView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twolayou);

        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        intent = this.getIntent();
        //取得傳遞過來的資料
        String name = intent.getStringExtra("name");
        textView.setText(name);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //new一個intent物件，並指定Activity切換的class
                intent.setClass(TwoActivity.this , MainActivity.class);
                startActivity(intent);
                TwoActivity.this.finish();//結束目前Activity
            }
        });
    }
}