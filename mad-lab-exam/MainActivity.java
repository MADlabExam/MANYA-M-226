package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText cn,cp,pn,ag,em,co,us,ps;
    Button reg;
    CheckBox c1,c2;
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cn = (EditText)findViewById(R.id.cname);
        cp = (EditText)findViewById(R.id.cplace);
        pn = (EditText)findViewById(R.id.pname);
        ag = (EditText)findViewById(R.id.age);
        em = (EditText)findViewById(R.id.email);
        co = (EditText)findViewById(R.id.contact);
        us = (EditText)findViewById(R.id.username);
        ps = (EditText)findViewById(R.id.password);
        c1 = (CheckBox)findViewById(R.id.district);
        c2 = (CheckBox)findViewById(R.id.state);
        r1 = (RadioButton)findViewById(R.id.rb1);
        r1 = (RadioButton)findViewById(R.id.rb2);
        reg = (Button)findViewById(R.id.button);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cn.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter clubname",Toast.LENGTH_SHORT).show();
                }
                else   if(cp.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter clubplace",Toast.LENGTH_SHORT).show();
                }
                else   if(pn.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter player name",Toast.LENGTH_SHORT).show();
                }
                else   if(ag.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter age",Toast.LENGTH_SHORT).show();
                }
                else   if(em.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter email",Toast.LENGTH_SHORT).show();
                }
                else   if(co.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter contact number",Toast.LENGTH_SHORT).show();
                }
                else   if(us.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter username",Toast.LENGTH_SHORT).show();
                }
                else   if(ps.getText().toString().equals("") ){
                    Toast.makeText(getApplicationContext(),"enter password",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


