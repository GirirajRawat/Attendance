package com.example.attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private Spinner SpinnerUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        SpinnerUsers = (Spinner) findViewById(R.id.SpinnerUsers);

        String users[] = {"Admin", "Teacher"};
        ArrayAdapter adapter= new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, users
        );
        SpinnerUsers.setAdapter(adapter);

    }
}
