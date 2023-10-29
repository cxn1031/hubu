package com.example.work1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("life","activity2 is onCreate...");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life", "activity2 is onStart...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life", "activity2 is onRestart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("life", "activity2 is onPostResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life", "activity2 is onPuse...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life", "activity2 is onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life", "activity2 is onDestroy...");
    }

}