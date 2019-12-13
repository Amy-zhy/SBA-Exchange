package com.fsd.sba.repository;

import com.fsd.sba.entity.StockExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ExchangeRepository extends JpaRepository<StockExchangeEntity, Integer> {

}

