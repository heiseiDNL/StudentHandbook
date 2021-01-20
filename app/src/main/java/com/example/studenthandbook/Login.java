package com.example.studenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etemail,etpassword;
    Button btnlogin;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etemail = (EditText) findViewById(R.id.editTextEmail);
        etpassword = (EditText) findViewById(R.id.editTextPassword);
        btnlogin = (Button) findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = etemail.getText().toString();
                password = etpassword.getText().toString();

                if (email.equals("dnlxmobile@gmail.com") && password.equals("12345"))
                {
                    openHome();
                }
                else
                {
                    Toast.makeText(Login.this, "INVALID CREDENTIALS", Toast.LENGTH_SHORT).show();
                    clearText();
                }
            }
        });
    }

    public void openHome() {
        Toast.makeText(this, "Successfully LOGIN", Toast.LENGTH_SHORT).show();
        Intent home = new Intent(this, HomeActivity.class);
        startActivity(home);
    }

    public void clearText() {
        etemail.setText("");
        etpassword.setText("");
    }
}