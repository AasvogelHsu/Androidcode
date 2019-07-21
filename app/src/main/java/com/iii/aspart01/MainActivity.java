package com.iii.aspart01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnlot;
    private TextView lottext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnlot = findViewById(R.id.btn_lottery);
    lottext = findViewById(R.id.lottery_text);

    btnlot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.v("b1","ok");
        }
    });

    }
}
