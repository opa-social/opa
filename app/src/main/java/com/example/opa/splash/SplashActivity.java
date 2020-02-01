package com.example.opa.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.opa.MainActivity;
import com.example.opa.R;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2500;
//    private FirebaseAuth mAuth;
//    private DatabaseReference mUserRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        //mAuth = FirebaseAuth.getInstance();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               // FirebaseUser currentUser = mAuth.getCurrentUser();
                Intent splashIntent;
//                if (currentUser == null) {
//                    splashIntent = new Intent(SplashActivity.this, LoginActivity.class);
//                } else {
//                    splashIntent = new Intent(SplashActivity.this, MainActivity.class);
//                }
                splashIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}