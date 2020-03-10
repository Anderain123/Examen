
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
   /**
    * Devuelve la posición (latitud y altitud) dada una direccion.
    * 
    * @param String calle La direccion de la que queremos saber la posición.
    * @return La posición en (latitud y altitud) de la calle.
    */
   public abstract float obtenerPosicion(String calle);
}
