package com.apps.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private int skora = 0;
        private int skorb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3PointA(View view) {
        skora = skora +3;
        TextView textViewA = findViewById(R.id.skora);
        textViewA.setText(String.valueOf(skora));
    }

    public void tambah3PointB(View view) {
        skorb = skorb +3;
        TextView textViewB = findViewById(R.id.skorb);
        textViewB.setText(String.valueOf(skorb));
    }
}
