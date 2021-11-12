/**
 *
 * @author Juan Carlos
 */
import java.io.PrintWriter;

public class Almacen {
    
    private Bebida[][] estante;
    
    public Almacen (int fil, int col){
        estante = new Bebida[fil][col];
    }
 
    public Almacen() {
        estante = new Bebida[3][3];
    }
       
     public void agregarProducto(Bebida a) {
 
        boolean posicion = false;
        for (int i = 0; i < estante.length && !posicion; i++) {
            for (int j = 0; j < estante[0].length && !posicion; j++) {
                if (estante[i][j] == null) {
                    estante[i][j] = a;
                    posicion = true;
                }
            }
        }
 
        if (posicion) {
            System.out.println("Bebida agregada de forma Exitosa");
        } else {
            System.out.println("No se ha podido agregar la bebida");
        }
 
    }
     
    public double precioBebidas() {
 
        double Total = 0;
        for (int i = 0; i < estante.length; i++) {
            for (int j = 0; j < estante[0].length; j++) {
                if (estante[i][j] != null) {
                    Total += estante[i][j].getPrecio();
                }
            }
        }
 
        return Total;
 
    }
    
    public double precioMarca(String marca) {
 
        double Total = 0;
        for (int i = 0; i < estante.length; i++) {
            for (int j = 0; j < estante[0].length; j++) {
                if (estante[i][j] != null) { 
                    if (estante[i][j].getMarca().equalsIgnoreCase(marca)) {
                        Total += estante[i][j].getPrecio(); 
                    }
 
                }
            }
 
        }
 
        return Total;
    }
    
    public double precioEstanteria(int columna) {
 
        double precioTotal = 0;
        if (columna >= 0 && columna < estante[0].length) {
 
            for (int i = 0; i < estante.length; i++) {
 
                if (estante[i][columna] != null) { 
                    precioTotal += estante[i][columna].getPrecio(); 
                }
 
            }
 
        } else {
            System.out.println("La columna debe estar entre 0 y " + estante[0].length);
        }
 
        return precioTotal;
 
    }
    
    public void eliminarProducto(int id) {
 
        boolean buscar = false;
        for (int i = 0; i < estante.length && !buscar; i++) {
            for (int j = 0; j < estante[0].length && !buscar; j++) {
                if (estante[i][j] != null) {
                    if (estante[i][j].getId() == id) {
                        estante[i][j] = null; 
                        buscar = true; 
                    }
                }
            }
        }
 
        if (buscar) {
            System.out.println("Bebida eliminada");
        } else {
            System.out.println("No existe la bebida");
        }
 
    }
    
        public void mostrarInformacion() {
 
        System.out.println("***Inventario de Bebidas***"); 
        for (int i = 0; i < estante.length; i++) {
            for (int j = 0; j < estante[0].length; j++) {
                if (estante[i][j] != null) {
                    System.out.println(" Bebida: " + estante[i][j].toString());
                }
            }
        }
        try {
            PrintWriter writer = new PrintWriter("C:/Users/Juan Carlos/Documents/Test/filename.txt", "UTF-8");
            writer.println("***Inventario de Bebidas***"); 
            for (int i = 0; i < estante.length; i++){
                for (int j = 0; j < estante[0].length; j++){
                    if (estante[i][j] != null){
                        writer.println(" Bebida: " + estante[i][j].toString()+"\n");
                    }
                }
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
}

