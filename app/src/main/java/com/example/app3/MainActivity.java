package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button act1, act2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act1 = findViewById(R.id.bt1);
        act2 = findViewById(R.id.bt2);

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadFragment(new BlankFragment());
            }
        });
        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadFragment(new BlankFragment2());
            }
        });

    }
    public void LoadFragment(Fragment fragment)
    {
        FragmentManager f=getSupportFragmentManager();
        FragmentTransaction ff=f.beginTransaction();
        ff.replace(R.id.F, fragment );
        ff.commit();

    }
}