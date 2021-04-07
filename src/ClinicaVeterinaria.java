import java.util.*;

public class ClinicaVeterinaria {
    public String nombre;
    public String cuit;
    public String teléfono;
    public String email;

    public List<Paciente> pacientes = new ArrayList<>();
    public int capacidadMaxima = 20;

    public boolean hacerRevisión(Paciente paciente){
        System.out.println("Revisando al paciente " + paciente.nombre);
        return true;

    }

    public boolean ingresar(Paciente paciente){
        if(this.pacientes.size() < this.capacidadMaxima){
            this.pacientes.add(paciente);
            return true;

        }
         return false;
    }

    public void imprimirListaPacientes(){
        System.out.println("*******LISTADO*******");
        for (Paciente paciente : pacientes) {
            System.out.println("Paciente Ingresado: " + paciente.nombre);//imprimo el atributo nombre del paciente

        }
        System.out.println("**********************");
    }

}
