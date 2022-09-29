package com.example.iconictravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Thread.sleep(3000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                Intent goToHome = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(goToHome);
                finish();
            }
        }).start();




    }
}