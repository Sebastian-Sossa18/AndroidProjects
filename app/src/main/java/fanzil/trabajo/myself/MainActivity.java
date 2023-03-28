package fanzil.trabajo.myself;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numeroSalida;
    private EditText numeroEntrada;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numeroEntrada = findViewById(R.id.numeroEntrada);
        numeroSalida = findViewById(R.id.numeroSalida);

        resultado = findViewById(R.id.Resultado);
    }
    public void sumar(View view){
        double operacion = Double.parseDouble(numeroEntrada.getText().toString()) + Double.parseDouble(numeroSalida.getText().toString());
        resultado.setText(operacion+"");

    }
    public void restar(View view){
        double operacion = Double.parseDouble(numeroEntrada.getText().toString()) - Double.parseDouble(numeroSalida.getText().toString());
        resultado.setText(operacion+"");

    }
    public void dividir(View view){
        double operacion = Double.parseDouble(numeroEntrada.getText().toString()) / Double.parseDouble(numeroSalida.getText().toString());
        resultado.setText(operacion+"");

    }
    public void multiplicar(View view){
        double operacion = Double.parseDouble(numeroEntrada.getText().toString()) * Double.parseDouble(numeroSalida.getText().toString());
        resultado.setText(operacion+"");

    }
}