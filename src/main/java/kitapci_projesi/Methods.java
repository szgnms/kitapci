package kitapci_projesi;

public class Methods extends Depo {
    static void defaultKitapEkle() {
        Kitap ktp_1 = new Kitap("SU", kitapNo++, "ALI SAFI", "25.50");
        Kitap ktp_2 = new Kitap("ATES", kitapNo++, "MEHMET TOPAL", "30.00");
        Kitap ktp_3 = new Kitap("TOPRAK", kitapNo++, "ALI SUNAL", "22.90");
        Kitap ktp_4 = new Kitap("TAHTA", kitapNo++, "NAZIM HIKMET", "27.90");

        kitapIsimList.add(ktp_1.getKitapIsmi());
        kitapIsimList.add(ktp_2.getKitapIsmi());
        kitapIsimList.add(ktp_3.getKitapIsmi());
        kitapIsimList.add(ktp_4.getKitapIsmi());

        yazarList.add(ktp_1.getYazar());
        yazarList.add(ktp_2.getYazar());
        yazarList.add(ktp_3.getYazar());
        yazarList.add(ktp_4.getYazar());

        fiyatList.add(ktp_1.getFiyat());
        fiyatList.add(ktp_2.getFiyat());
        fiyatList.add(ktp_3.getFiyat());
        fiyatList.add(ktp_4.getFiyat());

        kitapNoList.add(ktp_1.getKitapNo());
        kitapNoList.add(ktp_2.getKitapNo());
        kitapNoList.add(ktp_3.getKitapNo());
        kitapNoList.add(ktp_4.getKitapNo());
    }

    public static void menu() {


        System.out.println(kitapNoList);

        System.out.println(Blue+"*********Kitap Evimize Hoşgeldiniz**********\n"+Green+"\n1-kitap ekle" +
                "\n2-numara ile kitap goruntule" +
                "\n3-bilgi ile kitap goruntule" +
                Red+"\n4-numara ile kitap sil" +
                Green+"\n5-tum kitaplari listele" +
                Red+"\n6-cikis"+Blue);

        String secim = scan.next();

        switch (secim) {
            case "1":
                kitapEkle();
            case "2":
                numaraKitapGoruntule();
            case "3":
                bilgiKitapGoruntule();
            case "4":
                numaraKitapSil();
            case "5":
                kitaplariListele();
            case "6":
                System.out.println("Hoşçakalın!");
                 System.exit(0);
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();

        }
    }

    static void kitapEkle() {

        Kitap ktp_1 = new Kitap();
        System.out.print("Kitap İsmi : ");
        ktp_1.setKitapIsmi(scan.next());
        kitapIsimList.add(ktp_1.kitapIsmi);

        System.out.println();
        System.out.print("Yazar : ");
        ktp_1.setYazar(scan.next());
        yazarList.add(ktp_1.yazar);

        System.out.println();
        System.out.print("Fiyat : ");
        ktp_1.setFiyat(scan.next());
        fiyatList.add(ktp_1.fiyat);

        System.out.println();
        ktp_1.setKitapNo(kitapNo++);
        kitapNoList.add(ktp_1.kitapNo);

        System.out.println("1- kitap ekle\n2-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                kitapEkle();
            case "2":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();
        }
    }

    static void kitaplariListele() {
        for (int i = 0; i < kitapNoList.size(); i++) {
            System.out.println("\n******************************************\n");

            System.out.println("No : " + kitapNoList.get(i));
            System.out.println("Kitap İsmi : " + kitapIsimList.get(i));
            System.out.println("Yazarı : " + yazarList.get(i));
            System.out.println("Fiyat : " + fiyatList.get(i));


        }
        System.out.println("1- kitap sil\n2-Kitap Ekle\n3-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                numaraKitapSil();
            case "2":
                kitapEkle();
            case "3":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();
        }
    }

    static void numaraKitapGoruntule() {

        System.out.print("Kitap No : ");
        String num = scan.next();
        String num1= num.replaceAll("[^0-9]","");

        if (num1.length()<4||!kitapNoList.contains(Integer.parseInt(num1))) {
            System.out.println("Yanlis giris yaptiniz");

            System.out.println("1- kitap no\n2-Ana Menu");
            String ktpsec = scan.next();
            switch (ktpsec) {
                case "1":
                    numaraKitapGoruntule();
                case "2":
                    menu();
                default:
                    System.out.println("yanlis giris yaptiniz");
                    menu();

            }
        }



        int index = kitapNoList.indexOf(Integer.parseInt(num));
        System.out.println("\n******************************************\n");

        System.out.print("Kitap No : " + kitapNoList.get(index));
        System.out.print("Kitap İsmi : " + kitapIsimList.get(index));
        System.out.print("Yazar : " + yazarList.get(index));
        System.out.print("Fiyat : " + fiyatList.get(index));

        System.out.println();
        System.out.println("1- kitap sil\n2-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                numaraKitapSil();
            case "2":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();

        }
    }

