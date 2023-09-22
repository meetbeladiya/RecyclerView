package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    ArrayList<Contact_Model> arrcontact = new ArrayList<> ();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        arrcontact.add( new Contact_Model(R.drawable.image ,"A","8200761610"));
        arrcontact.add( new Contact_Model(R.drawable.images2 ,"B","8541255684"));
        arrcontact.add( new Contact_Model(R.drawable.images3 ,"C","9512364785"));
        arrcontact.add( new Contact_Model(R.drawable.images4 ,"D","7542681236"));
        arrcontact.add( new Contact_Model(R.drawable.images5 ,"E","9615243658"));
        arrcontact.add( new Contact_Model(R.drawable.image ,"F","8564123789"));
        arrcontact.add( new Contact_Model(R.drawable.images2 ,"G","7541889452"));
        arrcontact.add( new Contact_Model(R.drawable.images3 ,"H","7513025980"));
        arrcontact.add( new Contact_Model(R.drawable.images4 ,"I","8462135024"));
        arrcontact.add( new Contact_Model(R.drawable.images5 ,"J","8425106845"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrcontact);
        recyclerview.setAdapter(adapter);
    }
}