package com.example.retrofit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;

public class DataAdapter extends ArrayAdapter<User> {

    public DataAdapter(Context context, int res, List<User> users) {
        super(context, res, users);
    }

    @NonNull
    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView userName = (TextView) convertView.findViewById(R.id.userName);
        userName.setText(user.getUsername());
        return convertView;
    }
}