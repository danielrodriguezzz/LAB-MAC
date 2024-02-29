package com.mycompany.cola_nod;

public class Lista_metodos {

    nodo inicio;
    nodo fin;

    public Lista_metodos() {
        inicio = null;
        fin = null;
    }

    public void insertarInicio(String dato) {
        nodo nuevo = new nodo(dato, inicio);
        inicio = nuevo;
        if (inicio == null) {
            fin = inicio;
        }
    }

    public void insertarFinal(String dato) {
        nodo nuevo = new nodo(dato, null);
        if (inicio == null) {
            fin = nuevo;
            inicio = fin;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }

    }

    public void eliminarInicio() {
        inicio = inicio.siguiente;
    }

    public String ExtraerInicio() {
        String dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = null;
        }
        return dato;

    }

    public void mostrarLista() {
        nodo temp = inicio;

        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.siguiente;
        }
    }

}
