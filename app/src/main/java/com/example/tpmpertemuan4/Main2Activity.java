package com.example.tpmpertemuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tvNama,tvDetail;
    private ImageView ivPahlawan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama= findViewById(R.id.tvNama);
        tvDetail= findViewById(R.id.tvDetail);

        Bundle bundle= getIntent().getExtras();
        String nama= bundle.getString("nama");
        String detail= bundle.getString("detail");


        tvNama.setText(nama);
        tvDetail.setText(detail);
    }
}
