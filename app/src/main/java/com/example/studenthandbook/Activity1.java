package com.example.studenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    private Button btnCompute, btnCLear;
    EditText prelim, midterm, prefinal, finals;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btnCompute = (Button) findViewById(R.id.btnCompute);
        btnCLear = (Button) findViewById(R.id.btnClear);
        prelim =  (EditText) findViewById(R.id.txtbxPrelim);
        midterm = (EditText) findViewById(R.id.txtbxMidterm);
        prefinal = (EditText) findViewById(R.id.txtbxPreFinal);
        finals =  (EditText) findViewById(R.id.txtbxFinal);
        results = (TextView) findViewById(R.id.txtResult);


        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float pgValue = Float.parseFloat(prelim.getText().toString());
                float mgValue = Float.parseFloat(midterm.getText().toString());
                float pfgValue = Float.parseFloat(prefinal.getText().toString());
                float fgValue = Float.parseFloat(finals.getText().toString());

                float gradeValues = ((pgValue * (20.0f/100.0f)) + (mgValue * (20.0f/100.0f)) + (pfgValue * (20.0f/100.0f)) + (fgValue * (40.0f/100.0f)));

                if ((gradeValues >= 97.50) && (gradeValues<=100))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 1.00 " + "\n\nExcellent");
                }

                else if ((gradeValues >= 94.50) && (gradeValues<=97.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 1.25 " + "\n\nVery Good");
                }

                else if ((gradeValues >= 91.50) && (gradeValues<=94.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 1.50 " + "\n\nVery Good");
                }
                else if ((gradeValues >= 88.50) && (gradeValues<=91.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 1.75 " + "\n\nVery Good");
                }
                else if ((gradeValues >= 85.50) && (gradeValues<=88.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 2.00 " + "\n\nSatisfactory");
                }
                else if ((gradeValues >= 82.50) && (gradeValues<=85.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 2.25 " + "\n\nSatisfactory");
                }
                else if ((gradeValues >= 79.50) && (gradeValues<=82.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 2.50 " + "\n\nSatisfactory");
                }
                else if ((gradeValues >= 76.50) && (gradeValues<=79.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 2.75 " + "\n\nFair");
                }
                else if ((gradeValues >= 74.50) && (gradeValues<=76.49))
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 3.00 " + "\n\nFair");
                }
                else if (gradeValues <= 74.49)
                {
                    results.setText("Your Average is:\n" + String.valueOf(gradeValues) + "\n\nYour Grade is: 5.00 " + "\n\nFailed");
                }

            }
        });

        btnCLear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prelim.setText(" ");
                midterm.setText(" ");
                prefinal.setText(" ");
                finals.setText(" ");
                results.setText(" ");
            }
        });

    }
}