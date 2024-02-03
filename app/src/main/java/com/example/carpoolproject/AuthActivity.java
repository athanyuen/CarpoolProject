package com.example.carpoolproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AuthActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private String selected;
    private Spinner sUserType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }
    @Override
    public void onStart(){

    }

    public void uploadData(FirebaseUser mUser){

    }
    public void signIn(View v){

    }
    public void signUp(View v){

    }
    public void updateUI(FirebaseUser user){

    }

}