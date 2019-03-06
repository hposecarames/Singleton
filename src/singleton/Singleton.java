
package singleton;

/**
 *
 * @author Hector Pose Carames
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewSingleton obx1 = NewSingleton.Instanciar();
        NewSingleton obx2 = NewSingleton.Instanciar();
        obx1.setNombre("Paquito");
        obx1.setApellido("elChocolatero");
        obx1.setDni("6666W");
        obx1.mostrar();
        obx2.setNombre("Paco");
        obx2.setApellido("Martinez Soria");
        obx2.setDni("1111Z");
        obx2.mostrar();
    }
    
}
