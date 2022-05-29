/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author usuario
 */
public class MenuCarta extends Menu{
    
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;
    
    public void establecerValorGuarnicion(double v){
        valorGuarnicion = v;
    }
    public void establecerValorBebida(double v){
        valorBebida = v;
    }
    public void establecerPorcentajeAdicional(double p){
        porcentajeAdicional = p;
    }
    
    public double obtenerValorGuarnicion(){
        return valorGuarnicion;
    }
    public double obtenerValorBebida() {
        return valorBebida;
    }
    public double obtenerPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    @Override
    public void calcularValorTotal() {
        porcentajeAdicional = ((porcentajeAdicional * obtenerValorMenu()) / 100);
        valorMenu = (valorInicialM + valorGuarnicion + valorBebida)
             + porcentajeAdicional;
    }

    @Override
    public String toString() {
        String c = String.format("Menu a la carta\n%s",super.toString());
        c = String.format("%s"
                + "Valor porcion guarnicion: %.2f\n"
                + "Valor bebida: %.2f\n"
                + "Porcentaje Adicional: %.2f\n"
                + "Valor menu: %.2f\n"
                ,c
                ,obtenerValorGuarnicion()
                ,obtenerValorBebida()
                ,obtenerPorcentajeAdicional()
                ,obtenerValorMenu()
        );
        return c;
    }
}
