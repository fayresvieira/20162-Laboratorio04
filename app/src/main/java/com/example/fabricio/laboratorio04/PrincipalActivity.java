package com.example.fabricio.laboratorio04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    private Button botaoOk;
    private Button botaoLimpar;
    private EditText usuarioEditText;
    private EditText senhaEditText;
    private TextView resultadoTextView;

    public PrincipalActivity() {}

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_principal);

            usuarioEditText = (EditText) findViewById(R.id.usuarioTextEdit);
            senhaEditText = (EditText) findViewById(R.id.senhaEditText);
            resultadoTextView = (TextView) findViewById(R.id.resultadoTextView);

            botaoLimpar = (Button) findViewById(R.id.limparButton);
                botaoLimpar.setOnClickListener(new View.OnClickListener() {

                public void onClick (View view){
                    limparButtonAction();

                }
            });

            botaoOk = (Button) findViewById(R.id.acessoButton);
            botaoOk.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    okButtonAction();
                }
            });
        }


    private void okButtonAction() {
        String usuarioInserido = usuarioEditText.getText().toString();
        String senhaInserida = senhaEditText.getText().toString();

        if (usuarioInserido.equalsIgnoreCase("Bruno") &&
            senhaInserida.equals("123")){
            resultadoTextView.setText("Acesso Ok");

        }else{
            resultadoTextView.setText("Acesso Negado!");
        }

        }


    private void limparButtonAction() {
        usuarioEditText.setText(null);
        senhaEditText.setText((null));
        resultadoTextView.setText(null);

    }


}




