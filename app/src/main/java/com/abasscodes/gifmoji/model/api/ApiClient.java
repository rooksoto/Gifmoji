package com.abasscodes.gifmoji.model.api;

import com.abasscodes.gifmoji.Mvc;
import com.abasscodes.gifmoji.model.pojos.GifPojo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by C4Q on 11/19/16.
 */

public class ApiClient implements Mvc.Model{

    private static final String API_KEY = "dc6zaTOxFJmzC";
    private static ApiClient instance;
    private final static String baseUrl = "api.giphy.com/";
    private GiphyService api;

    public static ApiClient getInstance(){
        if(instance == null){
            instance = new ApiClient();
        }
        return instance;
    }

    private ApiClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(GiphyService.class);
    }
    
    private Call<GifPojo> getRandomGiphy(String apikey){
        return api.getRandomGiphy(apikey);
    }

    @Override
    public Call<GifPojo> getRandomGiphy(){
        return getRandomGiphy(API_KEY);
    }
}
