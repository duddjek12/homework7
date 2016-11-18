package com.example.a403.calculator;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1,number2,result;
    Button plus,minus,muliply,division,remainder;
    double a,b,c=0;
    View.OnClickListener cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        muliply = (Button) findViewById(R.id.minus);
        division = (Button) findViewById(R.id.division);
        remainder = (Button) findViewById(R.id.remainder);

        cal = new View.OnClickListener() {
            public void onClick(View v) {
                a= Double.parseDouble(number1.getText().toString());
                b= Double.parseDouble(number2.getText().toString());

                switch(v.getId()){
                    case R.id.plus :
                        c=a+b;
                        break;
                    case R.id.minus :
                        c=a-b;
                        break;
                    case R.id.muliply :
                        c=a*b;
                        break;
                    case R.id.division :
                        c=a/b;
                        break;
                    case R.id.remainder :
                        c=a%b;
                        break;
                }
                result.setText("계산결과 :" + c);
            }

        };
        plus.setOnClickListener(cal);
        minus.setOnClickListener(cal);
        muliply.setOnClickListener(cal);
        division.setOnClickListener(cal);
        remainder.setOnClickListener(cal);
    }
}
