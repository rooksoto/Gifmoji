package com.abasscodes.gifmoji.model.api;

import com.abasscodes.gifmoji.model.pojos.GifPojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by C4Q on 11/19/16.
 */

public interface GiphyService {


    @GET("v1/gifs/random")
    Call<GifPojo> getRandomGiphy(@Query("api_key") String apiKey);
}
