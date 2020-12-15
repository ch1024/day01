package com.example.day01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.top_ban)
    Banner mBan;

    @BindView(R.id.tab_top)
    TabLayout mTab;

    @BindView(R.id.rec_hot)
    RecyclerView mRechot;

    @BindView(R.id.rec_hot_bot)
    RecyclerView mHotbot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTab.addTab(mTab.newTab().setText("土家"));
        mTab.addTab(mTab.newTab().setText("毕业"));
        mTab.addTab(mTab.newTab().setText("最后"));
        mTab.addTab(mTab.newTab().setText("三个"));
        mTab.addTab(mTab.newTab().setText("奥利给"));
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(R.mipmap.image1);
        integers.add(R.mipmap.image2);
        integers.add(R.mipmap.image3);
        integers.add(R.mipmap.image4);
        integers.add(R.mipmap.image10);
        integers.add(R.mipmap.image11);
        BannerImageAdapter<Integer> imageAdapter = new BannerImageAdapter<Integer>(integers) {
            @Override
            public void onBindView(BannerImageHolder holder, Integer data, int position, int size) {
                Glide.with(MainActivity.this).load(data).into(holder.imageView);
            }
        };
        mBan.setBannerGalleryEffect(15,15);
        mBan.setBannerRound(15);
        mBan.setAdapter(imageAdapter);

		//123465
    }
}