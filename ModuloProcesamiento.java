import java.io.File;
import java.util.Scanner; // es para el file No para pedir entradas
public class ModuloProcesamiento
{
    public static boolean validarClave(String clave, String nombre) throws Exception{
        boolean x = false;
        File doc = new File("Claves.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine()){
            String linea = obj.nextLine();
            if(linea.equals(clave)){
                System.out.println("------------------Bienvenido " + nombre + " -------------------");
                System.out.println("\n"); 
                x = true;
            }
        }
        if (x==false){
                System.out.println("Credenciales Incorrectas");
                System.out.println("----> Nombre usuario : " + nombre + " ----> Clave Usurio: " + clave);
                ModuloEntradas Us = new ModuloEntradas();
                Us.recibirCredeciales();
        }
        return x;
        
    }

    public static boolean validarPlaca(String placa) throws Exception{
        boolean x = false;
        File doc = new File("placas.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine()){
            String linea = obj.nextLine();
            String SoloPlaca = linea.substring(0,6);
            
            if(SoloPlaca.equals(placa)){
                System.out.println("La Placa Existe");
                System.out.println("la placa : " + placa + " Contiene la siguiente Informacion: ");
               System.out.println(linea.substring(7));
               x = true;
            }       
        }
        if (x==false){
            System.out.println("No Hay taxis registrados con esta placa, No tome el servicio o verifique si ingreso correctamente la placa");
            ModuloEntradas pl = new ModuloEntradas();
            pl.recibirPlaca();
        }
        return x;
        
    }


    public static void presionBotonPanico(){
        ModuloEntradas presion = new ModuloEntradas();
        System.out.println("A continuacion esta un boton de panico el cual puede presionar si algo a lo largo del recorrido le parece sospechoso \n Si desea presionarlo Presione 1");
        System.out.println("\n");
        System.out.println("______________");
        System.out.println("|            |");
        System.out.println("|  presionar |");
        System.out.println("|      1     |");
        System.out.println("|____________|");
        if(presion.PresionBoton() == true){
            System.out.println("\n");
            System.out.println("ingrese el numero de la opcion que desea");

            System.out.println(" (1): El Conductor no es el mismo de la fotografia / El vehiculo no corresponde a el infomado \n (2): El trato por parte del conductor no es bueno  \n (3): Me estoy sintiendo acosad@ \n (4): Estoy / Estoy llegando a un lugar que no corresponde \n ");
            int opcion = presion.presionOpcion();
            switch(opcion){
                case 1: System.out.println("Se informo a la Empresa contratista y se rastreara su ubicacion para su seguridad");
                break;
                case 2: System.out.println("Gracias por su informe, se procedera con el respectivo castigo por parte de la empresa hacia el conductor");
                break;
                case 3: System.out.println("Si es posible baje del taxi. Se tiene su ubicacion, Presione 0 si desea una patrulla, Si no presione 1");
                ModuloEntradas opc = new ModuloEntradas();
                if (opc.presionOpcionDos() == 0){
                    System.out.println("Una patrulla seguira el taxi ante cualquier situacion posible");
                }else{
                    System.out.println("Tenemos su ubicacion, Usted llegara a salvo");
                }
                break;
                case 4: System.out.println("Se tiene su ubicacion, Una patrulla de la policia la seguira para su seguridad");
                break;
                
            }

        }else{
            System.out.println("No presionaste el boton");
        }
        
    }
    public static void calificacion(){
        ModuloEntradas calif = new ModuloEntradas();
        System.out.println("Califique la aplicacion del 1 al 5 siendo 1 muy mala y 5 excelente");
        calif.presionOpcionDos();
        System.out.println("Muchas Gracias, Feliz dia");
    }
}
