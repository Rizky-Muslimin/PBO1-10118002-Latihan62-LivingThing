
package pbo1.pkg10118002.latihan62.livingthing;

/**
 *
 * NAMA     : Rizky Muslimin
 * KELAS    : IF-1
 * NIM      : 10118002
 * Deskripsi Program : Program ini untuk membuat tampilan override abstract.
 */
public class PBO110118002Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human human = new Human();
        human.setNama("Tias Gumelar Timorisky");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}
