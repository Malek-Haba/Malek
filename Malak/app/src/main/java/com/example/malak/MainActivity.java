
package com.example.malak;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText taille  = null;
    private EditText poids =null ;
    private TextView result = null;
    private Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taille =(EditText) findViewById(R.id.id3);
        poids =(EditText) findViewById(R.id.id4);
        btn=(Button) findViewById(R.id.button);
        result =(TextView) findViewById(R.id.id1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        int t=Integer.parseInt(taille.getText().toString());
        int p=Integer.parseInt(poids.getText().toString());
        int r =p /(t*t);
        String res ="";
        if(r>40){
            res="obésité morbide ou massive ";
        }else if(r<=40){
            res="obésité sévére ";
        }
            else if(r>=35){
                res="obésité sévére ";
        }

        else if(r<35){
            res="obésité modérée ";
        }
        else if(r>=30){
            res="obésité modérée ";
        }
        else if(r>=25){
            res="surpoids";


        }
        else if(r<33){
            res="surpoids ";
        }
        else if(r<25){
            res="corpulance normale ";


        }
        else if(r>=18.5){
            res="corpulance normale ";
        }
        else if(r>=16.5){
            res="maigreur ";
        }
        else if(r<18.5){
            res="maigreur ";


        }
else { res="Famine";

        }
result.setText(res);
    }
    });
    }}