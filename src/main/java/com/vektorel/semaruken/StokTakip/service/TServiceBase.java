/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.StokTakip.service;

import java.util.List;

/**
 *
 * @author sema
 */
public interface TServiceBase<T>{
    
    public T save(T entity);
    
    public T update(T entity);
    
    public boolean delete(T entity);
    
    public List<T> getAll(Class cls);
    
    public T getById(Long entity);
    
    
}
