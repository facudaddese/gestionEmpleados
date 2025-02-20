package colecciones;

public class Colecciones {

    public static void main(String[] args) {

        RegistroEmpleados registro = new RegistroEmpleados();

        registro.agregarEmpleados(1, new EmpleadoTiempoCompleto("Facundo", "Daddese", 700000, 1));
        registro.agregarEmpleados(2, new EmpleadoPorHora("Federico", "Bruno", 6, 20000, 2));
        registro.agregarEmpleados(3, new EmpleadoTiempoCompleto("Nicolas", "Perez", 900000, 3));
        registro.agregarEmpleados(4, new EmpleadoPorHora("Diego", "Rios", 7, 10000, 4));

        System.out.println("\n--- EMPLEADOS ---");
        registro.mostrarEmpleados();

        try {
            System.out.println("\nBuscamos al empleado con ID 3 ");
            registro.buscarEmpleados(3);
            System.out.println("\nBuscamos al empleado con ID 11 ");
            registro.buscarEmpleados(11);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nEliminamos el empleado con el ID 2");
            registro.eliminarEmpleados(2);
            System.out.println("\nEliminamos el empleado con el ID 22");
            registro.eliminarEmpleados(22);
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nEjecucion finalizada\n");
        }

        System.out.println("--- EMPLEADOS ---");
        registro.mostrarEmpleados();
        System.out.println("\n");
    }

}
