/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author usuario
 */
public class MenuNinios extends Menu{
    
    private double valorPorcionHelada;
    private double valorPorcionPastel;

    public void establecerValorPorcionHelada(double v) {
        valorPorcionHelada = v;
    }
    public void establecerValorPorcionPastel(double va) {
        valorPorcionPastel = va;
    }

    public double obtenerValorPorcionHelada() {
        return valorPorcionHelada;
    }
    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicialM + valorPorcionHelada + valorPorcionPastel;
    }   

    @Override
    public String toString() {
        String c = String.format("Menu de Ninos\n%s"
                , super.toString()
        );
        c = String.format("%s"
                + "Valor Porcion Helado: %.2f\n"
                + "Valor Porcion Pastel: %.2f\n"
                + "Valor Menu: %.2f\n"
                ,c
                ,obtenerValorPorcionHelada()
                ,obtenerValorPorcionPastel()
                ,obtenerValorMenu()
        );
        return c;
    }
}
