public class Persona{
    String nome;
    String cognome;
    String azienda;
    luogoVacanza;

    public Persona(String nome, String cognome, String azienda, String luogoVacanza){
        this.Nome = nome;
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

    public int getCognome() {
        return cognome;
    }

    public int getAzienda() {
        return azienda;
    }

    public int getLuogoVacanza() {
        return luogoVacanza;
    }

}