package kumpulanhadits.app.kumpulanhadits.model;

import java.io.Serializable;

public class Doa implements Serializable{

    private String nama;
    private String surah;
    private String latin;
    private String arti;

    public Doa(String nama, String surah, String latin, String arti) {
        this.nama = nama;
        this.surah = surah;
        this.latin = latin;
        this.arti = arti;
    }

    public String getNama() {
        return nama;
    }

    public String getSurah() {
        return surah;
    }

    public String getLatin(){
        return latin;
    }

    public String getArti() {
        return arti;
    }



}
