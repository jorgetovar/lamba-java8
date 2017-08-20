package com.jetprogramming.efficiency;

import java.util.*;
import java.util.stream.Stream;

public class StockFetcher {
	public static List<StockInfo> fetchStockPrices(List<String> symbols) {
		List<StockInfo> stocks = new ArrayList<>();
		for (String symbol : symbols) {
			stocks.add(StockUtil.getPrice(symbol));
		}

		return stocks;
	}

	public static Stream<StockInfo> fetchStockPricesLazy(Stream<String> symbolsStream) {
		return symbolsStream.map(StockUtil::getPrice);
	}
}
