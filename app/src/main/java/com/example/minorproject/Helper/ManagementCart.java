package com.example.minorproject.Helper;

import android.content.Context;
import android.widget.Toast;

import com.example.minorproject.Domain.PopularDomain;

import java.util.ArrayList;

public class ManagementCart {
    private Context context;
    private TinyDB tinyDb;

    public ManagementCart(Context context) {
        this.context = context;
        this.tinyDb=new TinyDB(context);
    }

    public void insertfood(PopularDomain items){
        ArrayList<PopularDomain> listpop=getListCart();
        boolean exitalready=false;
        int n=0;
        for (int i=0;i< listpop.size();i++){
            if (listpop.get(i).getTitle().equals(items.getTitle())){
                exitalready=true;
                n=i;
                break;
            }
        }
        if(exitalready){
            listpop.get(n).setNumberInCart(items.getNumberInCart());
        }
        else{
                listpop.add(items);
        }
        tinyDb.putListObject("CartList",listpop);
        Toast.makeText(context, "Added to your Cart", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<PopularDomain> getListCart(){
        return tinyDb.getListObject("CartList");
    }

    public Double getTotalFee(){
        ArrayList<PopularDomain> listItem=getListCart();
        double fee=0;
        for(int i=0;i<listItem.size();i++){
            fee=fee+(listItem.get(i).getPrice()*listItem.get(i).getNumberInCart());
        }
        return fee;
    }
    public void minusNumberItem(ArrayList<PopularDomain> listItem,int position,ChangeNumberItemListner changeNumberItemListner){
        if(listItem.get(position).getNumberInCart()==1){
            listItem.remove(position);
        }else{
            listItem.get(position).setNumberInCart(listItem.get(position).getNumberInCart()-1);
        }
        tinyDb.putListObject("CartList",listItem);
        changeNumberItemListner.change();
    }
    public void plusNumberItem(ArrayList<PopularDomain> listItem,int position,ChangeNumberItemListner changeNumberItemListner){
        listItem.get(position).setNumberInCart(listItem.get(position).getNumberInCart()+1);
        tinyDb.putListObject("CartList",listItem);
        changeNumberItemListner.change();
    }
}
