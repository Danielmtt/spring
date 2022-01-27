package br.com.trader.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.trader.model.*;


@Repository
public interface repository extends BaseRepository<Trader, Long>, JpaSpecificationExecutor<Trader> {

    @Query(value = "SELECT * FROM tb_trader", nativeQuery = true)
    Trader getTrader();
}


