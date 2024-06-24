package com.example.proyecto2_p9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private CheckBox cb1;

    private Button btn1;

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        cb1 = findViewById(R.id.cb1);
        btn1 = findViewById(R.id.btn1);
        tv2 = findViewById(R.id.tv2);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float precio, total = 0;
                precio = Float.parseFloat(et1.getText().toString());

                if (cb1.isChecked()) {
                    total = precio - (precio * 0.25f);
                    tv2.setText("El total es: " + total);
                } else {
                    tv2.setText("El total es: " + precio);
                }
            }


        });
    }
}