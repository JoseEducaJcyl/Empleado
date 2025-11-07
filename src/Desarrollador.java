//Clase Desarrollador que se extiende de la clase Empleado y el atributo lenguajeProgramacion
public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;

    //Declaramos un constructor que hereda los atributos de Empleado
    public Desarrollador(String nombre, int salario, String departamento, String lenguajeProgramacion) {
        super(nombre, salario, departamento);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //Declaramos los setters y getters
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    //Metodo toString para mostrar los atributos
    @Override
    public String toString() {
        return "Desarrollador{" +
                "Nombre=" + getNombre() +
                ", Salario=" + getSalario() +
                ", Departamento= " + getDepartamento() +
                ", Lenguaje de Programacion='" + lenguajeProgramacion + '\'' +
                '}';
    }
}
