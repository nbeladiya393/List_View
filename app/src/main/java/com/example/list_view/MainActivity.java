package com.example.list_view;

import static android.widget.ListView.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name [] = {"AG87", "AK-47", "AK-74", "BFG 50 Benelli", " C7A2 Big bertha", "Daewoo K12", "EDDA submachine gun", "FABARM", "F.M.A.P", "M1870", "GLOCK 20SF","Erma-Panzer 58","Gyrojet Assault Rifle", "H&R Pardner", "Hakim Rifle", "HIW VSK", "Heym AG", "Hinawa REvolver", " HK AG36", "HK21", "HK91A4", "HK GR2S", "HK36", "Paris Gun", "M16A4", "AKM", "M16A2", "RPG-7", "Pistol", "Browing Automatic 5", " Auto Shotgun", "SRS99D Sniper Rifle", "SVD Dragunov", "Snipper Rifle", "M40 Sniper Rifle", "AW50 Sniper Reifle"};
  ListView item;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        item = findViewById(R.id.item);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,name);
        item.setAdapter(adapter);
        
        item.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+name, Toast.LENGTH_SHORT).show();}
        });
        
        
         
    }
}