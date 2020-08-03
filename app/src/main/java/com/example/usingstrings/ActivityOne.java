package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        /* Capturing the widget textview2 to then object */
        textview2 = findViewById(R.id.textView2);

        /*Assigning the string to the text view */
        textview2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreat() Invoked");
    }

    public void onStart()
    {
        super.onStart();
        Log.i("Lifecycle","onStart() Invoked");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", "onRestart() Invoked");
    }

    public void onPause()
    {
        super.onPause();
        Log.i("Lifecycle","onPause() Invoked");
    }

    public void onResume()
    {
        super.onResume();
        Log.i("Lifecycle","onResume() Invoked");
    }

    public void onStop()
    {
        super.onStop();
        Log.i("Lifecycle","onStop() Invoked");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() Invoked");
    }

}