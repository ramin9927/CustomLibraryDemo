package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpner extends AppCompatActivity {
      PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_opner);
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("nakshikanthar.pdf").load();
    }
}
