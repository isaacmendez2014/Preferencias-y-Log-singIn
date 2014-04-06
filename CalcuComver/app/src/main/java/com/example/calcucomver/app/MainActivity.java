package com.example.calcucomver.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertidor;
        convertidor = (Button) findViewById(R.id.buttonConv);
        convertidor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                convertir();
            }
        });

        Button calculadora;
        calculadora = (Button) findViewById(R.id.buttonCalc);
        calculadora.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcular();
            }
        });

        Button login;
        login = (Button) findViewById(R.id.buttonLog);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                logear();
            }
        });
    }

    private void convertir() {
        Intent intent = new Intent(this, Convertidor.class);
        startActivityForResult(intent, 0);
    }

    private void calcular() {
        Intent intent = new Intent(this, Calculadora.class);
        startActivityForResult(intent, 0);
    }

    private void logear() {
        Intent intent = new Intent(this, LoginIsaac.class);
        startActivityForResult(intent, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
