    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciko.kuis1015.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 19
 */
@Entity
@Table(name = "Nilai_1015")
public class Nilai_1015 implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_nilai;
    @Column(length = 50, nullable = true)
    private int nilai_teori;
    @Column(length = 50, nullable = true)
    private int nilai_praktikum;
    
    @ManyToOne
    private Cv_1015 cv_1015;

    public int getIdnilai() {
        return id_nilai;
    }

    public void setIdnilai(int id) {
        this.id_nilai = id_nilai;
    }

    /**
     * @return the name
     */
    public int getNilai_Teori() {
        return nilai_teori;
    }

    /**
     * @param name the name to set
     */
    public void setNilai_Teori(int nilai_teori) {
        this.nilai_teori = nilai_teori;
    }

    /**
     * @param description the description to set
     */
    public void setNilai_Praktikum(int nilai_praktikum) {
        this.nilai_praktikum = nilai_praktikum;
    }

    /**
     * @return the description
     */
    public int getNilai_Praktikum() {
        return nilai_praktikum;
    }
    public Cv_1015 getCv_1015() {
        return cv_1015;
    }

    public void setCv_1015(Cv_1015 cv_1015) {
        this.cv_1015 = cv_1015;
    }
   
  
}