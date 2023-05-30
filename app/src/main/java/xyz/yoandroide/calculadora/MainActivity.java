package xyz.yoandroide.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    ImageView cargarImg;

    public double suma (double a, double b){
        return a+b;
    }

    public double resta (double a, double b){
        return a-b;
    }

    public double multiplicacion (double a, double b){
        return a*b;
    }

    public double division (double a, double b) {
        double resultado = 0.0;

        if (b != 0) {

            resultado = a / b;

        }

        return resultado;
    }



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);


        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(
                            suma(Double.parseDouble(edit_numero_uno.getText().toString()),
                                 Double.parseDouble(edit_numero_dos.getText().toString()))+"");
            }
        });


        btn_division = findViewById(R.id.btnDiv);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(
                            division(Double.parseDouble(edit_numero_uno.getText().toString()),
                                     Double.parseDouble(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_multiplicacion = findViewById(R.id.btnMulti);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(
                            multiplicacion(Double.parseDouble(edit_numero_uno.getText().toString()),
                                           Double.parseDouble(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_resta = findViewById(R.id.btnResta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(
                              resta(Double.parseDouble(edit_numero_uno.getText().toString()),
                                    Double.parseDouble(edit_numero_dos.getText().toString()) )+"");
            }
        });

        cargarImg=findViewById(R.id.imgView);

        Picasso.get()
                .load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fsg.com.mx%2Fnode%2F8189&psig=AOvVaw3FixardOWs4m-sGb_nz8Wz&ust=1675353386974000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCPj-gO_X9PwCFQAAAAAdAAAAABAI")
                .error(R.drawable.descargar)
                .into(cargarImg);

    }



}
