package com.example.habib.cardnew;

public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://b401telematics.com/ce-service/tambah_user.php";
    public static final String URL_GET_ALL = "http://b401telematics.com/ce-service/tampil_seluruh_siswa.php";
    public static final String URL_GET_EMP = "http://b401telematics.com/ce-service/tampil_siswa.php?id=";
    public static final String URL_UPDATE_EMP = "http://b401telematics.com/ce-service/update_siswa.php";
    public static final String URL_DELETE_EMP = "http://b401telematics.com/ce-service/delete_user.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "NRP";
    public static final String KEY_EMP_NAMA = "Nama";
    public static final String KEY_EMP_EMAIL= "E-Mail"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_PASSWORD= "Password"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "NRP";
    public static final String TAG_NAMA = "Nama";
    public static final String TAG_EMAIL = "E-Mail";
    public static final String TAG_PASSWORD = "Password";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String NRP_SISWA = "NRP_Siswa";
}
