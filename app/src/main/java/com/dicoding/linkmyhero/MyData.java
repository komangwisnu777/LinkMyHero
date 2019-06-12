package com.dicoding.linkmyhero;

public class MyData {
    String judul, keterangan, tahun, imgurl;

    public MyData(String judul, String keterangan, String tahun, String imgurl) {
        this.judul = judul;
        this.keterangan = keterangan;
        this.tahun = tahun;
        this.imgurl = imgurl;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
