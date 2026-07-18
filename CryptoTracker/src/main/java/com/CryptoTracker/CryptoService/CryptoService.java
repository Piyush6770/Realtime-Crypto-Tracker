package com.CryptoTracker.CryptoService;

import com.CryptoTracker.model.CryptoCoin;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CryptoService {
    private final String API_URL = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=%s&include_24hr_change=true&x_cg_demo_api_key=CG-NWU9CiN2wQuRUonZp95x2r11";

    // APi key = CG-NWU9CiN2wQuRUonZp95x2r11
    //coin price by Ids
    public List<CryptoCoin> getPrices(List<String> coins){
        List<CryptoCoin> coinList = new ArrayList<>();
        String ids = String.join(",",coins);
        String url = String.format(API_URL,ids);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        JSONObject json = new JSONObject(response);
        for(String coin : coins){
            if(json.has(coin)){
                JSONObject coinjson = json.getJSONObject(coin);
                double price = coinjson.getDouble("usd");
                double change = coinjson.getDouble("usd_24h_change");
                coinList.add(new CryptoCoin(coin,coin,price,change));
            }
        }

        return coinList;
    }
}
