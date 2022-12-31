
public class ModuloSalidas
{       
    ModuloEntradas mostrar = new ModuloEntradas();
    
    public void SalidaDeVerificacionEntradas() throws Exception{

        mostrar.recibirCredeciales();
        mostrar.recibirPlaca();
    
    }

    public void SalidaBotonPanico(){
        ModuloProcesamiento.presionBotonPanico();
    }
    public void SalicaCalificacion(){
        ModuloProcesamiento.calificacion();
    }

}
