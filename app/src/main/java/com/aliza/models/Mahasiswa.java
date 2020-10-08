package com.aliza.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Mahasiswa implements Parcelable {
    private String nama;
    private String jenisKelamin;
    private String status;
    private String Agama;
    private String Kewarganegaraan;
    private String alamatSrt;
    private String alamatAsal;
    private String kota;
    private String provinsi;
    private String noTelpRumah;
    private String noHp;
    private String email;
    private String namaOrangTua;
    private String tingkatPendidikan;
    private String asalKuliah;
    private String asalProgramStudi;
    private String statusAkreditasi;
    private String pilihProgramStudi1;
    private String pilihProgramStudi2;
    private String namaSekolah;
    private String alamatSekolah;
    private String kotaSekolah;
    private String provinsiSekolah;
    private String tahunNem;
    private String jmlNilaiNem;
    private String jmlMapel;
    private String jurusan;
    private String beasiswa;
    private String dokumenPengajuan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String agama) {
        Agama = agama;
    }

    public String getKewarganegaraan() {
        return Kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        Kewarganegaraan = kewarganegaraan;
    }

    public String getAlamatSrt() {
        return alamatSrt;
    }

    public void setAlamatSrt(String alamatSrt) {
        this.alamatSrt = alamatSrt;
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }

    public void setAlamatAsal(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getNoTelpRumah() {
        return noTelpRumah;
    }

    public void setNoTelpRumah(String noTelpRumah) {
        this.noTelpRumah = noTelpRumah;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaOrangTua() {
        return namaOrangTua;
    }

    public void setNamaOrangTua(String namaOrangTua) {
        this.namaOrangTua = namaOrangTua;
    }

    public String getTingkatPendidikan() {
        return tingkatPendidikan;
    }

    public void setTingkatPendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getAsalKuliah() {
        return asalKuliah;
    }

    public void setAsalKuliah(String asalKuliah) {
        this.asalKuliah = asalKuliah;
    }

    public String getAsalProgramStudi() {
        return asalProgramStudi;
    }

    public void setAsalProgramStudi(String asalProgramStudi) {
        this.asalProgramStudi = asalProgramStudi;
    }

    public String getStatusAkreditasi() {
        return statusAkreditasi;
    }

    public void setStatusAkreditasi(String statusAkreditasi) {
        this.statusAkreditasi = statusAkreditasi;
    }

    public String getPilihProgramStudi1() {
        return pilihProgramStudi1;
    }

    public void setPilihProgramStudi1(String pilihProgramStudi1) {
        this.pilihProgramStudi1 = pilihProgramStudi1;
    }

    public String getPilihProgramStudi2() {
        return pilihProgramStudi2;
    }

    public void setPilihProgramStudi2(String pilihProgramStudi2) {
        this.pilihProgramStudi2 = pilihProgramStudi2;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }

    public String getAlamatSekolah() {
        return alamatSekolah;
    }

    public void setAlamatSekolah(String alamatSekolah) {
        this.alamatSekolah = alamatSekolah;
    }

    public String getKotaSekolah() {
        return kotaSekolah;
    }

    public void setKotaSekolah(String kotaSekolah) {
        this.kotaSekolah = kotaSekolah;
    }

    public String getProvinsiSekolah() {
        return provinsiSekolah;
    }

    public void setProvinsiSekolah(String provinsiSekolah) {
        this.provinsiSekolah = provinsiSekolah;
    }

    public String getTahunNem() {
        return tahunNem;
    }

    public void setTahunNem(String tahunNem) {
        this.tahunNem = tahunNem;
    }

    public String getJmlNilaiNem() {
        return jmlNilaiNem;
    }

    public void setJmlNilaiNem(String jmlNilaiNem) {
        this.jmlNilaiNem = jmlNilaiNem;
    }

    public String getJmlMapel() {
        return jmlMapel;
    }

    public void setJmlMapel(String jmlMapel) {
        this.jmlMapel = jmlMapel;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getBeasiswa() {
        return beasiswa;
    }

    public void setBeasiswa(String beasiswa) {
        this.beasiswa = beasiswa;
    }

    public String getDokumenPengajuan() {
        return dokumenPengajuan;
    }

    public void setDokumenPengajuan(String dokumenPengajuan) {
        this.dokumenPengajuan = dokumenPengajuan;
    }

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String jenisKelamin, String status, String agama, String kewarganegaraan, String alamatSrt, String alamatAsal, String kota, String provinsi, String noTelpRumah, String noHp, String email, String namaOrangTua, String tingkatPendidikan, String asalKuliah, String asalProgramStudi, String statusAkreditasi, String pilihProgramStudi1, String pilihProgramStudi2, String namaSekolah, String alamatSekolah, String kotaSekolah, String provinsiSekolah, String tahunNem, String jmlNilaiNem, String jmlMapel, String jurusan, String beasiswa, String dokumenPengajuan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        Agama = agama;
        Kewarganegaraan = kewarganegaraan;
        this.alamatSrt = alamatSrt;
        this.alamatAsal = alamatAsal;
        this.kota = kota;
        this.provinsi = provinsi;
        this.noTelpRumah = noTelpRumah;
        this.noHp = noHp;
        this.email = email;
        this.namaOrangTua = namaOrangTua;
        this.tingkatPendidikan = tingkatPendidikan;
        this.asalKuliah = asalKuliah;
        this.asalProgramStudi = asalProgramStudi;
        this.statusAkreditasi = statusAkreditasi;
        this.pilihProgramStudi1 = pilihProgramStudi1;
        this.pilihProgramStudi2 = pilihProgramStudi2;
        this.namaSekolah = namaSekolah;
        this.alamatSekolah = alamatSekolah;
        this.kotaSekolah = kotaSekolah;
        this.provinsiSekolah = provinsiSekolah;
        this.tahunNem = tahunNem;
        this.jmlNilaiNem = jmlNilaiNem;
        this.jmlMapel = jmlMapel;
        this.jurusan = jurusan;
        this.beasiswa = beasiswa;
        this.dokumenPengajuan = dokumenPengajuan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.status);
        dest.writeString(this.Agama);
        dest.writeString(this.Kewarganegaraan);
        dest.writeString(this.alamatSrt);
        dest.writeString(this.alamatAsal);
        dest.writeString(this.kota);
        dest.writeString(this.provinsi);
        dest.writeString(this.noTelpRumah);
        dest.writeString(this.noHp);
        dest.writeString(this.email);
        dest.writeString(this.namaOrangTua);
        dest.writeString(this.tingkatPendidikan);
        dest.writeString(this.asalKuliah);
        dest.writeString(this.asalProgramStudi);
        dest.writeString(this.statusAkreditasi);
        dest.writeString(this.pilihProgramStudi1);
        dest.writeString(this.pilihProgramStudi2);
        dest.writeString(this.namaSekolah);
        dest.writeString(this.alamatSekolah);
        dest.writeString(this.kotaSekolah);
        dest.writeString(this.provinsiSekolah);
        dest.writeString(this.tahunNem);
        dest.writeString(this.jmlNilaiNem);
        dest.writeString(this.jmlMapel);
        dest.writeString(this.jurusan);
        dest.writeString(this.beasiswa);
        dest.writeString(this.dokumenPengajuan);
    }

    protected Mahasiswa(Parcel in) {
        this.nama = in.readString();
        this.jenisKelamin = in.readString();
        this.status = in.readString();
        this.Agama = in.readString();
        this.Kewarganegaraan = in.readString();
        this.alamatSrt = in.readString();
        this.alamatAsal = in.readString();
        this.kota = in.readString();
        this.provinsi = in.readString();
        this.noTelpRumah = in.readString();
        this.noHp = in.readString();
        this.email = in.readString();
        this.namaOrangTua = in.readString();
        this.tingkatPendidikan = in.readString();
        this.asalKuliah = in.readString();
        this.asalProgramStudi = in.readString();
        this.statusAkreditasi = in.readString();
        this.pilihProgramStudi1 = in.readString();
        this.pilihProgramStudi2 = in.readString();
        this.namaSekolah = in.readString();
        this.alamatSekolah = in.readString();
        this.kotaSekolah = in.readString();
        this.provinsiSekolah = in.readString();
        this.tahunNem = in.readString();
        this.jmlNilaiNem = in.readString();
        this.jmlMapel = in.readString();
        this.jurusan = in.readString();
        this.beasiswa = in.readString();
        this.dokumenPengajuan = in.readString();
    }

    public static final Creator<Mahasiswa> CREATOR = new Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel source) {
            return new Mahasiswa(source);
        }

        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };
}
