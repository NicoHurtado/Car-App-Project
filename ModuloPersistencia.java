import java.io.*;

import javax.swing.JOptionPane;

public class ModuloPersistencia
{
    
    public static void guardarNombre(String nombre) throws IOException{
        File G;
        FileWriter N;
        BufferedWriter Bw;
        PrintWriter Wr;

        try{
        G = new File("ArchivoNombres.txt");
        N = new FileWriter(G);
        Bw = new BufferedWriter(N);
        Wr = new PrintWriter(Bw);

        Wr.write(nombre);
        Wr.close();
        Bw.close();


        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e);
        }

    }
    
}
