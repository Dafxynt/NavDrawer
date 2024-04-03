package com.example.navdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class khas extends AppCompatActivity {

    TextView nama,deskripsi;
    ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_khas);
        nama =findViewById(R.id.TVnama);
        deskripsi = findViewById(R.id.TVdeskripsi);
        Image = findViewById(R.id.IVkuliner);

        Intent intent =getIntent();
        String nama_intent = intent.getStringExtra("nama");
        String ImgURL_intent = intent.getStringExtra("img");
        String deskripsi_intent = intent.getStringExtra("deskripsi");

        nama.setText(nama_intent);
        deskripsi.setText(deskripsi_intent);
        Glide.with(this).load(ImgURL_intent).into(Image);
    }
}
