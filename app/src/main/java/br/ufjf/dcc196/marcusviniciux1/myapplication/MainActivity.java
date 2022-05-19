package br.ufjf.dcc196.marcusviniciux1.myapplication;

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

    public void clicaBotaoMensagem(View origem){
        TextView textViewMensagem = findViewById(R.id.textViewMensagem);
        EditText editTextNome = findViewById(R.id.editTextTextNome);
        EditText editTextStarter = findViewById(R.id.editTextTextStarter);

        String nome = editTextNome.getText().toString();
        String starter = editTextStarter.getText().toString();
        String mensagem = String.format(
                "Olá treinador %s! Seu starter é %s!",
                nome,
                starter
        );



        textViewMensagem.setText(mensagem);
    }
}