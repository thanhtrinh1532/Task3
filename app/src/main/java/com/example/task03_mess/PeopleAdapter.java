package com.example.task03_mess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.task03_mess.R;
import com.example.task03_mess.data.People;

import java.util.List;

public class PeopleAdapter extends BaseAdapter {

    private Context context;
    private List<People> peopleList;

    public PeopleAdapter(Context context, List<People> peopleList) {
        this.context = context;
        this.peopleList = peopleList;
    }

    @Override
    public int getCount() {
        return peopleList.size();
    }

    @Override
    public Object getItem(int position) {
        return peopleList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            // Inflate layout for each item
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_chat, parent, false);
            holder = new ViewHolder();

            // Bind views
            holder.avatar = convertView.findViewById(R.id.avatar);
            holder.name = convertView.findViewById(R.id.chat_name);
            holder.lastMessage = convertView.findViewById(R.id.chat_message);
            holder.time = convertView.findViewById(R.id.chat_time);
            holder.unreadCount = convertView.findViewById(R.id.chat_unread_count);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the current People item
        People person = peopleList.get(position);

        // Set data to views
        holder.avatar.setImageResource(person.getAvatarResource());
        holder.name.setText(person.getName());
        holder.lastMessage.setText(person.getLastMessage());
        holder.time.setText(person.getTime());

        // Set unread message count
        if (person.getUnreadCount() > 0) {
            holder.unreadCount.setVisibility(View.VISIBLE);
            holder.unreadCount.setText(String.valueOf(person.getUnreadCount()));
        } else {
            holder.unreadCount.setVisibility(View.GONE);
        }

        return convertView;
    }

    // ViewHolder class for efficient view binding
    static class ViewHolder {
        ImageView avatar;
        TextView name;
        TextView lastMessage;
        TextView time;
        TextView unreadCount;
    }
}

