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
public class Ejecutor03 {
    public static void main(String[] args) {
        
               
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
         };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        
        MenuCarta mCarta = new MenuCarta();
        MenuDia mDia = new MenuDia();
        MenuNinios mNinio = new MenuNinios();
        MenuEconomico mEco = new MenuEconomico();
        
        for(int i = 0; i < datos001.length; i++){
            mNinio.establecerNomPlato(datos001[i][0]);
            mNinio.establecerValorInicialM(Double.parseDouble(datos001[i][1]));
            mNinio.establecerValorPorcionHelada(Double.parseDouble(datos001[i][2]));
            mNinio.establecerValorPorcionPastel(Double.parseDouble(datos001[i][3]));
            
            mNinio.calcularValorTotal();
            
            lista.add(mNinio);
        }
        
        for(int i = 0; i < datos002.length; i++){
            mEco.establecerNomPlato(datos002[i][0]);
            mEco.establecerValorInicialM(Double.parseDouble(datos002[i][1]));
            mEco.establecerPorcentajeDescuento(Double.parseDouble(datos002[i][2]));

            mEco.calcularValorTotal();

            lista.add(mEco);
        }
        
        for(int i = 0; i < datos003.length; i++){
            mDia.establecerNomPlato(datos003[i][0]);
            mDia.establecerValorInicialM(Double.parseDouble(datos003[i][1]));
            mDia.establecerValorPostre(Double.parseDouble(datos003[i][2]));
            mDia.establecerValorBebida(Double.parseDouble(datos003[i][3]));
            
            mDia.calcularValorTotal();
            
            lista.add(mDia);
        }
        
        for(int i = 0; i < datos004.length; i++){
            mCarta.establecerNomPlato(datos004[i][0]);
            mCarta.establecerValorInicialM(Double.parseDouble(datos004[i][1]));
            mCarta.establecerValorGuarnicion(Double.parseDouble(datos004[i][2]));
            mCarta.establecerValorBebida(Double.parseDouble(datos004[i][3]));
            mCarta.establecerPorcentajeAdicional(Double.parseDouble(datos004[i][4]));
            
            mCarta.calcularValorTotal();
            
            lista.add(mCarta);
        }
        
        // Fin de solución
        
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu(i);
        }
        
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta();
        miCuenta.establecerNombCli("Luis Andrade");
        miCuenta.establecerListaMenu(lista);
        miCuenta.establecerIva(10);
        
        
        miCuenta.establecerSubTotal(15);
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
    }
}
