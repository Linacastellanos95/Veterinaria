public class App {
    public static void main(String[] args) throws Exception {
       
   //En este caso creo la variable local "michi" de tipo Paciente
   Paciente michi = new Paciente();
   //Le asigno nombre al michi
   michi.nombre = "Mabel";
   michi.especie = "gato";
   


   Paciente perro = new Paciente();
   perro.nombre = "Guitto";
   perro.especie = "perro";

   Paciente agatha = new Paciente();
   agatha.nombre = "Agatha";
   agatha.especie = "gato";

   ClinicaVeterinaria vete = new ClinicaVeterinaria();
   vete.nombre = "Pupis";

   //Llamo a los métodos de ingresarlos a la veterinaria
   vete.ingresar(michi);
   vete.ingresar(perro);

   vete.imprimirListaPacientes();

   System.out.println("El nombre del primer paciente es: "+ michi.nombre);
   System.out.println("El nombre del segundo paciente es: "+ perro.nombre);
   System.out.println("El nombre del tercer paciente es: "+ agatha.nombre);

   Cliente dueño1 = new Cliente();
   dueño1.nombre = "Pedro";
   michi.dueño = dueño1;
   dueño1.direccion = "Roma 2";



   Cliente dueño2 = new Cliente();
   dueño2.nombre = "Lina";
   perro.dueño = dueño2;

   Cliente dueño3 = new Cliente();
   dueño3.nombre = "Lucas";
   agatha.dueño = dueño3;

   System.out.println("El dueño del primer paciente es: "+ michi.dueño.nombre);
   System.out.println("El dueño del segundo paciente es: "+ perro.dueño.nombre);
   System.out.println("El dueño del tercer paciente es: "+ agatha.dueño.nombre);
   System.out.println("La dirección de Pedro es: "+ michi.dueño.direccion);



    }
}
