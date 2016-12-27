package com.burakkacar.yahooweatherapplication.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.burakkacar.yahooweatherapplication.Adapters.MyRecyclerViewAdapter;
import com.burakkacar.yahooweatherapplication.Models.NewsModel;
import com.burakkacar.yahooweatherapplication.R;
import com.burakkacar.yahooweatherapplication.ServisInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MuhammedBurak on 23.12.2016.
 */

public class FragmentRetroGetir extends android.support.v4.app.Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_retrofit,container,false);
        final RecyclerView mRecycler = (RecyclerView) view.findViewById(R.id.myRecyclerView);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        //Adapter tanimi
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ServisInterface mInterface = retrofit.create(ServisInterface.class);

        Call<NewsModel> listem = mInterface.getMyNews();
        listem.enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, Response<NewsModel> response) {
                Toast.makeText(getActivity(),"Haberler Geldi ! ",Toast.LENGTH_LONG).show();
                Log.d("bastımı",response.body().getArticles().get(0).getTitle());
                NewsModel.ArticlesBean haberler = (NewsModel.ArticlesBean) response.body().getArticles();


                MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(getActivity(),response.body().getArticles());
                mRecycler.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {
                Toast.makeText(getActivity(),"VERİ YOK !",Toast.LENGTH_LONG).show();

            }
        });


        return view;
    }
}
