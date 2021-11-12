
/**
 *
 * @author Juan Carlos
 */
public class BebidaAzucarada extends Bebida{
    private double porcentaje;
    private boolean promocion;

    public BebidaAzucarada(double porcentaje, boolean promocion, double Litros, double Precio, String Marca) {
        super(Litros, Precio, Marca);
        this.porcentaje = porcentaje;
        this.promocion = promocion;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public double getPrecio() {
        if (isPromocion()){
            return super.getPrecio()*0.9;
        }
        else{
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " porcentaje: " + porcentaje+" %" + " promocion: " + promocion;
    }   
    
}
