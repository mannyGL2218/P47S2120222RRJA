package tesoem.edu.mx.p47s212022rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class resta extends AppCompatActivity {
    Button calcular2, regresar2;
    EditText num3,num4;
    TextView resultado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        calcular2 = findViewById(R.id.btn_calcular2);
        regresar2 = findViewById(R.id.btn_regresar2);
        num3 = findViewById(R.id.txt_num3);
        num4 = findViewById(R.id.txt_num4);
        resultado2 = findViewById(R.id.txt_resultado2);
    }
    public void regresar(View view){
        Intent intent = new Intent(resta.this, MainActivity.class);
        startActivity(intent);
    }
    public void calcular(View view){
        if(num3.getText().toString().isEmpty() || num4.getText().toString().isEmpty()){
            Toast.makeText(this,"llena los campos", Toast.LENGTH_LONG).show();
        } else {
            int uno = Integer.parseInt(num3.getText().toString());
            int dos = Integer.parseInt(num4.getText().toString());
            resultado2.setText(String.valueOf(uno-dos).toString());
        }
    }
}