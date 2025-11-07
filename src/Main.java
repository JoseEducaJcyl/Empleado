// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        //Declaramos dos objetos de la clase Empleado, un gerente y un desarrollador
        Empleado gerente = new Gerente("Nombre1",1220,"Departamento1",100);
        Empleado desarrolador = new Desarrollador("Nombre2",1200,"Departamento2",
                "Java");
        //Motramos la informacion de cada objeto
        System.out.println(gerente.toString());
        System.out.println(desarrolador.toString());
    }
}
