package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import vista.*;

/**
 * Esta clase controla las funciones de la ventana principal.
 * @author Carmen
 */
public class ControladorVentanaEmpleado implements ActionListener {
    
    /**
     * Array de empleados.
     */
    Empleado []emp = new Empleado[50];
    //Arreglo, Array, Vector
    //Colección de elementos del mismo tipo
    //Los elementos se accesan por el indice
    //El indice es un numero entero que inicia
    //en 0 y termina en 50-1
    
    /**
     * Instancia un objeto VentanaEmpleado.
     */
    VentanaEmpleado ventana = new VentanaEmpleado();
    
    /**
     * Índice del array de empleados.
     */
    int indice; //Para manejar el arreglo
    
    /**
     * Este método es llamado desde la clase {@link principal.Principal#Principal() }, recibiendo como parámetros un objeto
     * ventana y un array de empleados, y añade los listener al objeto ventana.
     * @param ventana
     * @param emp 
     */
    public ControladorVentanaEmpleado(VentanaEmpleado ventana, Empleado []emp){
        this.ventana = ventana;
        this.emp = emp;
        indice = 0;
        //Inicializamos el arreglo
        for (int i=0; i<emp.length; i++){
            emp[i]=new Empleado();
        }
        ventana.btnGuardar.addActionListener(this);
        ventana.btnImprimir.addActionListener(this);
        ventana.btnNuevo.addActionListener(this);
    }
    
    /**
     * Habilita los controles de la ventana.
     */
    public void activaControles(){
        ventana.btnGuardar.setEnabled(true);
        ventana.btnImprimir.setEnabled(true);
        ventana.btnNuevo.setEnabled(false);
        ventana.txtApellidos.setEnabled(true);
        ventana.txtClave.setEnabled(true);
        ventana.txtEdad.setEnabled(true);
        ventana.txtNombre.setEnabled(true);
        ventana.txtRFC.setEnabled(true);
        ventana.txtTelefono.setEnabled(true);
    }
    
    /**
     * Deshabilita los controles de la ventana.
     */
    public void desactivaControles(){
        ventana.btnGuardar.setEnabled(false);
        ventana.btnImprimir.setEnabled(false);
        ventana.btnNuevo.setEnabled(true);
        ventana.txtApellidos.setEnabled(false);
        ventana.txtClave.setEnabled(false);
        ventana.txtEdad.setEnabled(false);
        ventana.txtNombre.setEnabled(false);
        ventana.txtRFC.setEnabled(false);
        ventana.txtTelefono.setEnabled(false);
    }
    
    /**
     * Establece los controles por defecto, y la edad a 18.
     */
    public void limpiaControles(){
        ventana.txtApellidos.setText("");
        ventana.txtClave.setText("");
        ventana.txtEdad.setText("18");
        ventana.txtNombre.setText("");
        ventana.txtRFC.setText("");
        ventana.txtTelefono.setText("");
    }
    
    /**
     * Actúa en función del botón pulsado.
     * Si se pulsa "Nuevo" permite activar los controles, y posteriormente los pone por defecto, como hemos visto en la
     * función {@link #limpiaControles()}
     * Si se pulsa "Guardar", comprueba que quede espacio en el array y procede a guardar los datos. En caso de que el array
     * esté lleno, lanza un mensaje de error.
     * Finalmente, si pulsa "Imprimir", comprueba si hay empleados, en caso de no haber, muestra un mensaje. Si hay empleados,
     * los lista utilizando el método {@link controlador.ControladorListaEmpleados#ControladorListaEmpleados(modelo.Empleado[], vista.ListaEmpleados, int) }.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==ventana.btnNuevo){
            activaControles();
            limpiaControles();
        }
        if (e.getSource()==ventana.btnGuardar){
            if (indice < emp.length){
                emp[indice].setNombre(ventana.txtNombre.getText());
                emp[indice].setApellidos(ventana.txtApellidos.getText());
                emp[indice].setClave(ventana.txtClave.getText());
                emp[indice].setTelefono(ventana.txtTelefono.getText());
                emp[indice].setRfc(ventana.txtRFC.getText());
                emp[indice].setEdad(Integer.parseInt(ventana.txtEdad.getText()));
                indice++;
                desactivaControles();
            }else{
                JOptionPane.showMessageDialog(ventana, "No se pueden registrar mas empleados", "Error", JOptionPane.WARNING_MESSAGE);
            }    
        }
        if (e.getSource()==ventana.btnImprimir){
            if (indice == 0){
                JOptionPane.showMessageDialog(ventana, "No se han dado de alta empleados", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                ListaEmpleados lis = new ListaEmpleados();
                ControladorListaEmpleados cl = new ControladorListaEmpleados(emp, lis, indice);
                lis.setVisible(true);
                lis.setLocationRelativeTo(ventana);
            }    
        }
    }
}
