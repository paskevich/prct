package com.example.paskevich.imprecity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.paskevich.imprecity.utils.AuthorizationUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!AuthorizationUtils.isAuthorized(this)) {
            onLogout();
            return;
        }

        Intent intent = new Intent(this, TabbedActivity.class);
        startActivity(intent);
        //exit or smth else
    }

    private void onLogout()
    {
        Intent login = new Intent(this, LoginActivity.class);
        login.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(login);
        finish();
    }

}
