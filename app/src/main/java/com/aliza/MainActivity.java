package com.aliza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.aliza.databinding.ActivityMainBinding;
import com.aliza.models.Mahasiswa;

public class MainActivity extends AppCompatActivity {
    Mahasiswa mahasiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mahasiswa = new Mahasiswa();

        binding.radioLakiLaki.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setJenisKelamin("Laki Laki");
                }
            }
        });

        binding.radioPerempuan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setJenisKelamin("Perempuan");
                }
            }
        });

        binding.radioMenikah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setStatus("Menikah");
                }
            }
        });

        binding.radioBlmMenikah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setStatus("Belum Menikah");
                }
            }
        });

        binding.radioBiarawati.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setStatus("Biaragwan / Biarawati");
                }
            }
        });

        binding.radioWNI.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setKewarganegaraan("WNI");
                }
            }
        });

        binding.radioWNA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setKewarganegaraan("WNA");
                }
            }
        });

        binding.radioDesain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Desain Produk Mekatronika");
                }
            }
        });

        binding.radioDesain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Desain Produk Mekatronika");
                }
            }
        });

        binding.radioDesain2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Desain Produk Mekatronika");
                }
            }
        });

        binding.radioInstrumentasi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Instrumentasi Medis");
                }
            }
        });

        binding.radioInstrumentasi2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Instrumentasi Medis");
                }
            }
        });

        binding.radioNegeri.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Negeri");
                }
            }
        });

        binding.radioSwasta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("Swasta");
                }
            }
        });

        binding.chkPengajuan1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("satu");
                }
            }
        });

        binding.chkPengajuan2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("dua");
                }
            }
        });

        binding.chkPengajuan3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("tiga");
                }
            }
        });

        binding.chkPengajuan4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("empat");
                }
            }
        });

        binding.chkPengajuan5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("lima");
                }
            }
        });

        binding.chkPengajuan6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("enam");
                }
            }
        });

        binding.chkPengajuan7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    mahasiswa.setPilihProgramStudi1("tujuh");
                }
            }
        });
        //asda

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mahasiswa.setNama(binding.edtNama.getText().toString());
                mahasiswa.setAgama(binding.spinnerAgama.getSelectedItem().toString());
                mahasiswa.setAlamatSrt(binding.edtAlamat.getText().toString());
                mahasiswa.setAlamatSekolah(binding.edtAlamatSekolah.getText().toString());
                mahasiswa.setKota(binding.edtKota.getText().toString());
                mahasiswa.setProvinsi(binding.edtProvinsi.getText().toString());
                mahasiswa.setAlamatSrt(binding.edtAlamat.getText().toString());
                mahasiswa.setNoTelpRumah(binding.edtNoRumah.getText().toString());
                mahasiswa.setNoHp(binding.edtNoHP.getText().toString());
                mahasiswa.setEmail(binding.edtEmail.getText().toString());
                mahasiswa.setNamaOrangTua(binding.edtNamaOrtu.getText().toString());
                mahasiswa.setTingkatPendidikan(binding.spinnerPendidikan.getSelectedItem().toString());
                mahasiswa.setAsalKuliah(binding.edtPerguruanTransfer.getText().toString());
                mahasiswa.setAsalProgramStudi(binding.edtProgramTransfer.getText().toString());
                mahasiswa.setStatusAkreditasi(binding.spinnerAkreditasi.getSelectedItem().toString());
                mahasiswa.setNamaSekolah(binding.edtNamaSekolah.getText().toString());
                mahasiswa.setAlamatSekolah(binding.edtNamaSekolah.getText().toString());
                mahasiswa.setKotaSekolah(binding.edtKotaSekolah.getText().toString());
                mahasiswa.setProvinsiSekolah(binding.edtProvinsiSekolah.getText().toString());
                mahasiswa.setTahunNem(binding.edtTahunNEM.getText().toString());
                mahasiswa.setJmlNilaiNem(binding.edtNilaiNEM.getText().toString());
                mahasiswa.setJmlMapel(binding.edtJumlahPelajaran.getText().toString());
                mahasiswa.setBeasiswa(binding.edtSumbang.getText().toString());
            }
        });
    }
}