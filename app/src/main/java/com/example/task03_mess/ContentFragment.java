package com.example.task03_mess;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.task03_mess.R;
import com.example.task03_mess.data.People;
import com.example.task03_mess.PeopleAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContentFragment extends Fragment {

    private ListView listView;
    private List<People> peopleList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_content, container, false);

        // Initialize ListView
        listView = view.findViewById(R.id.chat_list);

        // Create and populate the list of people
        populatePeopleList();

        // Set the adapter
        PeopleAdapter adapter = new PeopleAdapter(getContext(), peopleList);
        listView.setAdapter(adapter);

        return view;
    }

    private void populatePeopleList() {
        peopleList = new ArrayList<>();
        peopleList.add(new People("Ngô Thanh Trình", "For tn: 📞 or 📧?", "11:26 AM", 10, R.drawable.anhcanhan1));
        peopleList.add(new People("Ngô Quốc Toàn", "Video", "10:28 AM", 1, R.drawable.anhcanhan2));
        peopleList.add(new People("Trần Hứu Thịnh", "Video", "9:28 AM", 4, R.drawable.anhcanhan3));
        peopleList.add(new People("Thanh Phong", "Dinner soon? 🍷", "8:15 AM", 2, R.drawable.people));
        peopleList.add(new People("Tấn Đạt", "GIF", "8:03 AM", 5, R.drawable.people));
    }
}
