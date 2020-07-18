package com.akshaytech.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class StartActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button = findViewById(R.id.btnsubmit);
        radioGroup = findViewById(R.id.RG);
    }

    public void Submit(View view) {
        int id = radioGroup.getCheckedRadioButtonId();
        if (id == R.id.rb2) {
            Animation animation = AnimationUtils.loadAnimation(StartActivity.this, R.anim.bounce);
            button.startAnimation(animation);
            Intent intent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else{
            Animation animation = AnimationUtils.loadAnimation(StartActivity.this, R.anim.bounce);
            button.startAnimation(animation);
            Intent intent = new Intent(StartActivity.this,Main2Activity.class);
            startActivity(intent);

        }
    }
}