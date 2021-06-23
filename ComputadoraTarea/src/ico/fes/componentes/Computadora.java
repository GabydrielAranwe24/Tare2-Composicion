/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Agustín Carmona
 */
public class Computadora {

    private int marca;
    private int modelo;
    private CPU cpu;
    private Monitor monitores;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(int marca, int modelo, CPU cpu, Monitor monitores, Mouse mouse, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitores = monitores;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitores() {
        return monitores;
    }

    public void setMonitores(Monitor monitores) {
        this.monitores = monitores;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitores=" + monitores + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }

   
    
    
}
