package com.scurrae.chris.unitconversion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav);
        getDistance();
        getTemperature();
        getSuggestion();
        getRating();
    }

    public void getDistance(){

            Button b = (Button) findViewById(R.id.button6);

            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getBaseContext(), Distance.class);
                    startActivity(i);
                }
            });
        }
    public void getTemperature(){
            Button b = (Button) findViewById(R.id.button7);

            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getBaseContext(), Temperature.class);
                    startActivity(i);
                }
            });
        }
    public void getSuggestion(){
            Button b = (Button) findViewById(R.id.button3);

            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getBaseContext(), Suggestions.class);
                    startActivity(i);
                }
            });
        }
    public void getRating(){
            Button b = (Button) findViewById(R.id.button4);

            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getBaseContext(), Rate.class);
                    startActivity(i);
                }
            });
        }
}


