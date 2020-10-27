package com.example.exampleintent2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ModelClass> list;
    ListView listView;

    /*
    listlayout 'un clickAble özelliğini true yaptık. tıklanabilmesi için.
    ikinci olarak LinearLayout linearLayout = view.findViewById(R.id.listAnaLayoout); diyerke bir layout nesnesi oluşturduk. bunu tkalandılandığında
    diğer activity'e geç diyebilmek için dedik.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doldur();
        gec();
    }

    public void doldur() {
        list = new ArrayList<>();
        ModelClass m1 = new ModelClass("Cem", "Güntürk", "0551 203 6845");
        ModelClass m2 = new ModelClass("Durdane", "Akkaş", "0545 614 2326");
        ModelClass m3 = new ModelClass("İrem", "Karaca", "0507 987 3256");
        ModelClass m4 = new ModelClass("Nilay", "Türker", "0505 321 9875");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
    }

    public void gec(){
        listView = findViewById(R.id.listView);
        Adapter adapter = new Adapter(list,this,this);
        listView.setAdapter(adapter);
    }
}
