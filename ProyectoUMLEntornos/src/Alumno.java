public class Alumno extends Persona {

    /**
     * @return the notaMedia
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }

    private double notaMedia;

    private Modulo[] matricula;
    
    /**
     * 
     * Constructor
     * @param notaMedia
     * @param matricula
     * @param nombre
     * @param direccion
     * @param telefono
     * @param alias
     * @param email
     * @param Apellidos 
     */

    public Alumno(double notaMedia, Modulo[] matricula, String nombre, String direccion, String telefono, String alias, String email, String Apellidos) {
        super(nombre, direccion, telefono, alias, email, Apellidos);
        this.notaMedia = notaMedia;
        this.matricula = matricula;
    }
    

    public void emitirCertificado() {
    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void matricular() {
    }
}
