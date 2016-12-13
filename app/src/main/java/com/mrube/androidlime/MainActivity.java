package com.mrube.androidlime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.mybuttoninxml);
        tv = (TextView) findViewById(R.id.mytext);

        tv.setText("Welcome Live Class Students!");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://imrubel.blogspot.com"));
                startActivity(i);

                Toast.makeText(getApplicationContext(), "Clicked on button!", Toast.LENGTH_LONG).show();


            }
        });


    }
}
