package com.palibre.test.pushgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private NotificationCompat.Builder notification;
    private static final int uniqueId = 352638;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);

    }
    void onClick (View v) {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }
}
