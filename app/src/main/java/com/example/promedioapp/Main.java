package com.example.promedioapp;

public interface Main {
    public interface Vista{
        public void MostrarResultado(String r);

    }
    public interface Presentador{
        public void CalcularPromedio(String n1,String n2, String n3);
        public void MostrarResultado(String r);
    }
    public interface Model{
        public void CalcularPromedio(String n1,String n2, String n3);

    }
}
