package colecciones;

public class EmpleadoTiempoCompleto extends Empleado {

    private int sueldoFijo;

    public EmpleadoTiempoCompleto(String nombre, String apellido, int sueldoFijo, int id) {
        super(nombre, apellido, id);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public int calcularSueldo() {
        return sueldoFijo;
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(int sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

}
