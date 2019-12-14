package com.fsd.sba.controller;


import com.fsd.sba.entity.StockExchangeEntity;
import com.fsd.sba.service.ExchangeService;
import com.fsd.sba.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/admin/manage/exchange")
public class StockExchangeController {

	@Autowired
	private ExchangeService exchangeService;


	@PostMapping
	public CommonResult createExchange(@RequestBody StockExchangeEntity stcokExchange) {
		return exchangeService.save(stcokExchange);
	}

	@PutMapping
	public CommonResult searchExchange(@RequestBody StockExchangeEntity stcokExchange) {
		return exchangeService.updateStockExchange(stcokExchange);
	}
}
