/*
Classe Contatto - Contiene informazioni sui contatti (nome, cognome, telefono, email)
 */
package primo.esempio.pkginterface;

public class Contatto {
    private String nome;
    private String congome;
    private String telefono;
    private String email;

    public Contatto(String nome, String congome, String telefono, String email) throws Exception{
       
        valida(nome, congome, telefono, email);
        
        this.nome = nome;
        this.congome = congome;
        this.telefono = telefono;
        this.email = email;
    }

    private void valida(String nome, String congome, String telefono, String email) throws Exception{
        if (nome == null){
            throw new NullPointerException("nome null");
        }
        if (congome == null){
            throw new NullPointerException("congome null");
        }
        if (telefono == null){
            throw new NullPointerException("telefono null");
        }
        if (email == null){
            throw new NullPointerException("email null");
        }
        //manca altri controlli. (che ci sia solo una @ nella mail) (numero di telefono sia 11) 
        
    }
    
    //fare get(), equals()
    //non fare costruttore di copia
    //fare toString()
}
