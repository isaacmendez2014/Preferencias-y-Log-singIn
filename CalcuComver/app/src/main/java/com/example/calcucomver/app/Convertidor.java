package com.example.calcucomver.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Convertidor extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);

        Button CF;
        Button FC;
        Button Regresar;
        
        CF = (Button) findViewById(R.id.buttoncf);
        FC = (Button) findViewById(R.id.buttonfc);
        Regresar = (Button) findViewById(R.id.buttonR);
        EditText grado = (EditText) findViewById(R.id.TxtDato);
        EditText resultado = (EditText) findViewById(R.id.TxtResu);

        CF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirCF();
            }
        });

        FC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirFC();
            }
        });

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regre();
            }
        });
    }

    private void convertirCF() {
        EditText grado = (EditText) findViewById(R.id.TxtDato);
        EditText resultado = (EditText) findViewById(R.id.TxtResu);
        float b=Float.parseFloat(grado.getText().toString());
        float d=(float)((b-32)*(1.8));
        resultado.setText(String.valueOf(d + "°F"));
    }

    private void convertirFC() {
        EditText grado = (EditText) findViewById(R.id.TxtDato);
        EditText resultado = (EditText) findViewById(R.id.TxtResu);
        float b=Float.parseFloat(grado.getText().toString());
        float d=(float)((b/1.8)+(32));
        resultado.setText(String.valueOf(d + "°C"));
    }

    private void Regre() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.convertidor, menu);
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
