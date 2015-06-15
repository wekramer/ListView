package com.image.listview.simple.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MySimpleArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;
    private final String[] values2;

     public MySimpleArrayAdapter(Context context, String[] values, String[] values2 ) {

          super(context, R.layout.rowlayout, values);

         this.context = context;
         this.values = values;
         this.values2 = values2;

     }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        TextView textView2 = (TextView) rowView.findViewById(R.id.secondLine);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);

        textView2.setText(values2[position]);

        String s = values[position];

        /////////////////////////////////

        if (s.startsWith("A-Team")) {

            imageView.setImageResource(R.drawable.a_team);
        }

        if (s.startsWith("Android Studio")) {

            imageView.setImageResource(R.drawable.android_studio);
        }

        if (s.startsWith("Intent")) {

            imageView.setImageResource(R.drawable.intent);
        }

         if (s.startsWith("Fragments")) {

             imageView.setImageResource(R.drawable.fragments);

         }

        if (s.startsWith("Design Patterns")) {

            imageView.setImageResource(R.drawable.design_patterns);

        }

        if (s.startsWith("GitHub.com")) {

            imageView.setImageResource(R.drawable.git_hub);

        }

        if (s.startsWith("Android phones")) {

            imageView.setImageResource(R.drawable.android);

        }

        if (s.startsWith("College Football")) {

            imageView.setImageResource(R.drawable.football);

        }

        if (s.startsWith("Google I/O")) {

            imageView.setImageResource(R.drawable.google);

        }

        return rowView;
    }
}