package com.example.habib.cardnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class menu_utama extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileTxt;

    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        //auth = FirebaseAuth.getInstance();
        //profileTxt = (TextView)findViewById(R.id.textView23);
        //user = auth.getCurrentUser();

        //profileTxt.setText(user.getEmail());

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu1();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu2();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu3();
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu4();
            }
        });
    }

    public void openMenu1(){
        Intent intent = new Intent(this, pengajuan_surat.class);
        startActivity(intent);
    }

    public void openMenu2(){
        Intent intent = new Intent(this, download.class);
        startActivity(intent);
    }

    public void openMenu3(){
        Intent intent = new Intent(this, pusat_info.class);
        startActivity(intent);
    }

    public void openMenu4(){
        Intent intent = new Intent(this, menu_utama.class);
        startActivity(intent);
    }
}