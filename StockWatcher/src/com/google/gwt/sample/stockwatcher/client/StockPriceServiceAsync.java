package com.google.gwt.sample.stockwatcher.client;
/**
@author Bharath Kumar C
 */
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockPriceServiceAsync {

  void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);

}
