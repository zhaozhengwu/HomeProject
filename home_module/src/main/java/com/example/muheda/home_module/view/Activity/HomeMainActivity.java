package com.example.muheda.home_module.view.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.muheda.base_module.Utils.IntentToActivity;
import com.example.muheda.home_module.R;

public class HomeMainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        tv=findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //IntentToActivity.skipToActivity(HomeMainActivity.this,Main2Activity.class);
            }
        });
        //更新版本4.0
    }
}
