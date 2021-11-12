
/**
 *
 * @author Juan Carlos
 */
public class Aguamineral extends Bebida {
    
    private String Tipo;

    public Aguamineral(String Tipo, double Litros, double Precio, String Marca) {
        super(Litros, Precio, Marca);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: " + Tipo;
    }   
    
}
