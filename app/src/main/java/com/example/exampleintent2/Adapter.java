package com.example.exampleintent2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    List<ModelClass> list;
    Context context;
    Activity activity;

    public Adapter(List<ModelClass> list, Context context, Activity activity) {
        this.list = list;
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.listlayout, parent, false);

        TextView isim = view.findViewById(R.id.isim);
        TextView soyIsim = view.findViewById(R.id.soyIsim);
        TextView numara = view.findViewById(R.id.numara);

        LinearLayout linearLayout = view.findViewById(R.id.listAnaLayoout);

        final String isimS = list.get(position).getIsim();
        final String soyIsimS = list.get(position).getSoyIsim();
        final String numaraS = list.get(position).getNumara();

        isim.setText(isimS);
        soyIsim.setText(soyIsimS);
        numara.setText(numaraS);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("name", isimS); //burada bir hata veriyor inner classta olduğu için yukaruda değilkeni final yaparak problemi çözüyoruz.
                intent.putExtra("lastname", soyIsimS);
                intent.putExtra("number", numaraS);
                activity.startActivity(intent);  // burada direk startAc. diyemedik bu yüzden activity ihtiyacı dpğdu ve yukarı da activity tanımladık. kurucu methoda ekledik.

            }
        });

        return view;
    }
}
