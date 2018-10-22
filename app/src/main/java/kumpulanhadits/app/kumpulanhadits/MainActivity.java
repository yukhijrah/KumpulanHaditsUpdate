package kumpulanhadits.app.kumpulanhadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kumpulanhadits.app.kumpulanhadits.adapter.DoaAdapter;
import kumpulanhadits.app.kumpulanhadits.model.Doa;

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_doa);

        doaCollections();

        DoaAdapter doaAdapter = new DoaAdapter(getApplicationContext(), doas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(doaAdapter);
    }

    private void doaCollections() {
        /*1*/ doas.add(new Doa("Doa Masuk Masjid", "اَللّهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ.", "Allahummaf-tahlii abwaaba rahmatika", "Wahai Tuhanku, bukakanlah untukku pintu-pintu rahmat-Mu"));
        /*2*/ doas.add(new Doa("Doa Keluar Masjid", "اَللّهُمَّ اِنِّيْ أسْأَلُكَ مِنْ فَضْلِكَ.", "Allahumma innii as-aluka min fadhlika", "Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu"));
        /*3*/ doas.add(new Doa("Doa Makan", "الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ", "Allahumma baarik llanaa fiima razaqtanaa waqinaa adzaa ban-naar", "Ya Allah, berkatilah rezeki yang engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka"));
        /*4*/ doas.add(new Doa("Doa Setelah Makan", "اَلْحَمْدُ ِللهِ الَّذِيْنَ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِيْنَ","Alhamdu lillahhil-ladzi ath-amanaa wa saqaana waja'alanaa minal muslimiin","Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam"));
        /*5*/ doas.add(new Doa("Doa Mau Tidur", "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ", "BISMIKALLAAHUMMA AHYAA WABISMIKA AMUUT", "Dengan menyebut Namamu Ya Allah Aku Hidup dan dengan menyebut Namamu Aku Mati"));
        /*6*/ doas.add(new Doa("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","ALHAMDULILLAAHILLADZII AHYAANAA BA’DAMAA AMAATANAA WA ILAIHINNUSYUUR","Segala puji bagi Allah Dzat yang menghidupkan kami setelah kami mati (tidur) dan kepadanyalah kami kembali"));
        /*7*/ doas.add(new Doa("Doa Masuk Kamar Mandi", "اَللّهُمَّ اِنىِّ اَعُوْذُ بِكَ مِنَ الْخُبُثِ وَ الْخَبَائِثِ","ALLAHUMMA INNII A'UUDZU BIKA MINAL KHUBUTSI WAL KHOBAAITSI", "Ya Allah sesungguhnya aku berlindung kepadaMu dari setan laki-laki dan setan perempuan"));
        /*8*/ doas.add(new Doa("Doa Memakai Baju", "بِسْمِ اللهِ اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ خَيْرِهِ وَخَيْرِ مَاهُوَ لَهُ وَاَعُوْذُبِكَ مِنْ شَرِّهِ وَشَرِّمَا هُوَلَهُ", "Bismillaahi, Alloohumma innii as-aluka min khoirihi wa khoiri maa huwa lahuu wa'a'uu dzubika min syarrihi wa syarri maa huwa lahuu", "Dengan nama-Mu ya Allah aku minta kepada Engkau kebaikan pakaian ini dan kebaikan apa yang ada padanya, dan aku berlindung kepada Engkau dari kejahatan pakaian ini dan kejahatan yang ada padanya"));
        /*9*/ doas.add(new Doa("Doa Bepergian", "بِسْمِ اللَّهِ ، تَوَكَّلْتُ عَلَى اللَّهِ ، وَلا حَوْلَ وَلا قُوَّةَ إِلاَّ بِاللَّه", "Bismilaahi tawakkaltu ‘alallahi wa laa hawla wa laa quwwata illaa billaahi", "Dengan menyebut nama Allah, aku menyerahkan diriku pada Allah dan tidak ada daya dan kekuatan selain dengan Allah saja"));
        /*10*/ doas.add(new Doa("Doa Perlindungan Dunia Akhirat", "رَبَّنَا أَتِنَا فِى الدُّنْيَا حَسَنَةً وَفِي اْلأَخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ", "RABBANAA AATINAA FIDDUNNYAA HASANAH, WA FIL AAKHIRATI HASANAH, WAQINAA ‘ADZAA BAN NAAR", "Ya Tuhan kami, berilah kami kebaikan hidup di dunia dan kebaikan hidup di akhirat, dan jagalah kami dari siksa api neraka"));
    }


}
