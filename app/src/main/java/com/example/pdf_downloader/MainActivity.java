package com.example.pdf_downloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    private  int current_page=0;
    EditText textEdit;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PDFView pdfView=(PDFView)findViewById(R.id.pdfview);
        pdfView.fromAsset("network.pdf").load();
    }
}