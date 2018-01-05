package com.example.corpsarens2.proyecto3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Corp Sarens2 on 04/01/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

   private List<TareaDatos> listdatos;
   private Context context;


    public AdapterDatos(List<TareaDatos> listdatos, Context context) {
        this.listdatos = listdatos;
            this.context=context;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_list,parent,false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {

        TareaDatos listaItems= listdatos.get(position);
        holder.titulo.setText(listaItems.getTitulo());
        holder.descripcion.setText(listaItems.getDescripcion());
        holder.fecha.setText(listaItems.getFechaParaSerCompletada());

    }

    @Override
    public int getItemCount() {
        return listdatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView titulo,fecha,descripcion;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            titulo=(TextView) itemView.findViewById(R.id.titulo);
            fecha=(TextView) itemView.findViewById(R.id.fecha);
            descripcion=(TextView) itemView.findViewById(R.id.descripcion);
        }

    }
}
