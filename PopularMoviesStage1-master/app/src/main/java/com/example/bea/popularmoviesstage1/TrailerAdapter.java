package com.example.bea.popularmoviesstage1;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.bea.popularmoviesstage1.data.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class TrailerAdapter<String> extends ArrayAdapter<String>{

    private String[] urls;
    Context context;
    int resource;
    public TrailerAdapter(@NonNull Context context, int resource, String[] urls) {
        super(context, resource, urls);
        this.urls = urls;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_trailer_layout,null,true);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewTrailer);
        Picasso.with(getContext()).load((java.lang.String) urls[position]).into(imageView);
        return imageView;
    }
}
