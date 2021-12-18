package com.example.cscseniorseminarproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ExerciseAdapter extends ArrayAdapter<Exercise> {

    private Context mContext;
    private int mResource;



    public ExerciseAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Exercise> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }
    //using Layout Inflater to make a scrolling view of the exercises, as well as a border, subtitle, etc.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.image1);

        TextView textName = convertView.findViewById(R.id.exercisetxt);

        TextView textDes = convertView.findViewById(R.id.exercisesub);

        imageView.setImageResource(getItem(position).getImage());

        textName.setText(getItem(position).getExercise());

        textDes.setText(getItem(position).getFocus());

        return convertView;
    }
}
