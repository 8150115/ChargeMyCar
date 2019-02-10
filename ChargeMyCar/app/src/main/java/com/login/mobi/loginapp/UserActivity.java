package com.login.mobi.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);



        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()


        {

            public void onClick(View arg0) {

                Intent intent=new Intent(UserActivity.this,MapsActivity.class);
                startActivity(intent);
            }

        });
    }
}
