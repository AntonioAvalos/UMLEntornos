public class Tarea {

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private String descripcion;

    /**
     * Constructor
     * @param descripcion 
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

    public void calificar() {
    }
}
