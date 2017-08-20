package com.jetprogramming.efficiency;

public class YahooFinance {
  public static double getPrice(final String ticker) {
    try {
      Thread.sleep(500);     
      return 2.0;
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
