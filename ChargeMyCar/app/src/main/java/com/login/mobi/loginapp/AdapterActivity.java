package com.login.mobi.loginapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.login.mobi.loginapp.API.Postos;

import java.util.List;

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.ViewHolder> {

    private Context mContext;
    private List<Postos> mListPos;

    public AdapterActivity(Context mContext, List<Postos> postos) {
        this.mContext = mContext;
        this.mListPos = postos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View concertView = inflater.inflate(R.layout.item_postos, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(concertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        Postos postos= mListPos.get(i);
        TextView textpos = viewHolder.nPos;
        textpos.setText(postos.adressInfo.getTitle());


        textpos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext , detailed_inf.class);
                Postos postos= mListPos.get(i);

                String nome = postos.adressInfo.getTitle();
                intent.putExtra("nome", nome);
                String cidade = postos.adressInfo.getTown();
                intent.putExtra("cidade",cidade);

                String morada = postos.adressInfo.getAdressLine1();

                intent.putExtra("morada",morada);


                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mListPos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nPos;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nPos = (TextView) itemView.findViewById(R.id.nome_postos);


        }}
}
