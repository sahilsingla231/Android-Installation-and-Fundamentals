package com.example.sahil.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        Log.d("ActivityState","OnCreate()");
    }
    @Override
    protected void onStart() {
        super.onStart();
       // Log.d(tag "State",msg: "OnStart()");
        Log.d("ActivityState","OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityState","OnStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityState","OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityState","OnPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityState","OnDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityState","OnRestart()");
    }

}
