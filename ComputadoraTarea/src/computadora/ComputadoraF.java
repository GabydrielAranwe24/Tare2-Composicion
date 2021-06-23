package computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

public class ComputadoraF {

    public static void main(String[] args) {

        // Computadora c1 = new Computadora(2, 1212, cpu, monitores, mouse, teclado);
        Computadora c1 = new Computadora(1, 2, new CPU(" HP ", " xd ", 25), new Monitor(" Samsung ", " 4k ", 24), new Mouse(" Logitech ", " M100 ", " Alambrico "), new Teclado(" Logitech ", " A231 ", 234, 2));
        //System.out.println(c1);
        // System.out.println( c1.getCpu() + " " + c1.getMonitores() + " " + c1.getMouse() + " " + c1.getTeclado());
        System.out.println("CPU" + c1.getCpu().getMarca() + "modelo" + c1.getCpu().getModelo() + "velocidad del procesador " + c1.getCpu().getVelocidadProcesor() + "GHz");
        System.out.println("Monitor" + c1.getMonitores().getMarca() + "modelo" + c1.getMonitores().getModelo() + " de " + c1.getMonitores().getPulgadas() + " pulgadas ");
        System.out.println("Teclado" + c1.getTeclado().getMarca() + "modelo" + c1.getTeclado().getModelo() + " número de teclas " + c1.getTeclado().getNumeroDeTeclas());
        System.out.println("Mouse" + c1.getMouse().getMarca() + "modelo" + c1.getMouse().getModelo() + "tipo" + c1.getMouse().getTipo());         
    
    
    }

}
