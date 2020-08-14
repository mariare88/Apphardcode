package br.edu.ifsp.arq.dmos5_2020s1.login_hardcodemr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5_2020s1.login_hardcodemr.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText n1EditText;
    private EditText n2EditText;
    private Button validarButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1EditText = findViewById(R.id.edittext_n1);
        n2EditText = findViewById(R.id.edittext_n2);
        validarButton = findViewById(R.id.button_ok);

        validarButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if (view == validarButton){
          validar();
        }
    }
    private void validar(){
        double n1,n2,ok;
        try {
            n1 = Double.valueOf(n1EditText.getText().toString());
            n2 = Double.valueOf(n2EditText.getText().toString());
        }catch (NumberFormatException ex) {
            n1 = 1710346;
            n2 = 6430171;
            Toast.makeText(context:this, text:"Erro no login", Toast.LENGTH_SHORT).show();

            return;
        }

        Toast.makeText(context: this,String.format("Login ok"), Toast.LENGTH_SHORT).show();

        }
    }

