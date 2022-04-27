public class Examen {

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

    /**
     * @return the listapreguntas
     */
    public Pregunta[] getListapreguntas() {
        return listapreguntas;
    }

    /**
     * @param listapreguntas the listapreguntas to set
     */
    public void setListapreguntas(Pregunta[] listapreguntas) {
        this.listapreguntas = listapreguntas;
    }

    private String descripcion;

    private Pregunta[] listapreguntas;

    /**
     * Constructor 
     * @param descripcion
     * @param listapreguntas 
     */
    public Examen(String descripcion, Pregunta[] listapreguntas) {
        this.descripcion = descripcion;
        this.listapreguntas = listapreguntas;
    }
    
    

    public void calificar() {
    }
    
    
}
