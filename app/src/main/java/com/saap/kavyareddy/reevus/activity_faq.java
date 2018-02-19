package com.saap.kavyareddy.reevus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class activity_faq extends AppCompatActivity {
    Button send,decrypt;
    EditText input;
    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        send = (Button)findViewById(R.id.button_send);
        decrypt = (Button)findViewById(R.id.button_decrypt);
        input = (EditText)findViewById(R.id.ET_input);
        tv1= (TextView)findViewById(R.id.TV_1);
        tv2= (TextView)findViewById(R.id.TV_2);
        tv3= (TextView)findViewById(R.id.TV_3);
        tv4= (TextView)findViewById(R.id.TV_4);
    }


}
