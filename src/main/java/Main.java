
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Main {         
   
    
    public static void main(String[] args) {
        Almacen a = new Almacen(); 
        Bebida b;
    
        Scanner sc = new Scanner (System.in);
        boolean salir=false;
          
        while(!salir) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Calcular Precio de todas las Bebidas");
            System.out.println("3. Calcular Precio de una marca de Bebidas");
            System.out.println("4. Calcular Precio de una Estantería");
            System.out.println("5. Eliminar Producto");
            System.out.println("6. Mostrar Información");
            System.out.println("7. Salir");
            
            try {
                int opcion = sc.nextInt();
                
                switch(opcion){
                    case 1:
             
                        System.out.println("Ingrese una opción:");
                        System.out.println("1. Agregar Bebida Azucarada");
                        System.out.println("2. Agregar Agua Mineral");
                        
                        int eleccion = sc.nextInt();
                        
                        if (eleccion==1){
                            
                            System.out.println("¿porcentaje de azúcar? : ");
                            double porcentaje =sc.nextDouble();
                            System.out.println("¿Cuenta con promoción? TRUE o FALSE : ");
                            boolean promo = sc.nextBoolean();
                            System.out.println("¿Cantidad de litros? : ");
                            double Litros =sc.nextDouble();
                            System.out.println("¿Precio? : ");
                            double Precio =sc.nextDouble();
                            System.out.println("¿Marca? : ");
                            String Marca = sc.next();
                            
                            b=new BebidaAzucarada(porcentaje,promo,Litros,Precio,Marca);
                            
                            a.agregarProducto(b); 
                        }
                        else if (eleccion==2){
                            
                            System.out.println("¿Tipo de Agua? : ");
                            String tipo = sc.next();
                            System.out.println("¿Cantidad de litros? : ");
                            double litros =sc.nextDouble();
                            System.out.println("¿Precio? : ");
                            double precio =sc.nextDouble();
                            System.out.println("¿Marca? : ");
                            String marca = sc.next();
                            
                            b=new Aguamineral(tipo,litros,precio,marca);
                            
                            a.agregarProducto(b); 
                        
                        }
                        
                        else {
                            System.out.println("Debe insertar un número entre 1 y 2 ");
                            sc.next();
                        }
                                                                
                        break;
                    case 2:
                        System.out.println("Precio de todas las bebidas: "+ a.precioBebidas());
                        break;
                    case 3:
                        System.out.println("Indique la Marca de la cual desea calcular el precio : ");
                        String marca = sc.next();
                        System.out.println("Precio de todas las bebidas de la marca: "+marca+" es " + a.precioMarca(marca));
                        break;
                    case 4:
                        System.out.println("Indique el estante del cual desea calcular el precio : ");
                        int estan = sc.nextInt();
                        System.out.println("Precio de todas las columnas: "+estan+" es " + a.precioEstanteria(estan));
                        break;
                    case 5:
                        System.out.println("Indique el ID del producto a eliminar : ");
                        int ide = sc.nextInt();
                        a.eliminarProducto(ide);
                        break;
                    case 6:
                        a.mostrarInformacion();
                        break;
                    case 7:
                        salir=true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
          } catch (InputMismatchException e) {
                System.out.println("Debe insertar un número");
                sc.next();                          
                 }
            
            }
        }
    
}
