package colecciones;

public class EmpleadoPorHora extends Empleado {

    private int hsTrabajadas, sueldoPorHs;

    public EmpleadoPorHora(String nombre, String apellido, int hsTrabajadas, int sueldoPorHs, int id) {
        super(nombre, apellido, id);
        this.hsTrabajadas = hsTrabajadas;
        this.sueldoPorHs = sueldoPorHs;
    }

    @Override
    public int calcularSueldo() {
        sueldoPorHs *= hsTrabajadas;
        return sueldoPorHs;
    }

    public int getHsTrabajadas() {
        return hsTrabajadas;
    }

    public void setHsTrabajadas(int hsTrabajadas) {
        this.hsTrabajadas = hsTrabajadas;
    }

    public int getSueldoPorHs() {
        return sueldoPorHs;
    }

    public void setSueldoPorHs(int sueldoPorHs) {
        this.sueldoPorHs = sueldoPorHs;
    }

}
