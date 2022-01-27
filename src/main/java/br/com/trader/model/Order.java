package br.com.trader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "tb_order")
public class Order {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int Id;
    
    @Column
    private String Ticker;
    
    @ManyToOne
    @JoinColumn(name = "tb_trader")
    private Trader Trader;
    
}
