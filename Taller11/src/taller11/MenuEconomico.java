/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author usuario
 */
public class MenuEconomico extends Menu{
    
    private double porcDescuento;
    
    public void establecerPorcentajeDescuento(double pD) {
        porcDescuento = (pD * valorInicialM)  / 100;
    }

    public double obtenerPorcentajeDescuento() {
        return porcDescuento;
    }
    
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialM - porcDescuento;
    }

    @Override
    public String toString() {
        String c = String.format("Menu Economico\n%s"
                , super.toString()
        );
        
        c = String.format("%s"
                + "Porcentaje descuento %.2f\n"
                + "Valor Menu: %.2f\n"
                ,c
                ,obtenerPorcentajeDescuento()
                ,obtenerValorMenu()
        );
        return c;
    }

}
