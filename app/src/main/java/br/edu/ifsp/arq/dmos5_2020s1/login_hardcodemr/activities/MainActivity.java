package br.edu.ifsp.arq.dmos5_2020s1.login_hardcodemr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5_2020s1.login_hardcodemr.R;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText usuarioEditText;
    private EditText senhaEditText;
    private Button validarButton;
    private TextView saidaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioEditText = findViewById(R.id.edittext_usuario);
        senhaEditText = findViewById(R.id.edittext_senha);
        validarButton = findViewById(R.id.button_ok);
        saidaTextView = findViewById(R.id.textview_saida);
        validarButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if (view == validarButton){
          validar();
        }
    }
    private void validar(){
        double usuario,senha,validar;
        try {
            usuario = Double.valueOf(usuarioEditText.getText().toString());
            senha = Double.valueOf(senhaEditText.getText().toString());
        }catch (NumberFormatException ex) {
            usuario = 0;
            senha = 0;

            Toast.makeText(this, "Erro no login",Toast.LENGTH_SHORT).show();
            return;
        }
            Toast.makeText(this, "Erro no login",Toast.LENGTH_SHORT).show();
    }
            //saidaTextView.setText(String.format("Bem vindo 1710346"));
}


