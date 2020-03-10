
public interface doc
{
   
   /**
    * Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
    * 
    * @param int x El numero de la fila
    * @param String file El fichero de texto con la ruta absoluta
    * @return El contenido del fichero file en la fila x
    */ 
   public abstract String obtenerLinea(int x, String file);
   
   
}
