package com.dicoding.linkmyhero;

import android.arch.core.executor.TaskExecutor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetilActivity extends AppCompatActivity {

    public static final String EXTRA_JUDUL = "EXTRA_JUDUL";
    public static final String EXTRA_KET = "EXTRA_KET";
    public static final String EXTRA_TAHUN = "EXTRA_TAHUN";
    public static final String EXTRA_IMGURL = "EXTRA_IMGURL";

    private TextView tvDetilJudul, tvDetilKeterangan, tvDetilTahun;
    private ImageView imgDetil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil);

        tvDetilJudul = (TextView) findViewById(R.id.tv_detil_judul);
        tvDetilKeterangan = (TextView) findViewById(R.id.tv_detil_Keterangan);
        tvDetilTahun = findViewById(R.id.tv_detil_tahun);
        imgDetil = findViewById(R.id.img_detil);

        tvDetilJudul.setText(getIntent().getStringExtra(EXTRA_JUDUL));
        tvDetilKeterangan.setText(getIntent().getStringExtra(EXTRA_KET));
        tvDetilTahun.setText(getIntent().getStringExtra(EXTRA_TAHUN));
        Glide.with(getApplicationContext())
                .load(getIntent().getStringExtra(EXTRA_IMGURL))
                .into(imgDetil);

    }
}
