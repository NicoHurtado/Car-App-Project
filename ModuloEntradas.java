
import java.util.Scanner;

public class ModuloEntradas
{
    String nombre;
    String clave;
    String placa;

    public void recibirCredeciales() throws Exception{
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese nombre de Usuario: ");
        this.nombre = t.nextLine();
        System.out.println("Ingrese Clave de Usuario: ");
        this.clave = t.nextLine();
        //Aqui se va a verificar La contraseña, que si exista en la base de datos txt usuarios
        ModuloProcesamiento.validarClave(clave, nombre);
        ModuloPersistencia.guardarNombre(nombre);

    }

    public String recibirPlaca() throws Exception{
        System.out.println("Ingrese la placa: ");
        Scanner t = new Scanner(System.in);
        String placa = t.next().toUpperCase();
        //Aqui se va a verificar la placa, que si exista en la base de datos txt placas
        setPlaca(placa);
        ModuloProcesamiento.validarPlaca(placa);
        return placa;
    }

    public boolean PresionBoton(){
        Scanner t = new Scanner(System.in);
        int presion = t.nextInt();

        if (presion == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public int presionOpcion(){
        Scanner t = new Scanner(System.in);
        int presion = t.nextInt();
        switch(presion){
            case 1: 
            return 1;
            case 2: 
            return 2;
            case 3: 
            return 3;
            case 4: 
            return 4;
        }
        return 0;
    }
    public int presionOpcionDos(){
        Scanner t = new Scanner(System.in);
        int presion = t.nextInt();
        return presion;
    }
    public static void presionFinal(){
        Scanner t = new Scanner(System.in);
        String presion = t.next();
        if (presion.equals("No") || presion.equals("no") || presion.equals("NO")){
            System.out.println("Policias estan llegando a su ubicacion");
        }
    
        
    }

    public String getPlaca() {
        return this.placa;
    }
    public String getClave(){
        return this.clave;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    


}
