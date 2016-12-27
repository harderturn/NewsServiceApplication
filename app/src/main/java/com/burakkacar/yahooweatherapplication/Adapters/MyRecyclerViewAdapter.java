package com.burakkacar.yahooweatherapplication.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.burakkacar.yahooweatherapplication.Models.NewsModel;
import com.burakkacar.yahooweatherapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by MuhammedBurak on 22.12.2016.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyHolder>
{
    Context mContext;
    List<NewsModel.ArticlesBean> mList;

    public MyRecyclerViewAdapter(Context context, List<NewsModel.ArticlesBean> listem)
    {
        mContext = context; mList = listem;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        MyHolder myHolder = new MyHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position)
    {
        holder.doldur(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder
    {

        TextView tvOzet,tvDetay;
        ImageView haberimage;

        public MyHolder(View itemView) {
            super(itemView);
            tvOzet = (TextView) itemView.findViewById(R.id.txtOzet);
            tvDetay = (TextView) itemView.findViewById(R.id.txtDetay);
            haberimage = (ImageView) itemView.findViewById(R.id.haberImage);
        }

        public void doldur(NewsModel.ArticlesBean haber)
        {
            tvOzet.setText(haber.getTitle());
            tvDetay.setText(haber.getDescription());
            Picasso.with(mContext).load(haber.getUrlToImage()).into(haberimage);
        }
    }
}
