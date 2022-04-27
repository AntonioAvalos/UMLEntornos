public class Modulo {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the alumnado
     */
    public Alumno[] getAlumnado() {
        return alumnado;
    }

    /**
     * @param alumnado the alumnado to set
     */
    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * @return the claustro
     */
    public Profesor[] getClaustro() {
        return claustro;
    }

    /**
     * @param claustro the claustro to set
     */
    public void setClaustro(Profesor[] claustro) {
        this.claustro = claustro;
    }

    /**
     * @return the pruebaExamen
     */
    public Examen getPruebaExamen() {
        return pruebaExamen;
    }

    /**
     * @param pruebaExamen the pruebaExamen to set
     */
    public void setPruebaExamen(Examen pruebaExamen) {
        this.pruebaExamen = pruebaExamen;
    }

    /**
     * @return the pruebaTarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * @param pruebaTarea the pruebaTarea to set
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }

    private String nombre;

    private String contenido;

    private int horas;

    private Alumno[] alumnado;

    private Profesor[] claustro;

    private Examen pruebaExamen;

    private Tarea pruebaTarea;
    
    /**
     * Constructor
     * @param nombre
     * @param contenido
     * @param horas
     * @param alumnado
     * @param claustro
     * @param pruebaExamen
     * @param pruebaTarea 
     */

    public Modulo(String nombre, String contenido, int horas, Alumno[] alumnado, Profesor[] claustro, Examen pruebaExamen, Tarea pruebaTarea) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.horas = horas;
        this.alumnado = alumnado;
        this.claustro = claustro;
        this.pruebaExamen = pruebaExamen;
        this.pruebaTarea = pruebaTarea;
    }
    
    

    public void matricularAlumno() {
    }

    public void contratarProfesor() {
    }

    public void evaluarAlumno() {
    }
}
