package com.example.minorproject.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.minorproject.Domain.ProductList;
import com.example.minorproject.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<ProductList> productListsList = null;
    private ArrayList<ProductList> arraylist;

    public ListViewAdapter(Context context, List<ProductList> animalNamesList) {
        mContext = context;
        this.productListsList = animalNamesList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<ProductList>();
        this.arraylist.addAll(animalNamesList);
    }

    public class ViewHolder {
        TextView name;
    }
    @Override
    public int getCount() {
        return productListsList.size();
    }

    @Override
    public ProductList getItem(int i) {
        return productListsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.activity_list_view_items, null);
            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(productListsList.get(i).getProductList());
        Log.d("HolderCheck", "Holder is null: " + (holder == null));
        Log.d("HolderCheck", "Name TextView is null: " + (holder.name == null));

        return view;
    }
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        productListsList.clear();
        if (charText.length() == 0) {
            productListsList.addAll(arraylist);
        } else {
            for (ProductList wp : arraylist) {
                if (wp.getProductList().toLowerCase(Locale.getDefault()).contains(charText)) {
                    productListsList.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
