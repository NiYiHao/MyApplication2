package com.example.administrator.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder builder;
    private Dialog dialog;
    String[] str_Fruit={"蘋果", "香蕉" , "鳳梨" , "奇異果"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAlert=findViewById(R.id.btnAlert);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("來了還敢走！！？")
                        .setIcon(R.mipmap.question)
                        .setMessage("想離開，要付出代價的，先露肚臍道歉")
                        .setPositiveButton("付代價", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                dialog=builder.create();
                dialog.show();
            }
        });
        Button btnFruit = findViewById(R.id.btnFruit);
        btnFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder =new AlertDialog.Builder(MainActivity.this)
                        .setTitle("咬蘋果最常見")
                        .setIcon(R.mipmap.pineapple)
                        //.setMessage("就像祭拜的神豬一樣，選擇一個你想咬的水果吧！！")
                        .setSingleChoiceItems(str_Fruit, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"你選擇了"
                                        +str_Fruit[which]+"，但是還是咬榴槤吧！！",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog=builder.create();//
                                dialog.show();//顯示出dialog
            }
        });
    }
}
