/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.StokTakip;

import com.vektorel.semaruken.StokTakip.entity.Kisi;
import com.vektorel.semaruken.StokTakip.service.KisiService;
import java.util.Date;

/**
 *
 * @author sema
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Uygulama Başladı!");

        KisiService kisiService = new KisiService();
        Kisi k = new Kisi();
        k.setAd("sema");
        k.setSoyad("kesen");
        k.setDogumTarihi(new Date(1,1,2015));
        k.setAdres("Çankaya,Ankara");
        kisiService.save(k);

        System.out.println("Kaydedildi!");





    }
}
