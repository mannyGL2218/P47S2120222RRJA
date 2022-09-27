package tesoem.edu.mx.p47s212022rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button suma, resta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = findViewById(R.id.btn_suma);
        resta = findViewById(R.id.btn_resta);
    }
    public void suma(View view){
        Intent irsuma = new Intent(MainActivity.this, suma.class);
        startActivity(irsuma);
    }
    public void resta(View view){
        Intent irresta = new Intent(MainActivity.this, resta.class);
        startActivity(irresta);
    }
}