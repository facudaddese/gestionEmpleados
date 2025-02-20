
# Sistema de Gestión de Empleados

Este proyecto es un **Sistema de Gestión de Empleados** en Java que permite registrar empleados de una empresa y calcular sus salarios de acuerdo con su tipo de contratación. Se almacenan los empleados en una estructura `Map<Integer, Empleado>`, permitiendo búsquedas eficientes por ID.

Cuenta con dos tipos de empleados:
-   **EmpleadoTiempoCompleto**: Tiene un salario fijo mensual.
-  **EmpleadoPorHora**: Se le paga en función de las horas trabajadas y su tarifa por hora.

Además, implementa excepciones personalizadas para manejar errores al buscar empleados no registrados.

## **Funcionalidades Principales**
    
- **Agregar empleados** (tiempo completo o por hora).  
- **Listar empleados registrados** con su nombre y apellido.  
- **Buscar empleados por ID**, lanzando una excepción si no existe.  
- **Calcular salario automáticamente** según el tipo de empleado.
    
## **Estructura del Proyecto**
   - **Empleado.java**: *Clase abstracta.*
   - **EmpleadoTiempoCompleto.java**: *Clase concreta para empleados fijos.*
   - **EmpleadoPorHora.java**:  *Clase concreta para empleados por hora.*
   - **Pagable.java**: *Interfaz para definir pago.*
   - **RegistroEmpleados.java**: *Clase que maneja el almacenamiento en un HashMap.*
   - **EmpleadoNoEncontradoException.java**: *Excepción personalizada.*
	 
## **Tecnologías Utilizadas**

-   **Java** (*POO*, *Excepciones*, *Colecciones (Map)*).
-   *Clases Abstractas*, *Interfaces* y *Herencia*.
