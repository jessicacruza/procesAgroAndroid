package com.wyble.nuevita.app;

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

        Button boton1 = (Button) findViewById(R.id.button1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(about);
            }
        });

        Button boton2 = (Button) findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(jairo);
            }
        });

        Button boton3 = (Button) findViewById(R.id.button3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(jairo);
            }
        });

        Button boton4 = (Button) findViewById(R.id.button4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(jairo);
            }
        });

        Button boton5 = (Button) findViewById(R.id.button5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(jairo);
            }
        });

        Button boton6 = (Button) findViewById(R.id.button6);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity7.class);
                startActivity(jairo);
            }
        });


        Button boton7 = (Button) findViewById(R.id.button7);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity8.class);
                startActivity(jairo);
            }
        });

        Button boton8 = (Button) findViewById(R.id.button8);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jairo = new Intent(MainActivity.this, MainActivity9.class);
                startActivity(jairo);
            }
        });
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
