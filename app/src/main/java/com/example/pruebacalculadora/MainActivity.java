package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}etnota1=(EditText)findViewById(R.id.etnota1);
        etnota2=(EditText)findViewById(R.id.etnota2);

        resultado=(TextView)findViewById(R.id.tvresultado);
        }
    public void suma(View view)
    {

        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();


        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);


        int suma=num1+num2+num3;

        String resultadosuma=String.valueOf(suma);

        resultado.setText(resultadosuma);

    }
    public void resta(View view)
    {

        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();
        String val3=etnota3.getText().toString();

        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);
        int num3=Integer.parseInt(val3);

        int suma=num1-num2-num3;

        String resultadosuma=String.valueOf(suma);

        resultado.setText(resultadosuma);

    }
    public void division(View view)
    {

        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();


        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);


        int suma=(num1/ num2)/num3;

        String resultadosuma=String.valueOf(suma);

        resultado.setText(resultadosuma);

    }
    public void multiplicacion(View view)
    {

        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();


        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);


        int suma=(num1*num2)*num3;

        String resultadosuma=String.valueOf(suma);

        resultado.setText(resultadosuma);

    }

}
