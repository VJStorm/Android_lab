package com.baostorm.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.hubert.library.HighLight;
import com.app.hubert.library.NewbieGuide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestUI.class);
                startActivity(intent);
            }
        });
        NewbieGuide.with(this)
                .setLabel("guild1")
                .addHighLight(login, HighLight.Type.ROUND_RECTANGLE, 20)
                .setLayoutRes(R.layout.guide)
                .show();
    }
}
