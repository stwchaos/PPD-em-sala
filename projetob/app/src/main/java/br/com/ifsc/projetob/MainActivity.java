package br.com.ifsc.projetob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("metodocallback","onCreate");
        teste = (EditText) findViewById(R.id.txt);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("metodocallback","onStar");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("metodocallback","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("metodocallback","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("metodocallback","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("metodocallback","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("metodocallback","onStop");
    }

    public void intActivity(View view){
        Intent a = new Intent(getApplicationContext(), imc.class);
        startActivity(a);
    }

    public void iniciarAtividade(View v){
        Intent i = new Intent(getApplicationContext(), imc.class);

        String mensagem = teste.getText().toString();
        i.putExtra("msg", mensagem);
        startActivity(i);

    }

}