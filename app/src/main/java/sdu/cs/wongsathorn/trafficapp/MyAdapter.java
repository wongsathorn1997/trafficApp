package sdu.cs.wongsathorn.trafficapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//activityนี้สร้าง layout เสมือน ไปแสดงผลตรงหน้าmain activity
public class MyAdapter extends BaseAdapter {
    //expicit
    Context context;
    int[] ints; //ตัวแปรเก็บรูปlogo
    String[] titleString, detailString; //titleStringเก็บชื่อ,detailStringเก็บรายละเอีนด

    public MyAdapter(Context context, int[] ints, String[] titleString, String[] detailString) {
        this.context = context;
        this.ints = ints;
        this.titleString = titleString;
        this.detailString = detailString;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลที่ต้องการแสดงผลแล้วส่งต่อไปยัง method getView
        return ints.length;
    }

    @Override
    public Object getItem(int position) { //ไม่ใช้แต่ต้องสร้างไม่งั้น error
        return null;
    }

    @Override
    public long getItemId(int position) { //ไม่ใช้แต่ต้องสร้างไม่งั้น error
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) { //นำข้อมูลที่ได้จาก method getCount ไปแสดงผลบนหน้าแอพ

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false); //inflate เป็นการดึงค่าจาก xml มาแสดงผลบน app

        //ผูกตัวแปรบน java กับ xml
        ImageView iconImageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.textView2);
        TextView detailTextView = view1.findViewById(R.id.textView3);

        //show viewนำข้อมูลไปแสดงผลบนแอพ
        iconImageView.setImageResource(ints[i]);
        titleTextView.setText(titleString[i]);
        detailTextView.setText(detailString[i]);

        return view1;
    }
} //end class
