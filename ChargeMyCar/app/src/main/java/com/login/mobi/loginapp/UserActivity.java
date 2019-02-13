package com.login.mobi.loginapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.login.mobi.loginapp.API.Postos_inf;
import com.login.mobi.loginapp.Models.User;

public class UserActivity extends AppCompatActivity {

    private Button button;
    private Button buttonrecy;
    private Button buttoncamera;
    private String not = "ChargeMyCar";
    private String not1 = "Trabalho CMU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);



        button=(Button)findViewById(R.id.button);

        buttoncamera=(Button)findViewById(R.id.buttoncamera);

        button.setOnClickListener(new View.OnClickListener()


        {

            public void onClick(View arg0) {

                Intent intent=new Intent(UserActivity.this,MapsActivity.class);
                startActivity(intent);
                criarnotificacaodotrabalho();
                creatNotificationChannel();

            }
        });
    buttonrecy=findViewById(R.id.buttonrecycler);
        buttonrecy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserActivity.this, Postos_inf.class);
                startActivity(intent);
            }
        });
        buttoncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent=new Intent(UserActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });
    }

    public void criarnotificacaodotrabalho() {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, not1)
                .setSmallIcon(R.drawable.icon_maps)
                .setContentTitle("Verificação da Localização")
                .setContentText("Caro utilizador verifique se tem a permissão de localização ativada")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1, mBuilder.build());

    }

    private void creatNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = not;
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(not1, name, importance);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

}
