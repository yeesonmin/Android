package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void  onBtnClick1(View v)
    {
        Toast.makeText(this, "버튼이 눌림",Toast.LENGTH_LONG).show(); //작은 메세지창이 뜬다.

    }

    public  void  onBtnClick2(View v)
    {
        Toast.makeText(this, "버튼2이 눌림",Toast.LENGTH_LONG).show(); //작은 메세지창이 뜬다.

    }
    public  void  onBtnClick3(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
        startActivity(intent);

    }
    public  void  onBtnClick4(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0000"));
        startActivity(intent);

    }

}
