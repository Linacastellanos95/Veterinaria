import java.util.Date;
public class Empleado extends Persona {
    
    public int numeroLegajo;
    public String numeroDeCuil;
    public Date fechaDeIngreso;    
    public String diasDeTrabajo; //Lunes a viernes.
    public String turnoDeTrabajo; //Mañana,tarde,noche
    public String cbu;
    public double sueldo;

    public boolean esValidocbu(){
        if (this.cbu.length()==22 ){
            return true;
        }
            return false;

    }




}
