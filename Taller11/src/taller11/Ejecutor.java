/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        ArrayList<Menu>listamenu=new ArrayList<>();
        
        //Menu Carta
        MenuCarta mCarta= new MenuCarta();
        mCarta.establecerNomPlato("Arroz frito con carne azafa");
        mCarta.establecerValorInicialM(2);
        mCarta.establecerValorGuarnicion(1.50);
        mCarta.establecerValorBebida(2.50);
        mCarta.establecerPorcentajeAdicional(10);
        mCarta.calcularValorTotal();
        
        //Menu del dia
        MenuDia mDia= new MenuDia();
        mDia.establecerNomPlato("Mote con huevo");
        mDia.establecerValorInicialM(2.60);
        mDia.establecerValorPostre(1.75);
        mDia.establecerValorBebida(2.56);
        mDia.calcularValorTotal();
        
        //Menu de niños
        MenuNinios mNinios01 = new MenuNinios();
        MenuNinios mNinios02 = new MenuNinios();
        mNinios01.establecerNomPlato("Amburgueza con papas fritas");
        mNinios01.establecerValorInicialM(3.80);
        mNinios01.establecerValorPorcionHelada(3.50);
        mNinios01.establecerValorPorcionPastel(4.50);
        mNinios01.calcularValorTotal();
        
        mNinios02.establecerNomPlato("Panqueques con jalea");
        mNinios02.establecerValorInicialM(2.75);
        mNinios02.establecerValorPorcionHelada(2.50);
        mNinios02.establecerValorPorcionPastel(5.50);
        mNinios02.calcularValorTotal();

        //Menu economico
        MenuEconomico mEcono = new MenuEconomico();
        mEcono.establecerNomPlato("Agachadito: guata con arroz y carne");
        mEcono.establecerValorInicialM(2.30);
        mEcono.establecerPorcentajeDescuento(10);
        mEcono.calcularValorTotal();
        
        
        // El ArrayList
        listamenu.add(mCarta);
        listamenu.add(mDia);
        listamenu.add(mNinios01);
        listamenu.add(mNinios02);
        listamenu.add(mEcono);
        
        Cuenta c= new Cuenta();
        
        c.establecerListaMenu(listamenu);
        c.establecerNombCli("Mario Calva");
        c.establecerIva(10);
        c.establecerValorCancelar();
        
        System.out.println(c);
    }
}
