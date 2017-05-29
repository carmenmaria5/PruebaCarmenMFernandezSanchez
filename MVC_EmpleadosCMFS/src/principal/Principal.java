package principal;

import controlador.ControladorVentanaEmpleado;
import modelo.Empleado;
import vista.VentanaEmpleado;

/**
 * Clase principal del proyecto.
 * @author Carmen
 */
public class Principal {

    /**
     * Método que instancia los objetos principales para ejecutar la aplicación
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Array para almacenar empleados
         */
        Empleado []e = new Empleado[50];
        /**
         * Instancia de la clase VentanaEmpleado
         */
        VentanaEmpleado v = new VentanaEmpleado();
        /**
         * Instancia de la clase ControladorVentanaEmpleado
         */
        ControladorVentanaEmpleado c = new ControladorVentanaEmpleado(v,e);
        /**
         * Hace visible la ventana.
         */
        v.setVisible(true);
        /**
         * Coloca la ventana sin referenciar a nada.
         */
        v.setLocationRelativeTo(null);
    }
    
}
