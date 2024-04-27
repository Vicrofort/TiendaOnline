package com.example.tiendaonline.adapters
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendaonline.modelos.Producto


class ProductoAdapter (val productos:ArrayList<Producto>) :RecyclerView.Adapter<ProductoAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductoAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    class ViewHolder (itemView:View) : RecyclerView.ViewHolder(ItemView){
        init {

        }
        fun bindItems(producto: Producto)
    }

}