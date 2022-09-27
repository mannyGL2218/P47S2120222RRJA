package tesoem.edu.mx.p47s212022rrja;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class suma extends AppCompatActivity {

    Button calcular, regresar;
    EditText num1,num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        calcular = findViewById(R.id.btn_calcular);
        regresar = findViewById(R.id.btn_regresar);
        num1 = findViewById(R.id.txt_num1);
        num2 = findViewById(R.id.txt_num2);
        resultado = findViewById(R.id.txt_resultado);
    }
    public void regresar(View view){
        Intent intent = new Intent(suma.this, MainActivity.class);
        startActivity(intent);
    }
    public void calcular(View view){
        if(num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()){
            Toast.makeText(this,"llena los campos", Toast.LENGTH_LONG).show();
        } else {
            int uno = Integer.parseInt(num1.getText().toString());
            int dos = Integer.parseInt(num2.getText().toString());
            resultado.setText(String.valueOf(uno + dos).toString());
        }
    }
}