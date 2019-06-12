package com.dicoding.linkmyhero;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<MyData> myData;

    public MyAdapter(ArrayList<MyData> myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.my_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {
        Glide.with(myViewHolder.context)
                .load(myData.get(i).getImgurl())
                .into(myViewHolder.imgLink);
        myViewHolder.tvJudul.setText(myData.get(i).getJudul());
        myViewHolder.tvKeterangan.setText(myData.get(i).getKeterangan());
        myViewHolder.tvTahun.setText(myData.get(i).getTahun());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), myViewHolder.tvJudul.getText(), Toast.LENGTH_SHORT).show();
                Intent inten = new Intent(myViewHolder.context, DetilActivity.class );
                inten.putExtra(DetilActivity.EXTRA_JUDUL, myData.get(i).getJudul());
                inten.putExtra(DetilActivity.EXTRA_KET, myData.get(i).getKeterangan());
                inten.putExtra(DetilActivity.EXTRA_TAHUN, myData.get(i).getTahun());
                inten.putExtra(DetilActivity.EXTRA_IMGURL, myData.get(i).getImgurl());
                myViewHolder.context.startActivity(inten);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (myData != null)? myData.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvJudul, tvKeterangan, tvTahun;
        private ImageView imgLink;
        private CardView cardView;
        private Context context;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgLink = (ImageView) itemView.findViewById(R.id.img);
            tvJudul = (TextView) itemView.findViewById(R.id.tv_judul);
            tvKeterangan = (TextView) itemView.findViewById(R.id.tv_keterangan);
            tvTahun = (TextView) itemView.findViewById(R.id.tv_tahun);
            cardView = (CardView) itemView.findViewById(R.id.cv_data);
        }
    }
}


