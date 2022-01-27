package br.com.trader.service;

import org.springframework.stereotype.Service;

import br.com.trader.model.Trader;
import br.com.trader.repository.repository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class service {
    private final repository optInRepository;

    public Trader getTrader(int userId) {
        Trader trader = optInRepository.getTrader();
      
        return trader;
    }
}