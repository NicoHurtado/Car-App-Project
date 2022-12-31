
public class Main
{
    public static void main (String [ ] args) throws Exception {
        
        ModuloSalidas salidas = new ModuloSalidas();
        salidas.SalidaDeVerificacionEntradas();
        System.out.println("------------------------");
        salidas.SalidaBotonPanico();
        System.out.println("-------------------------");
        System.out.println("¿LLego usted a su destino a salvo? si o no ");
        ModuloEntradas.presionFinal();
        salidas.SalicaCalificacion();
        //aqui se va a mostrar la informacion tanto del vehiculo como del taxista//

        
}
}
