package com.example.calculadora__suanyayala__120450029;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnSumar, btnRestar, btnMult,btnDivision;
EditText editNum1, editNum2;
TextView txtResultado;

int num1, num2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar=findViewById(R.id.btnSumar);
        btnRestar =findViewById(R.id.btnRestar);
        btnMult = findViewById(R.id.BtnMult);
        btnDivision = findViewById( R.id.BtnDivision);
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
        txtResultado= findViewById(R.id.txtresultado);

        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDivision.setOnClickListener(this);

    }
    public int getIntFromEditText(EditText editText) {

        if (editText.getText().toString().equals("")) {

            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();

            return 0;
        } else

            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editNum1);
        num2 = getIntFromEditText(editNum2);
        switch (view.getId()){
            case R.id.btnSumar:
                txtResultado.setText("Resultado ="+(num1+num2));
                break;

            case R.id.btnRestar:
                txtResultado.setText("Resultado ="+(num1-num2));
                break;

            case R.id.BtnMult:
                txtResultado.setText("Resultado ="+(num1*num2));
                break;

            case R.id.BtnDivision:
                txtResultado.setText("Resultado ="+((float)num1/(float)num2));
                break;

        }
    }
}