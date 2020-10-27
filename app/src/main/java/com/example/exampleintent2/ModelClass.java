package com.example.exampleintent2;

public class ModelClass  {

    private String isim;
    private String soyIsim;
    private String numara;

    public ModelClass(String isim, String soyIsim, String numara) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.numara = numara;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }
}
