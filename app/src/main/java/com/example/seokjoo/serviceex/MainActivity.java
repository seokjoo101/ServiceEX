package com.example.seokjoo.serviceex;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bServiceStart ;
        bServiceStart =  (Button) findViewById(R.id.serviceStart);

        bServiceStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starts();

            }
        });

    }

    void starts(){

        Intent service = new Intent(this,MyService.class);
        startService(service);

    }
}
