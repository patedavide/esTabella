import java.io.*;

class Main {
    public static void main(String[] args) {

        Persona[] persone = new Persona[10];
        int nPersone = 0;

        try {

            // APERTURA FILE CSV
            BufferedReader br = new BufferedReader(
                    new FileReader("persona.csv")
            );

            String linea;

            // Salta la prima riga del file (intestazione)
            br.readLine();

            // LEGGE LE PERSONE DAL FILE CSV
            while ((linea = br.readLine()) != null &&
                    nPersone < persone.length) {

                String[] campi = linea.split(",");

                if (campi.length == 4) {

                    Persona p = new Persona(
                            campi[0],
                            campi[1],
                            campi[2],
                            campi[3]
                    );

                    persone[nPersone] = p;
                    nPersone++;
                }
            }

            br.close();


            // VISUALIZZA PERSONE
            System.out.println("----- ELENCO PERSONE -----");

            System.out.println(
                    "Nome, Cognome, Azienda, Vacanza"
            );

            for (int i = 0; i < nPersone; i++) {

                System.out.println(
                        persone[i].getNome() + ", " +
                                persone[i].getCognome() + ", " +
                                persone[i].getAzienda() + ", " +
                                persone[i].getLuogoVacanza()
                );
            }


            // LETTURA DA TASTIERA
            BufferedReader tastiera = new BufferedReader(
                    new InputStreamReader(System.in)
            );




            // CERCA PERSONA
            System.out.print(
                    "\nInserisci nome, cognome, azienda " +
                            "o luogo vacanza da cercare: "
            );

            String ricerca = tastiera.readLine();

            boolean trovato = false;

            // Trasforma la ricerca in minuscolo
            String ricercaMinuscola = ricerca.toLowerCase();

            for (int i = 0; i < nPersone; i++) {

                // Trasforma tutti i campi in minuscolo
                String nome = persone[i].getNome().toLowerCase();
                String cognome = persone[i].getCognome().toLowerCase();
                String azienda = persone[i].getAzienda().toLowerCase();
                String vacanza = persone[i].getLuogoVacanza().toLowerCase();


                // CONTROLLA NOME, COGNOME, AZIENDA E VACANZA
                if (nome.contains(ricercaMinuscola) ||
                        cognome.contains(ricercaMinuscola) ||
                        azienda.contains(ricercaMinuscola) ||
                        vacanza.contains(ricercaMinuscola)) {

                    System.out.println(
                            persone[i].getNome() + ", " +
                                    persone[i].getCognome() + ", " +
                                    persone[i].getAzienda() + ", " +
                                    persone[i].getLuogoVacanza()
                    );

                    trovato = true;
                }
            }


            // SE NON TROVA NESSUNO
            if (!trovato) {

                System.out.println(
                        "Nessuna persona trovata."
                );
            }

        } catch (IOException e) {

            System.out.println(
                    "Errore: " + e
            );
        }
    }
}