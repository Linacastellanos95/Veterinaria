import java.util.Date;

public class Insumo {
    public String nombre;
    public Date fechaIngreso;
    public String codigoInsumo;
    public Date fechaCaducidad;
    public double precio;
    public double costo;

    public boolean estaVencido() {
        Date hoy = new Date(); //Date es un objeto en java genera por defecto la fecha de hoy

        if (this.fechaCaducidad.after(hoy)){
         return true;
    }
         return false;

   }
}
