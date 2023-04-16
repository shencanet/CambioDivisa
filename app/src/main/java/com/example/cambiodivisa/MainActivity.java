package com.example.cambiodivisa;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private TextView Tw1;




    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        Tw1 = (TextView) findViewById(R.id.Resultado);







    }
    // este metodo realiza la suma
     public void Sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

         Double num2 = Double.parseDouble(valor2);
         //int num1 = Integer.parseInt(valor1);
         Double suma =  num2 * 0.037;

         //String resul = suma + "";
         String result = String.valueOf(suma);
         Tw1.setText(result);



     }



}