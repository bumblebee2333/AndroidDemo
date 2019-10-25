package com.lxy.handlerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Client client;
    private Server server;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        client = new Client();
        client.start();
        server = new Server();
        server.start();
    }
}
