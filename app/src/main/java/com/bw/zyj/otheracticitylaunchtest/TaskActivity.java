package com.bw.zyj.otheracticitylaunchtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        findViewById(R.id.singleTaskSame_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskActivity.this, TaskTestActivity.class);

                startActivity(intent);
            }
        });
        int count = 0;
        count++;
        Log.e("SingleTask", "task---create"+count);
    }

    @Override
    protected void onStart() {
        super.onStart();
        int count = 0;
        count++;
        Log.e("SingleTask", "task---start"+count);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int count = 0;
        count++;
        Log.e("SingleTask", "task---resume"+count);
    }

    @Override
    protected void onPause() {
        super.onPause();
        int count = 0;
        count++;
        Log.e("SingleTask", "task---pause"+count);
    }

    @Override
    protected void onStop() {
        super.onStop();
        int count = 0;
        count++;
        Log.e("SingleTask", "task---stop"+count);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        int count = 0;
        count++;
        Log.e("SingleTask", "task---restart"+count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int count = 0;
        count++;
        Log.e("SingleTask", "task---destory"+count);
    }
}
