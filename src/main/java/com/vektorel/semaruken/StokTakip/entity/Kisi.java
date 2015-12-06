/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.StokTakip.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sema
 */
@Entity
@Table(name="GNL_KISI")
public class Kisi implements Serializable {

    private long id;
    private String ad;
    private String soyad;
    private Date dogumTarihi;
    private String adres;
@Id
@SequenceGenerator(name="SEQ_KISI",sequenceName="SEQ_KISI",allocationSize=1,initialValue=1)
@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="SEQ_KISI")
@Column(name="KISI_ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
@Column(name="AD",length=50)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
@Column(name="SOYAD",length=50)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
@Temporal(TemporalType.DATE)
@Column(name="DOGUM_TARIHI")

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
@Column(name="ADRES",length=300)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
}
