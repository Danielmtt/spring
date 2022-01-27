package br.com.trader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trade")
public class Trade {
    
    @Id
    private int id;
    
    @Column
    private String TimeStamp;
    
    @Column
    private int Quantity;

    @Column
    private double Price;
    
    @ManyToOne
    @JoinColumn(name = "tb_order")
    private Order order;
    
}
