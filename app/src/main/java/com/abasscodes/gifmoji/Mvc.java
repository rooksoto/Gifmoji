package com.abasscodes.gifmoji;

import android.view.View;

import com.abasscodes.gifmoji.model.pojos.GifPojo;

import java.util.Observable;

import retrofit2.Call;

/**
 * Created by C4Q on 11/19/16.
 */

public interface Mvc {

    public interface Model{
        Call<GifPojo> getRandomGiphy();
    }

    public interface View extends android.view.View.OnClickListener{

    }

    public interface Controller{
        void showTheGiphy(String mpyUrl);
    }
}
