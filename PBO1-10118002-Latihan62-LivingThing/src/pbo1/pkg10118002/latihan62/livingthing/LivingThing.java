
package pbo1.pkg10118002.latihan62.livingthing;

/**
 * NAMA     : Rizky Muslimin
 * KELAS    : IF-1
 * NIM      : 10118002
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
}
