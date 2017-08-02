package com.example.cvr.applogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    EditText et;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        et=(EditText)findViewById(R.id.resEDT);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String name=bundle.getString("NAME");
        String pass=bundle.getString("PASS");

        // String name=intent.getStringExtra("NAME");
        //String pass=intent.getStringExtra("PASS");

        //String data=et.getText().toString();


        et.setText(name+" "+pass);

    }
}
