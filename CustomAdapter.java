package com.example.listaimagini;

import java.util.ArrayList;
import java.util.List;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends ArrayAdapter<String>{
   
	String [] result;
    Context context;
    int [] imageId;
    MainActivity activity;
	
	public CustomAdapter(Context context, int resource, MainActivity activity,int[] poze) {
		super(context, resource);
		imageId=poze;
		this.activity=activity;
	}

    
 
	
    @Override
	public View getDropDownView(int position, View convertView,
			ViewGroup parent) {
		// TODO Auto-generated method stub
		return getCustomView(position, convertView, parent);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return getCustomView(position, convertView, parent);
	}
	
	public View getCustomView(int position, View convertView,
		    ViewGroup parent) {
		   // TODO Auto-generated method stub
		   // return super.getView(position, convertView, parent);


		   LayoutInflater inflater = activity.getLayoutInflater() ;
		   View row = inflater.inflate(R.layout.imagine, parent, false);
		   
		  


		  // ImageView icon1 = (ImageView) row.findViewById(R.id.icon1);
		  // ImageView icon2 = (ImageView) row.findViewById(R.id.icon2);
		  // ImageView icon3 = (ImageView) row.findViewById(R.id.icon3);
		  // icon1.setImageResource(R.drawable.img_animal11);
		 //  icon2.setImageResource(R.drawable.img_animal12);
		 //  icon3.setImageResource(R.drawable.img_animal15);
		   return row;
		  }
	
}
