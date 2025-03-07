package ejercicio_4;

public class EdadInvalidaException extends Exception{
    public static final long serialVersionUID = 700L;

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}
