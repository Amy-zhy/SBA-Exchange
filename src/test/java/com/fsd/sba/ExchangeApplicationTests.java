package com.fsd.sba;

import com.fsd.sba.entity.StockExchangeEntity;
import com.fsd.sba.service.ExchangeService;
// import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExchangeApplicationTests {

	@Autowired
	private ExchangeService exchangeService;


	@Test
	public void createStockExchangeTest() {
		StockExchangeEntity stockExchange = new StockExchangeEntity();
		stockExchange.setStockExchange("test");
		stockExchange.setRemarks("test");
		stockExchange.setBrief("just for test");
		stockExchange.setAddress("test");
		exchangeService.save(stockExchange);
	}

	@Test
	public void updateStockExchangeTest() {
		StockExchangeEntity stockExchange = new StockExchangeEntity();
		stockExchange.setExchangeid(1);
		stockExchange.setStockExchange("test1");
		stockExchange.setRemarks("test1");
		stockExchange.setBrief("just for update test");
		stockExchange.setAddress("test1");
		exchangeService.updateStockExchange(stockExchange);
	}

}
