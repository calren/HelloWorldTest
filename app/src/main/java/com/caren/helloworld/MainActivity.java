package com.caren.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printOutUsernames() {
        List<User> allTheNames = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Log.i("MainActivity", allTheNames.get(i).name);
        }
    }

    public void printOutDates() {
        
    }

    public class User {
        String name;
    }
}
