package com.rifadlipanji.oleh_olehkhaspalu;

import java.util.ArrayList;

public class artikelData {
    private static String[] judulArtikel = {
            "SAMBAL IKAN ROA",
            "COKELAT BANUA",
            "KACANG GOYANG",
            "KERIPIK PISANG DONGGALA",
            "KERIPIK BUAH NAGA",
            "BAGEA KHAS PALU",
            "UTA KELO",
            "SARUNG DONGGALA",
            "KERAJINAN KAYU HITAM",
            "KAIN KHAS PALU",
    };

    private static String[] isiArtikel = {
            "Kuliner khas Palu yang diberi nama sambal ikan roa ini wajib kamu jadikan oleh-oleh. Penamaan tersebut berangkat dari bahan utama yang digunakan sambal ini, yakni ikan roa yang banyak ditemukan di perairan Sulawesi, khususnya perairan Kabupaten Poso, Sulawesi Tengah. Nantinya, daging ikan roa akan lebih dulu dihaluskan dan dibumbui untuk kemudian diolah menjadi sambal.",
            "Adanya potensi perkebunan kakao yang cukup besar di Sulawesi Tengah memberi inspirasi masyarakat setempat untuk mengolah bahan makanan tersebut menjadi sebuah kuliner khas. Salah satunya, kamu bisa mencoba Cokelat Banua yang khas dengan rasa pahit. Hal tersebut dikarenakan sang pemilik ingin rasa asli cokelat tetap terasa dan bisa bermanfaat saat dikonsumsi.",
            "Oleh-oleh khas Palu selanjutnya adalah kacang goyang. Penamaan “goyang” pada makanan ini diambil karena proses memasak kacang yang perlu digoyangkan di atas bara api. Tak hanya itu, camilan berbahan dasar kacang telur ini ini juga cukup unik karena memiliki tampilan berwarna-warni yang dihasilkan dari zat pewarna.",
            "Tidak jauh berbeda dari keripik pisang pada umumnya, olahan buah yang satu ini memanfaatkan pisang tanduk sebagai bahan utamanya. Meski terbuat dari buah pisang, kamu tetap bisa menikmati cita rasa gurih, manis, dan renyah dari camilan ini. Ada pula varian lainnya, seperti pedas, keju, hingga cokelat.",
            "Mungkin keripik satu ini tidak sepopuler keripik singkong, keripik pisang, ataupun keripik sukun. Namun bagi yang menginginkan camilan dengan rasa berbeda, kamu bisa mencoba keripik buah naga. Buah naga memang menjadi salah satu tanaman pokok di Palu, tak heran jika akhirnya banyak dimanfaatkan oleh penduduk setempat.",
            "Penganan lain yang wajib kamu coba dan bawa pulang adalah Bagea. Kue ini memang menjadi camilan khas beberapa daerah di Sulawesi. Namun khusus di Palu, kue berbahan dasar sagu ini turut dipadukan dengan kacang.  Karena itulah, kamu akan merasakan sensasi manis dan gurih saat menyantapnya. Menariknya, ada banyak rasa yang ditawarkan camilan ini mulai dari orisinal hingga keju.",
            "Satu lagi kekayaan alam yang dimanfaatkan masyarakat Kota Palu sebagai ciri khasnya adalah uta kelo. Makanan berbahan dasar sayur kelor ini sekilas mirip dengan sayur daun singkong. Pasalnya, proses pembuatannya juga menggunakan santan. Rasa yang dihasilkan pun merupakan perpaduan gurih dan pedas. Umumnya, masyarakat setempat akan menyantapnya dengan udang kering, teri, ataupun pisang goreng. Selain menawarkan cita rasa khas, penganan ini ternyata memiliki banyak khasiat. Salah satunya, daun kelor dipercaya mampu mengembalikan stamina yang telah terbuang. Suku Kaili, pembuat uta kelo ini pun percaya bahwa jika ada pengunjung dari luar suku yang mencobanya dijamin akan kembali karena rindu akan cita rasanya.",
            "Jika ingin cendera mata selain kuliner, maka sarung donggala bisa menjadi pilihan yang tepat. Sarung ini merupakan salah satu kerajinan tenun tradisional yang dibuat oleh masyarakat asli Kabupaten Donggala. Satu hal yang menjadi ciri khas sarung ini adalah tekstur yang halus karena dibuat melalui teknik tradisional oleh wanita setempat. Disebut-sebut Sarung Donggala ini memiliki kualitas yang sangat istimewa. Selain karena tekstur kainnya halus, motif yang dirancang pun terkenal amat unik. Untuk mendapatkan sarung Donggala ini kamu perlu merogoh kocek sedikit lebih dalam, yaitu mulai dari harga ratusan ribu hingga jutaan rupiah bergantung dari bahan dan motif yang dipilih.",
            "Oleh-oleh yang selanjutnya ini sudah pasti menjadi buruan wisatawan karena dikenal memiliki keindahan yang eksotis. Itulah kerajinan tangan kayu hitam, sebuah karya yang dihasilkan oleh kayu eboni. Sebagai kekayaan alam yang dimiliki kawasan Sulawesi Tengah, Eboni memang punya peran penting bagi masyarakat setempat. Kabarnya, selain dijadikan cendera mata kayu bertekstur keras ini pun memiliki harga yang tinggi, bahkan kerap diekspor ke berbagai negara. Khusus kerajinan tangannya, kamu bisa temukan dalam berbagai bentuk dan kegunaan. Mulai dari patung, gantungan kunci, kotak perhiasan, jam, dan masih banyak lagi bisa kamu pilih untuk dijadikan cendera mata.",
            "Tidak lengkap rasanya berkunjung ke Kota Palu tanpa membawa pulang kain khas dengan corak yang unik serta tekstur yang halus ini. Umumnya, kain khas Palu memiliki warna-warna cerah yang cantik dan terkesan mewah.",
    };

    private static int[] fotoArtikel = {
            R.drawable.sambal,
            R.drawable.c__banua,
            R.drawable.k_goyang,
            R.drawable.kripik_pisang,
            R.drawable.kripik_naga,
            R.drawable.bagea,
            R.drawable.uta_kelo,
            R.drawable.sarung_donggala,
            R.drawable.kayu_hitam,
            R.drawable.kain_palu,
    };

    static ArrayList<artikel> getListData(){
        ArrayList<artikel> list = new ArrayList<>();
        for (int posisi = 0;posisi < judulArtikel.length;posisi++){
            artikel Artikel = new artikel();
            Artikel.setJudul(judulArtikel[posisi]);
            Artikel.setIsi(isiArtikel[posisi]);
            Artikel.setFotoProfil(fotoArtikel[posisi]);
            list.add(Artikel);
        }
        return list;
    }
}
