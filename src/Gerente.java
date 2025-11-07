//Clase Gerente que se extiende de la clase Empleado y el atributo bono
public class Gerente extends Empleado {
    private int bono;

    //Declaramos un constructor que hereda los atributos de Empleado
    public Gerente(String nombre, int salario, String departamento, int bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
    }

    //Declaramos los setters y getters
    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    //Metodo toString para mostrar los atributos
    @Override
    public String toString() {
        return "Gerente{" +
                "Nombre=" + getNombre() +
                ", Salario=" + getSalario() +
                ", Departamento=" + getDepartamento() +
                ", Bono=" + bono +
                '}';
    }
}
