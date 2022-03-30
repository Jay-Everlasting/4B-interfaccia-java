/*
    * Lis Adel - 4Binf
 */
package primo.esempio.pkginterface;

public class PrimoEsempioInterface {

    public static void main(String[] args) throws Exception {
        Integer comp;
        Contatto c,d;
        c = null;
        d = null;
        comp = 0;
        
        c = new Contatto ("Matteo", "Re", "6969696934", "sexy.boy@hotmail.ph");
        d = new Contatto ("Alex", "Bragantini", "1234567890", "tonno.seduto@gmail.com");
        c = new Contatto ("Matteo", "Re", "6969696934", "sexy.boy@hotmail.ph");
        c = new Contatto ("Matteo", "Re", "6969696934", "sexy.boy@hotmail.ph");
        c = new Contatto ("Matteo", "Re", "6969696934", "sexy.boy@hotmail.ph");
        c = new Contatto ("Matteo", "Re", "6969696934", "sexy.boy@hotmail.ph");
               
        comp = c.compareTo(d);
        System.out.println(comp);
        
    }
}