package com.example.ctuip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button addString, cmpString,vowelButton;
    public EditText text1,text2;
    public TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.outputTextBox);
        text1 = findViewById(R.id.stringOneInput);
        text2 = findViewById(R.id.stringTwoInput);
        addString = findViewById(R.id.addStringButton);
        cmpString = findViewById(R.id.cmpStringButton);
        vowelButton = findViewById(R.id.vowelButton);

        addString.setOnClickListener(this);
        cmpString.setOnClickListener(this);
        vowelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String string1 = text1.getText().toString();
        String string2 = text2.getText().toString();
        switch (v.getId()){
            case R.id.addStringButton:
                output.setText(string1 + " " + string2);
                break;
            case R.id.cmpStringButton:
                if(string1.compareTo(string2)==0){
                    output.setText("Equals");
                }
                else{
                    output.setText("Not Equal");
                }
                break;
            case R.id.vowelButton:
                int counter = 0;
                string1 = string1.toLowerCase();
                string2 = string2.toLowerCase();
                 for (int i = 0; i < (string1.length()); i++){
                     if ((string1.charAt(i) == 'a') || (string1.charAt(i) == 'e') || (string1.charAt(i) == 'i')
                             || (string1.charAt(i) == 'o') || (string1.charAt(i) == 'u')){
                         counter++;
                     }
                 }
                for (int i = 0; i < (string2.length()); i++) {
                    if ((string2.charAt(i) == 'a') || (string2.charAt(i) == 'e') || (string2.charAt(i) == 'i')
                            || (string2.charAt(i) == 'o') || (string2.charAt(i) == 'u')) {
                        counter++;
                    }

                }
                output.setText("The number of vowels in the two strings are " + String.valueOf(counter));
                break;

        }
    }
}
