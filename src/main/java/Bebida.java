
/**
 *
 * @author Juan Carlos
 */
public class Bebida {
    
    private static int AutoId=1;
    
    private int Id;
    private double Litros;
    private double Precio;
    private String Marca;

    public Bebida(double Litros, double Precio, String Marca) {
        this.Id = AutoId++;
        this.Litros = Litros;
        this.Precio = Precio;
        this.Marca = Marca;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getLitros() {
        return Litros;
    }

    public void setLitros(double Litros) {
        this.Litros = Litros;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " Litros: " + Litros + " Precio: " + Precio + " Marca: " + Marca;
    }
    
    
    
}
