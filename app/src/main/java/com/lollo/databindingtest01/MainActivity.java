package com.lollo.databindingtest01;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lollo.databindingtest01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("lollo");
        binding.setUser(user);
        binding.changeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.name.set("wang");
            }
        });
    }
}
