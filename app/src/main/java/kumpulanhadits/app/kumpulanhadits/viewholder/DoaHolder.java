package kumpulanhadits.app.kumpulanhadits.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import kumpulanhadits.app.kumpulanhadits.R;

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa;
    public TextView txtSurah;
    public TextView txtLatin;
    public TextView txtArtiDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtSurah = (TextView) itemView.findViewById(R.id.txt_surah_doa);
        txtLatin = (TextView) itemView.findViewById(R.id.txt_latin_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);

    }
}
