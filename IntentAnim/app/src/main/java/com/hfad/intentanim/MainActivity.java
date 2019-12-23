package com.hfad.intentanim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Button button;
    String NameSend = "Chen";

    //自定義方法
    AnimStyle animstyle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animstyle = new AnimStyle();

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                //new一個intent物件，並指定Activity切換的class
                intent.setClass(MainActivity.this , TwoActivity.class);
                intent.putExtra("name",NameSend);//可放所有基本類別
                startActivity(intent);

                //設定動畫
                int AnimInNumber = (int)(Math.random() * 4);
                int AnimOutNumber = (int)(Math.random() * 4);
                overridePendingTransition(animstyle.AnimInStyle(AnimInNumber), animstyle.AnimOutStyle(AnimOutNumber));

                MainActivity.this.finish();//結束目前Activity
            }
        });
    }
}
