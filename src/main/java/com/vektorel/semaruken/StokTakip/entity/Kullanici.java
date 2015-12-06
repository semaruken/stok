/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.semaruken.StokTakip.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author sema
 */
@Entity
@Table(name = "GNL_KULLANICI")
public class Kullanici implements Serializable {

    private long id;
    private String username;
    private String password;
    private String eposta;

    @Id
    @SequenceGenerator(name = "SEQ_KULLANICI", sequenceName = "SEQ_KULLANICI", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_KULLANICI")
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
@Column(name="USERNAME",length=12)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
@Column(name="PASSWORD",length=24)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
@Column(name="EPOSTA",length=100)
    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
    
}
