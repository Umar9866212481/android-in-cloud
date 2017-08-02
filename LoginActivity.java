package com.example.cvr.applogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button b1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.USREDT);
        password=(EditText)findViewById(R.id.PSWEDT);
        b1=(Button)findViewById(R.id.LOGBTN);

    }
    public void login(View v)
    {
        String user=username.getText().toString();
        String pass=password.getText().toString();
        if(user.equals("CVR") && pass.equals("CSE"))
        {

            Toast.makeText(getBaseContext(),"Valid User",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
            //intent.putExtra("NAME",user);
            //intent.putExtra("PASS",pass);
            Bundle bundle=new Bundle();
            bundle.putString("NAME",user);
            bundle.putString("PASS",pass);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(),"In-Valid User",Toast.LENGTH_LONG).show();

        }
    }
}
