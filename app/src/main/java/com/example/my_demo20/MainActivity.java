package com.example.my_demo20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
 private ImageView imageView;
 private RadioButton radioButtonM;
 private RadioButton radioButtonG;
 private EditText editTextName;
 private EditText editTextMail;
 private EditText editTextNumber;
 private Button button;
 private String pol;
 private String multi;
    private MultiAutoCompleteTextView multiAutoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.imageView);
        editTextName =findViewById(R.id.editTextText);
        editTextMail =findViewById(R.id.editTextTextEmailAddress);
        editTextNumber =findViewById(R.id.editTextNumber);
        multiAutoCompleteTextView= findViewById(R.id.multiAutoCompleteTextView);
        radioButtonG = findViewById(R.id.radioButton2);
        radioButtonM = findViewById(R.id.radioButton);
        button=findViewById(R.id.button);
       radioButtonG.setOnClickListener(view -> {
           if(radioButtonG.isChecked()){
               radioButtonM.setChecked(false);
               imageView.setImageResource(R.drawable.g);
               pol = (String) radioButtonG.getText();
           }

       });
        radioButtonM.setOnClickListener(view -> {
            if(radioButtonM.isChecked()){
                radioButtonG.setChecked(false);
                imageView.setImageResource(R.drawable.b);
                pol = (String) radioButtonM.getText();
            }

        });
        button.setOnClickListener(view -> {
            multi += "Стать "+ pol+ " і`мя "+editTextNumber.getText()+" єлектронна адреса "+editTextMail.getText()+ " вік "+editTextNumber.getText()+"\n";
           try {
               multiAutoCompleteTextView.setText(multi);
           } catch (Exception e) {
               throw new RuntimeException(e);
           }

        });


    }
}