    static void numaraKitapSil() {
        System.out.println(kitapNoList);
        System.out.println(kitapIsimList);
        System.out.println(yazarList);
        System.out.println(fiyatList);

        System.out.print("Kitap No : ");
        String num = scan.next();
        String num1= num.replaceAll("[^0-9]","");

        if (num1.length()<4||!kitapNoList.contains(Integer.parseInt(num1))) {
            System.out.println("Yanlis giris yaptiniz");

            System.out.println("1- kitap sil\n2-Ana Menu");
            String ktpsec = scan.next();
            switch (ktpsec) {
                case "1":
                    numaraKitapSil();
                case "2":
                    menu();
                default:
                    System.out.println("yanlis giris yaptiniz");
                    menu();

            }
        }



        int index = kitapNoList.indexOf(Integer.parseInt(num));

        kitapNoList.remove(index);
        kitapIsimList.remove(index);
        yazarList.remove(index);
        fiyatList.remove(index);

        System.out.println("1- kitap sil\n2-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                numaraKitapSil();
            case "2":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();

        }
    }

    static void bilgiKitapGoruntule() {
        System.out.println("1-No ile  goruntule\n2-Kitap adi ile goruntule\n3-Yazar adi ile goruntule\n4-fiyat ile goruntule");
        String secim = scan.next();
        switch (secim) {
            case "1":
                numaraKitapGoruntule();
            case "2":
                kitapAdiIleGoruntule();
            case "3":
                yazarAdiIleGoruntule();
            case "4":
                fiyatIleGoruntule();

            default:
                System.out.println("Yanlis giris yaptiniz");
                System.out.println("1- bilgi kitap goruntuleme \n2-Ana Menu");
                String ktpsec = scan.next();
                switch (ktpsec) {
                    case "1":
                        bilgiKitapGoruntule();
                    case "2":
                        menu();
                    default:
                        System.out.println("yanlis giris yaptiniz");
                        menu();

                }
        }

    }

    private static void fiyatIleGoruntule() {
        System.out.print("Kitap fiyat : ");
        String fiyat = scan.next();
        System.out.println("\n******************************************\n");
        if (!fiyatList.contains(fiyat)){
            System.out.println("Yanlis giris yaptiniz");
            System.out.println("1- kitap fiyat \n2-Ana Menu");
            String ktpsec = scan.next();
            switch (ktpsec) {
                case "1":
                    fiyatIleGoruntule();
                case "2":
                    menu();
                default:
                    System.out.println("yanlis giris yaptiniz");
                    menu();

            }
        }
        int index = fiyatList.indexOf(fiyat);

        System.out.print("Kitap No : " + kitapNoList.get(index));
        System.out.print("Kitap İsmi : " + kitapIsimList.get(index));
        System.out.print("Yazar : " + yazarList.get(index));
        System.out.print("Fiyat : " + fiyatList.get(index));

        System.out.println();
        System.out.println("1- kitap sil\n2-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                numaraKitapSil();
            case "2":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();

        }
    }

    private static void yazarAdiIleGoruntule() {
        System.out.print("Yazar Adi : ");
        String ad = scan.next().toUpperCase();
        for (String s : yazarList) {
            if (s.contains(ad)) {
                ad = s;
            }

        }
        System.out.println("\n******************************************\n");
        if (!yazarList.contains(ad)){
            System.out.println("Yanlis giris yaptiniz");
            System.out.println("1- Yazar adi \n2-Ana Menu");
            String ktpsec = scan.next();
            switch (ktpsec) {
                case "1":
                    yazarAdiIleGoruntule();
                case "2":
                    menu();
                default:
                    System.out.println("yanlis giris yaptiniz");
                    menu();

            }
        }


        int index = yazarList.indexOf(ad);

        System.out.print("Kitap No : " + kitapNoList.get(index));
        System.out.print("Kitap İsmi : " + kitapIsimList.get(index));
        System.out.print("Yazar : " + yazarList.get(index));
        System.out.print("Fiyat : " + fiyatList.get(index));

        System.out.println();
        System.out.println("1- kitap sil\n2-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                numaraKitapSil();
            case "2":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();

        }
    }

    private static void kitapAdiIleGoruntule() {
        System.out.print("Kitap Adi : ");
        String ad = scan.next();
        System.out.println("\n******************************************\n");
         if (!kitapIsimList.contains(ad)){
             System.out.println("Yanlis giris yaptiniz");
             System.out.println("1- kitap adi \n2-Ana Menu");
             String ktpsec = scan.next();
             switch (ktpsec) {
                 case "1":
                     kitapAdiIleGoruntule();
                 case "2":
                     menu();
                 default:
                     System.out.println("yanlis giris yaptiniz");
                     menu();

             }
         }
        int index = kitapIsimList.indexOf(ad);

        System.out.print("Kitap No : " + kitapNoList.get(index));
        System.out.print("Kitap İsmi : " + kitapIsimList.get(index));
        System.out.print("Yazar : " + yazarList.get(index));
        System.out.print("Fiyat : " + fiyatList.get(index));
        System.out.println();
        System.out.println("1- kitap sil\n2-Ana Menu");
        String ktpsec = scan.next();
        switch (ktpsec) {
            case "1":
                numaraKitapSil();
            case "2":
                menu();
            default:
                System.out.println("yanlis giris yaptiniz");
                menu();

        }
    }
}
