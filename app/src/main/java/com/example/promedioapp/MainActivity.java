package com.example.promedioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista {
    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private Button button;
    private Main.Presentador presentador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        edt3 = (EditText) findViewById(R.id.edt3);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.CalcularPromedio(edt1.getText().toString(),edt2.getText().toString(),edt3.getText().toString());
            }
        });
    }

    @Override
    public void MostrarResultado(String r) {
        Toast.makeText(getApplicationContext(), "Promedio:"+r, Toast.LENGTH_LONG).show();
    }
}
