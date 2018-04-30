package jogarmoeda.cursoandroid.com.jogarmoeda;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    private ImageView botaoJogar;
    private String[] opcao = {"cara","coroa"};//indice de cara é 0 e de coroa é 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.botaoJogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gerando numero aleatorio
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2); //retorna numero de 0 a 2

                //opcao[numeroAleatorio];
                Intent IntentTelaDetalhe = new Intent(MainActivity.this,DetalheActivity.class);
                IntentTelaDetalhe.putExtra("opcao",opcao[numeroAleatorio]);

                startActivity(IntentTelaDetalhe);

            }
        });
    }
}
