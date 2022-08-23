package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText, pass;
    private Button button;
    private TextView enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.username);
        button = findViewById(R.id.login);
        pass = findViewById(R.id.password);
        enter = findViewById(R.id.enter);
        textEdit();
        button();
    }

    private void textEdit() {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (editText.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.
                            getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.
                            getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (pass.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.
                            getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.
                            getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void button(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались",
                            Toast.LENGTH_SHORT).show();
                    enter.setVisibility(View.INVISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}






