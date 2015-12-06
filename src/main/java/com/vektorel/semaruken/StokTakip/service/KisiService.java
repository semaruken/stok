/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.StokTakip.service;

import com.vektorel.semaruken.StokTakip.entity.Kisi;
import com.vektorel.semaruken.StokTakip.util.THibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sema
 */
public class KisiService implements TServiceBase<Kisi> {

    public Kisi save(Kisi entity) {
        Session session = THibernateUtil.getSessionFactory().openSession(); 
        Transaction t= session.beginTransaction();
        session.save(entity);
        t.commit();
        return entity;
        
    }
    public Kisi update(Kisi entity) {
        Session session=THibernateUtil.getSessionFactory().openSession();
        Transaction t= session.beginTransaction();
        session.update(entity);
        t.commit();
        return entity;
    }

    public boolean delete(Kisi entity) {
        Session session=THibernateUtil.getSessionFactory().openSession();
        Transaction t= session.beginTransaction();
        session.delete(entity);
        t.commit();
        return true;
    }

    public List<Kisi> getAll(Class cls) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kisi getById(Long entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  

    
}
