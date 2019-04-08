package com.example.firebaseupload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<Upload> {

    Context context;

    public arrayAdapter(Context context, int ressourceId, List<Upload> items){
        super(context, ressourceId, items);

    }

    public View getView(int position, View convertView, ViewGroup parent){
        Upload upload_item = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        //TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        //name.setText(upload_item.getName());

        switch(upload_item.getImageUrl()){
            case "default":
                Glide.with(convertView.getContext()).load(R.mipmap.ic_launcher).into(image);
                break;
            default:
                //Glide.clear(image);
                Glide.with(convertView.getContext()).load(upload_item.getImageUrl()).into(image);
        }

        return convertView;
    }
}
