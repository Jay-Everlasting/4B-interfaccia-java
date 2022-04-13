/*
    * Lis Adel - 4Binf
 */
package primo.esempio.pkginterface;

import java.util.ArrayList;

public class Rubrica implements AstrazioneDiRubrica{
    private ArrayList<Contatto> contatti;
    //fare costruttore, toString, get
    Rubrica(){
        this.contatti=new ArrayList();
    }
    public void aggiungi(Contatto c){
        contatti.add(c);
    }
    public Contatto cerca(String s){
        Contatto c;
        int i;
        c=null;
        for(i=0;i<contatti.size();i++){
            c=contatti.get(i);
            if(c.getCognome().equals(s)){
                return c;
            }
        }   
        return null;
    }

    @Override
    public String toString() {
        return "" + contatti;
    }
    
    public void posizione(Contatto c){
        Contatto new_contact, list_contact;
        int comp, pos;
        
        new_contact = c;
        list_contact = null;
        comp = 0;
        pos = 0;
        
        if(!contatti.isEmpty()){
            for(int i = 0; i < contatti.size(); i++){
                list_contact = contatti.get(i);
                comp = c.compareTo(list_contact);
                if (comp <= 0){
                    pos = contatti.indexOf(list_contact);
                    contatti.add(pos, new_contact);
                    i = contatti.size() + 1;
                }
            }
        }
        
    }
    
}
