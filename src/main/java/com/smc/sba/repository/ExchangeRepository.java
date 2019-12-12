package com.smc.sba.repository;

import com.smc.sba.entity.StockExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ExchangeRepository extends JpaRepository<StockExchangeEntity, Integer> {

}

