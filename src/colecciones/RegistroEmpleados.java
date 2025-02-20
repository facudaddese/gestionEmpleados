package colecciones;

import java.util.HashMap;
import java.util.Map;

public class RegistroEmpleados {

    Map<Integer, Empleado> empleados;

    public RegistroEmpleados() {
        this.empleados = new HashMap<>();
    }

    public void agregarEmpleados(int id, Empleado e) {
        empleados.put(id, e);
        System.out.println("Empleado agregado con exito");
    }

    public void buscarEmpleados(int id) throws EmpleadoNoEncontradoException {
        if (empleados.containsKey(id)) {
            System.out.println("Empleado encontrado con exito: " + empleados.get(id).getNombre() + " " + empleados.get(id).getApellido());
            return;
        }
        throw new EmpleadoNoEncontradoException("No se encontro al empleado");
    }

    public void eliminarEmpleados(int id) throws EmpleadoNoEncontradoException {
        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("Empleado eliminado con exito");
            return;
        }
        throw new EmpleadoNoEncontradoException("No se encontro al empleado");
    }

    public void mostrarEmpleados() {
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            Empleado empleado = entry.getValue();
            System.out.println(empleado.getNombre() + " " + empleado.getApellido());
        }
    }
}
