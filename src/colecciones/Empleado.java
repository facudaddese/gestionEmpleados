package colecciones;

public abstract class Empleado implements IPagable{

    private String nombre, apellido;
    private int id;

    public Empleado(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    @Override
    public abstract int calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
