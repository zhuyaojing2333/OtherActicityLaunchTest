package com.bw.zyj.otheracticitylaunchtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.top_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TopActivity.class);

                startActivity(intent);
            }
        });
        findViewById(R.id.task_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TaskActivity.class);

                startActivity(intent);
            }
        });
        findViewById(R.id.instance_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InstanceActivity.class);

                startActivity(intent);
            }
        });
        findViewById(R.id.standardSame_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StandardTestActivity.class);

                startActivity(intent);
            }
        });
        int count = 0;

        count++;


        Log.e("Standard", "standard---create"+count);
    }

    @Override
    protected void onStart() {
        super.onStart();
        int count = 0;
        //// STOPSHIP: 2016/11/28  
        count++;
        Log.e("Standard", "standard---start"+count);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int count = 0;

        count++;
        Log.e("Standard", "standard---resume"+count);
    }

    @Override
    protected void onPause() {
        super.onPause();
        int count = 0;

        count++;
        Log.e("Standard", "standard---pause"+count);
    }

    @Override
    protected void onStop() {
        super.onStop();
        int count = 0;

        count++;
        Log.e("Standard", "standard---stop"+count);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        int count = 0;

        count++;
        Log.e("Standard", "standard---restart"+count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int count = 0;

        count++;
        Log.e("Standard", "standard---destory"+count);
    }
}
