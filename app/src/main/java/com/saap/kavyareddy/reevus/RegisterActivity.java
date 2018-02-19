package com.saap.kavyareddy.reevus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    indexActivity myIndex;
    EditText editId, editUsername, editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        myIndex = new indexActivity(this);
        editId = (EditText)findViewById(R.id.ET_ID);
        editUsername = (EditText)findViewById(R.id.ET_USERNAME);
        editPassword = (EditText)findViewById(R.id.ET_PASSWORD);
        btnLogin = (Button)findViewById(R.id.button_login);
        AddData();
    }

    public void AddData() {
        btnLogin.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myIndex.insertData(editId.getText().toString(), editUsername.getText().toString(), editPassword.getText().toString());
                        if(isInserted = true)
                            Toast.makeText(RegisterActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(RegisterActivity.this, "Data not inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
