package com.example.cyut.list_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CYUT on 2018/5/24.
 */

public class ListAdapter extends BaseAdapter {
    private Context context;
    private ViewHold viewHold ;
    private ArrayList<User> userList;
    public ListAdapter(Context context,ArrayList userList){
        this.context=context;
        this.userList=userList;
    }
    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            viewHold=new ViewHold();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list,null);
            viewHold.textView=(TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(viewHold);
        }else {
            convertView.getTag();
        }
        viewHold.textView.setText(userList.get(position).name);
        return convertView;
    }

    public void add(User user){
        userList.add(user);
        notifyDataSetChanged();
    }
    class ViewHold{
        public TextView textView;
    }
}
