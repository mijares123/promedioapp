package com.example.promedioapp;

public class PromedioModel implements Main.Model{
    private Main.Presentador presentador;
    public PromedioModel(Main.Presentador presentador){
        this.presentador= presentador;
    }
    @Override
    public void CalcularPromedio(String n1, String n2, String n3) {
        double valor1 = Double.parseDouble(n1);
        double valor2 = Double.parseDouble(n2);
        double valor3 = Double.parseDouble(n3);

        double promedio = (valor1 + valor2 +valor3)/3;
        if(promedio< 12.5){
            presentador.MostrarResultado("desaprobado");
        }else if(promedio >= 12.5 && promedio <=14){
            presentador.MostrarResultado("logro bajo");
        }else if(promedio >= 15 && promedio <=17){
            presentador.MostrarResultado("logro medio");
        }else if(promedio >= 18 && promedio <=20){
            presentador.MostrarResultado("logro deseado");
        }
    }
}
