package kumpulanhadits.app.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import kumpulanhadits.app.kumpulanhadits.model.Doa;

public class DetailActivity extends AppCompatActivity{

    TextView txtNamaDoa, txtSurah, txtLatin, txtArtiDoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtNamaDoa = (TextView) findViewById(R.id.txt_nama_doa);
        txtSurah = (TextView) findViewById(R.id.txt_surah_doa);
        txtLatin = (TextView) findViewById(R.id.txt_latin_doa);
        txtArtiDoa = (TextView) findViewById(R.id.txt_arti_doa);

        Doa doa = (Doa) getIntent().getSerializableExtra("id_doa");

        txtNamaDoa.setText(doa.getNama());
        txtSurah.setText(doa.getSurah());
        txtLatin.setText(doa.getLatin());
        txtArtiDoa.setText(doa.getArti());
    }
}
