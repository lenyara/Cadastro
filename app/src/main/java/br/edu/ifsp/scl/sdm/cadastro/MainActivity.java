package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.scl.sdm.cadastro.modelo.Formulario;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private EditText cidadeEt;
    private Spinner estadosSp;
    private CheckBox emailCb;
    private RadioButton femininoRb;
    private RadioButton masculinoRb;
    private Button limparBt;
    private Button salvarBt;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        cidadeEt = findViewById(R.id.cidadeEt);
        estadosSp = findViewById(R.id.estadosSp);
        emailCb = findViewById(R.id.emailCb);
        femininoRb = findViewById(R.id.femininoRb);
        masculinoRb = findViewById(R.id.masculinoRb);
        limparBt = findViewById(R.id.limparBt);
        salvarBt = findViewById(R.id.salvarBt);

        this.clickSalvar();
        this.clickLimpar();

    }

    private void clickSalvar (){

        this.salvarBt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Formulario recuperarDadosFormulario = getDadosFormulario();

                Toast.makeText(MainActivity.this, recuperarDadosFormulario.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private Formulario getDadosFormulario (){

        this.formulario = new Formulario();

        String sexo = "";

        if (this.nomeEt.getText().toString().isEmpty() == false){
            this.formulario.setNome(this.nomeEt.getText().toString());
        }else{
            nomeEt.setError("Obrigatório *");
            nomeEt.requestFocus();
        }

        if (this.emailEt.getText().toString().isEmpty() == false){
            this.formulario.setEmail(this.emailEt.getText().toString());
        }else{
            emailEt.setError("Obrigatório *");
            emailEt.requestFocus();
        }

        if (this.telefoneEt.getText().toString().isEmpty() == false){
            this.formulario.setTelefone(this.telefoneEt.getText().toString());
        }else{
            telefoneEt.setError("Obrigatório *");
            telefoneEt.requestFocus();
        }

        if (this.cidadeEt.getText().toString().isEmpty() == false){
            this.formulario.setCidade(this.cidadeEt.getText().toString());
        }else{
            cidadeEt.setError("Obrigatório *");
            cidadeEt.requestFocus();
        }

        this.formulario.setUf(this.estadosSp.getSelectedItem().toString());

        boolean checked = this.emailCb.isChecked();
        this.formulario.setLista(checked);

        if (femininoRb.isChecked()){
            sexo = "Feminino";
        }

        if (masculinoRb.isChecked()){
            sexo = "Masculino";
        }

        this.formulario.setSexo(sexo);

        return formulario;

    }

    private void limparFormulario(){
        nomeEt.setText("");
        emailEt.setText("");
        telefoneEt.setText("");
        cidadeEt.setText("");
        nomeEt.requestFocus();
        emailCb.setChecked(false);
        femininoRb.setChecked(true);
    }

    private void clickLimpar (){

        this.limparBt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                limparFormulario();

            }
        });
    }


}