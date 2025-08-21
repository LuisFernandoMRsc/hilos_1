package com.example.nivelacion.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nivelacion.Clases.Usuario;

import java.util.List;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {
    private Context context;
    private List<Usuario> listaUsuario;
    public UsuarioAdapter(Context context, List<Usuario> listaUsuario) {
        super(context, 0, listaUsuario);
        this.context=context;
        this.listaUsuario=listaUsuario;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
