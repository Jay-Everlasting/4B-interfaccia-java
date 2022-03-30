/*

    * Lis Adel - 4Binf

In questa classe viene implementato l'interfaccia Comparable

*/
package primo.esempio.pkginterface;

import java.util.Objects;

public class Contatto implements Comparable{
    private String nome;
    private String cognome;
    private String telefono;
    private String email;

    public Contatto(String nome, String cognome, String telefono, String email) throws Exception {
        valida(nome,cognome,telefono,email);
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.email = email;
    }
    //facciamo: to string, get, equals

    @Override
    public String toString() {
        return "Contatto: " + this.nome + " " + this.cognome + " | Telefono: " + this.telefono + " | Email: " + this.email + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.cognome);
        hash = 83 * hash + Objects.hashCode(this.telefono);
        hash = 83 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contatto other = (Contatto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    //non facciamo il costruttore di copia
    private void valida(String nome, String cognome, String telefono, String email) throws Exception{
        if(nome==null)
            throw new NullPointerException("nome null");
        if(cognome==null)
            throw new NullPointerException("cognome null");
        if(telefono==null)
            throw new NullPointerException("telefono null");
        if(email==null)
            throw new NullPointerException("email null");
        if(telefono.length() != 10){
            throw new IllegalArgumentException("lunghezza numero di telefono errata");
        }
        if(!email.contains("@")){
            throw new IllegalArgumentException("impostazione email errata");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    //@Override
    public int compareTo(Contatto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
