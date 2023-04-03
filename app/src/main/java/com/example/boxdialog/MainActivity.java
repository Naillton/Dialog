package com.example.boxdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        EditText  campoEmail = findViewById(R.id.email);
        String email = campoEmail.getText().toString();
        EditText  campoPassword = findViewById(R.id.passw);
        String password = campoPassword.getText().toString();
        EditText campoNumero = findViewById(R.id.numero);
        String formatNumber = campoNumero.getText().toString();
        if (formatNumber.length() != 0) {
            Integer.parseInt(formatNumber);
        }
        TextView textoSalvo = findViewById(R.id.textView);
        if (email.length() == 0 && password.length() == 0) {
            textoSalvo.setText("NADA A SER SALVO DIGITE ALGO");
        } else {
            textoSalvo.setText(
                    "Email: "+ email +"\n" +
                            "Senha: "+ password +"\n"+
                            "Numero: "+ formatNumber
            );
        }
    }
}