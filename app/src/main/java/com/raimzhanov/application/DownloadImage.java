package com.raimzhanov.application;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DownloadImage {

    public static void downloadImage(String urlImage, ImageView imageView){
        Picasso.get().load(urlImage).placeholder(R.drawable.ic_baseline_cached_24).into(imageView);
    }
}
