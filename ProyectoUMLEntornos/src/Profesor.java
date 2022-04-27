public class Profesor extends Persona {

    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }

    private String NRP;

    private Modulo[] docencia;
    
    /**
     * Constructor
     * @param NRP
     * @param docencia
     * @param nombre
     * @param direccion
     * @param telefono
     * @param alias
     * @param email
     * @param Apellidos 
     */

    public Profesor(String NRP, Modulo[] docencia, String nombre, String direccion, String telefono, String alias, String email, String Apellidos) {
        super(nombre, direccion, telefono, alias, email, Apellidos);
        this.NRP = NRP;
        this.docencia = docencia;
    }
    

    public void anadirModulo() {
    }

    public void setNRP() {
    }
}
