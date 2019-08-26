package com.example.promedioapp;

import android.app.Activity;

public class PromedioPresentador implements Main.Presentador{
    private Main.Vista vista;
    private Main.Model model;
    public PromedioPresentador(Main.Vista vista){
        this.vista = vista;
        model = new PromedioModel(this);
    }
    @Override
    public void CalcularPromedio(String n1, String n2, String n3) {
        if(vista!=null){
            model.CalcularPromedio(n1,n2,n3);
        }
    }

    @Override
    public void MostrarResultado(String r) {
        if(vista!=null){
            vista.MostrarResultado(r);
        }
    }
}
