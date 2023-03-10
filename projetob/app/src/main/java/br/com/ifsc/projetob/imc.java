package br.com.ifsc.projetob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class imc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        getIntent().getExtras().getString("msg");
    }


}