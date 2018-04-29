package jogarmoeda.cursoandroid.com.jogarmoeda;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends Activity {
    private  ImageView imagemMoeda;
    private  ImageView botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagemMoeda = (ImageView) findViewById(R.id.imagemMoedaId);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);
        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if (opcaoEscolhida.equals("cara")){
                ///imagem cara
                imagemMoeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else {
                ///imagem (barata)coroa
                imagemMoeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
