package modelo;

/**
 * Contiene los datos de los empleados.
 * @author Carmen
 */
public class Empleado {
    //Atributos encapsulados
    /**
     * Clave del empleado.
     */
    private String clave;
    /**
     * Nombre del empleado.
     */
    private String nombre;
    /**
     * Apellidos del empleado.
     */
    private String apellidos;
    /**
     * Edad del empleado.
     */
    private int edad;
    /**
     * 
     */
    private String rfc;
    /**
     * Número de teléfono del empleado.
     */
    private String telefono;

    /**
     * Constructor sobrecargado que pone los atributos en su valor por defecto.
     */
    public Empleado(){
        clave = "";
        nombre = "";
        apellidos = "";
        edad = 18;
        rfc = "";
        telefono = "";
    }
    
    /**
     * Método que devuelve la clave del empleado.
     * @return clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Método para guardar la clave del empleado.
     * @param clave 
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Método que devuelve el nombre del empleado.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para guardar el nombre del empleado.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve los apellidos del empleado.
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método para guardar los apellidos del empleado.
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método que devuelve la edad del empleado.
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para guardar la edad del empleado.
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que devuelve el rfc del empleado.
     * @return rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Método para guardar el rfc del empleado.
     * @param rfc 
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Método que devuelve el teléfono del empleado.
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método para guardar el teléfono del empleado.
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Método que muestra todos los datos del empleado concantenados.
     * @return String con todos los datos concatenados.
     */
    public String mostrarDatos(){
        return "Nombre: "+nombre+" Apellidos: "
                +apellidos
                +" Clave: "+clave+" RFC: "+rfc;
    }

    /**
     * Método que muestra el nombre y los apellidos del empleado.
     * @return nombre y apellidos
     */
    public String mostrarNombre(){//Firma
        return nombre+" "+apellidos;
    }
    
    /**
     * Método que muestra los apellidos y el nombre del empleados, separados por un espacio.
     * @param x
     * @return apellidos y nombre
     */
    public String mostrarNombre(int x){
        return apellidos+" "+nombre;
    }
   
}
