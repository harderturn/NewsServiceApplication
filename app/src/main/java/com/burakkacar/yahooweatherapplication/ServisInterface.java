package com.burakkacar.yahooweatherapplication;

import com.burakkacar.yahooweatherapplication.Models.NewsModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by MuhammedBurak on 22.12.2016.
 */

public interface ServisInterface
{
    @GET("v1/articles?source=bbc-news&sortBy=top&apiKey=2c53d912c4e4435d944ad8759fa59159")
    Call<NewsModel> getMyNews();
}
