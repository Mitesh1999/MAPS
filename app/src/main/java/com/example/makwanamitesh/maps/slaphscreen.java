package com.example.makwanamitesh.maps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class slaphscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_slaphscreen );

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(  slaphscreen.this, MapsActivity.class );
                startActivity( intent );
            }
        }, 2000 );

    }


}
