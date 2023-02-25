package xyz.android.myapplicationpreuba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA;
    private EditText editTextB;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);

        result = findViewById(R.id.textViewResultado);
    }

    public void sumar(View view){
        final String TIPO_OPERACION = "SUMAR";
        result.setText(this.operacion(TIPO_OPERACION));
    }

    public void restar(View view) {
        final String TIPO_OPERACION = "RESTAR";
        result.setText(this.operacion(TIPO_OPERACION));
    }

    public void dividir(View view) {
        final String TIPO_OPERACION = "DIVIDIR";
        result.setText(this.operacion(TIPO_OPERACION));
    }

    public void multiplicar(View view) {
        final String TIPO_OPERACION = "MULTIPLICAR";
        result.setText(this.operacion(TIPO_OPERACION));
    }

    private String operacion(String tipo) {
        Integer operacion = 0;
        Integer valorA = Integer.parseInt(editTextA.getText().toString());
        Integer valorB = Integer.parseInt(editTextB.getText().toString());
        switch (tipo) {
            case "SUMAR":
                operacion = valorA + valorB;
                break;
            case "RESTAR":
                operacion = valorA - valorB;
                break;
            case "MULTIPLICAR":
                operacion =  valorA * valorB;
                break;
            case "DIVIDIR":
                operacion = valorA / valorB;
        }

        System.out.println(operacion);
        // "1223" --> Cadena
        // 12323 --> Numerico
        return operacion.toString();
    }
}