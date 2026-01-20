package com.dogi.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   int a;

    {
        a = 0;
    }

    TextView mHelloTV;
    EditText mNameET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

        public void onClick(View view) {
            mHelloTV = (TextView)findViewById(R.id.textView);
            a++;
            String b = String.valueOf(a);
            mHelloTV.setText("Кол-во тараканов: " + b);


        }
    public void Clear(View view) {
        mHelloTV = (TextView)findViewById(R.id.textView);
        a=0;
        mHelloTV.setText("Кол-во тараканов: " + a);
    }
}
