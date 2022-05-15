package com.example.ubayasecondryscool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainAdapter extends BaseExpandableListAdapter {

    ArrayList<String> listGroup;
    HashMap<String, ArrayList<String>> listChild;
    Context context;


// create constructor


    public MainAdapter (ArrayList<String> listGroup, HashMap<String, ArrayList<String>> listChild, Context context) {
        this.listGroup = listGroup;
        this.listChild = listChild;
        this.context = context;
    }


    @Override
    public int getGroupCount () {
        //return group list
        return listGroup.size();
    }

    @Override
    public int getChildrenCount (int i) {
        //return child list
        return listChild.get(listGroup.get(i)).size();
    }

    @Override
    public Object getGroup (int i) {
        //return group item
        return listGroup.get(i);
    }
    // i = group item
    // i1 = child item

    @Override
    public Object getChild (int i, int i1) {
        //return child item
        return listChild.get(listGroup.get(i)).get(i1);
    }

    @Override
    public long getGroupId (int i) {
        return i;
    }

    @Override
    public long getChildId (int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds () {
        return false;
    }

    @Override
    public View getGroupView (int i, boolean b, View view, ViewGroup viewGroup) {
        // initialize view

        String listGroup = (String) getGroup(i);
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listgroup, null);
        }
        // initialize and assign variables
        TextView parent = view.findViewById(R.id.parent);
        //set text on textview
        parent.setText(listGroup);
        // set text bold
        parent.setTypeface(null, Typeface.BOLD);
        //setTextColor
        parent.setTextColor(Color.BLUE);
        return view;
    }

    @Override
    public View getChildView (int i, int i1, boolean b, View view, ViewGroup viewGroup) {

        String listChild = (String) getChild(i, i1);

        // initialize view
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listitem, null);
        }
        // initialize and assign variables
        TextView child = view.findViewById(R.id.child);

        //set text on textview
        child.setText(listChild);
        //set on click listener


        child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                if (i == 0 && i1 == 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=i_CijGuk7fw"));
                    intent.putExtra ("force_fullscreen", true);

                    context.startActivity(intent);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        intent.removeFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    }

                }
                if (i == 0 && i1 == 1) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=h4160c9oiDg"));
                    intent.putExtra ("force_fullscreen", true);
                    context.startActivity(intent);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        intent.removeFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    }
                }
                if (i == 1 && i1 == 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y8zZZSBvNYs"));
                    intent.putExtra ("force_fullscreen", true);
                    context.startActivity(intent);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        intent.removeFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    }
                }
                if (i == 1 && i1 == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EHrGTHQ999c"));
                    intent.putExtra ("force_fullscreen", true);
                    context.startActivity(intent);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        intent.removeFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    }
                }


            }
        });

        return view;
    }

    @Override
    public boolean isChildSelectable (int i, int i1) {
        return false;
    }
}
//  String selected = (String) adapter.getChild(i,i1);
//
//                if ("Lesson a".equals(selected)) {
//                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kISB5sum51Y")));
//                } else if ("lesson b".equals(selected)) {
//                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dLDj2TTyMGM")));
//                } else if ("lesson c".equals(selected)) {
//                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZuAzy1raPmE")));
//                } else if ("lesson d".equals(selected)) {
//                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9bSsxmCguW8")));
//                }
//                return true;
//            }