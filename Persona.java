public class Persona{
    String nome;
    String cognome;
    String azienda;
    String luogoVacanza;

    public Persona(String nome, String cognome, String azienda, String luogoVacanza){
        this.nome = nome;
        this.cognome = cognome;
        this.azienda = azienda;
        this.luogoVacanza = luogoVacanza;
    }

    public String toCSV() {
        return nome + "," + cognome + "," + azienda + "," + luogoVacanza;
    } 

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getAzienda() {
        return azienda;
    }

    public String getLuogoVacanza() {
        return luogoVacanza;
    }

}