package com.example.calcucomver.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Méndez on 05/04/2014.
 */
public class LoginIsaac extends ActionBarActivity {

    protected TextView Conectarse;
    protected TextView Saltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Conectarse = (TextView)findViewById(R.id.ButtonSignUp);
        Conectarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginIsaac.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        Saltar = (TextView)findViewById(R.id.txtSkip);
        Saltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skipActivity();
            }
        });
    }

    public void skipActivity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
