package br.com.trader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trader")
public class Trader {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Code")
    private int Code;
    
    @Column(name = "Name")
    private String Name;
    
}
