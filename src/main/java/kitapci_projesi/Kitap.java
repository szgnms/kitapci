package kitapci_projesi;

public class Kitap extends Depo
{

    String kitapIsmi;
    Integer kitapNo;
    String yazar="asdas";
    String fiyat;

    public Kitap(String kitapIsmi, Integer kitapNo, String yazar, String fiyat)
    {
        this.kitapIsmi = kitapIsmi;
        this.kitapNo = kitapNo;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapIsmi='" + kitapIsmi + '\'' +
                ", kitapNo=" + kitapNo +
                ", yazar='" + yazar + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    // default constructer oluşturmak şart.
    public Kitap()
    {

    }

    public String getKitapIsmi() {
        return kitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi) {
        this.kitapIsmi = kitapIsmi;
    }

    public Integer getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(Integer kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getYazar() {
        return yazar;
    }

   public void setYazar(String yazar) {
       this.yazar = yazar;
   }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }
}
