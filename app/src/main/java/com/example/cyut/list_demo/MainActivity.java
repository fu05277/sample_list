package com.example.cyut.list_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private ListView listView;
    private ListAdapter listAdapter;
    private User user;
    private ArrayList<User> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //region findview
        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);
        listView=(ListView)findViewById(R.id.listView);
        //endregion
        user=new User();
        userList=new ArrayList();
        user.name="a";
        userList.add(user);
        user=new User();
        user.name="b";
        userList.add(user);
        //region 案扭事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_LONG).show();
                Log.e("Zion","button test");
                user=new User();
                user.name=editText.getText().toString();
                listAdapter.add(user);
            }
        });
        //endregion
        listAdapter=new ListAdapter(MainActivity.this,userList);
        listView.setAdapter(listAdapter);

    }

}
