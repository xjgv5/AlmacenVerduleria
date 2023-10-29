import com.xjgv.almacenApp.*;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        productos[0] = new Lacteo("Leche Lala", 32.0, 2, 54);
        productos[1] = new Lacteo("Nutri Leche", 22.0, 2, 20);
        productos[2] = new Fruta("Kiwi", 45.0, 2.5, "Cafe");
        productos[3] = new Fruta("Manzana", 23.5, 3.5, "Verde");
        productos[4] = new Limpieza("Maestro Limpio", 30.0, "Etanol, Colorante artificial", 10.0);
        productos[5] = new Limpieza("Cloro", 12D, "Mucho cloro", 5.5);
        productos[6] = new NoPerecible("Agua", 8D, 1, 0);
        productos[7] = new NoPerecible("Arroz", 12D, 4, 20);
        
        for (Producto p: productos){
            System.out.println(p);
            System.out.println("************");
            System.out.println();
        }
    }
}