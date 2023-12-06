import java.util.ArrayList;
import java.util.Scanner;

public class Edicola {
    private ArrayList<Pubblicazioni> istanzePubblicazioni = new ArrayList<Pubblicazioni>();

    Scanner input_testo = new Scanner(System.in);
    Scanner input_numero = new Scanner(System.in);

    public void immissione_dati_pubblicazioni() {
        System.out.println();
        System.out.println("--- Inserimento dati ---");

        while(true) {
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Premi ENTER per inserire il titolo della pubblicazione o exit per terminare ");
            String comando = input_testo.nextLine();

            if (!comando.equals("exit")) {
                Pubblicazioni istanza_pubblicazioni = new Pubblicazioni();
                System.out.println();
                System.out.print("Inserisci il titolo della pubblicazione: ");
                istanza_pubblicazioni.setTitolo(input_testo.nextLine());
                System.out.println();
                System.out.println("Inserisci il numero di copie ricevuto: ");
                istanza_pubblicazioni.setCopie_ricevute(input_numero.nextInt());
                System.out.println();
                System.out.print("Inserisci il prezzo di copertina: ");
                istanza_pubblicazioni.setPrezzo_di_copertina(input_numero.nextInt());
                System.out.println();
                System.out.print("Inserisci l'aggio in percentuale per questo prodotto: ");
                istanza_pubblicazioni.setAggio(input_numero.nextInt());
                istanzePubblicazioni.add(istanza_pubblicazioni);
            }

            else {
                break;
            }
        }
    }

    public void aggiorna_vendite() {
        System.out.println();
        System.out.print("Di che pubblicazione vorresti aggiornare le vendite? ");
        String input = input_testo.nextLine();

        ciclo: while(true) {
            if(!input.equals("exit")) {
                for(Pubblicazioni istanza : istanzePubblicazioni) {
                    String titolo = istanza.getTitolo();

                    if(titolo.equals(input)) {
                        System.out.println("*** Pubblicazione trovata! ***");
                        System.out.println();
                        System.out.print("Inserisci il numero di copie vendute, 0 per terminare: ");
                        istanza.setCopie_vendute(input_numero.nextInt());
                        istanza.aggiornaGuadagno();
                        break ciclo;
                    }
                }

                System.out.println("Il titolo inserito non e' corretto, riprova o scrivi exit per terminare: ");
                input = input_testo.nextLine();
            }

            else {
                break;
            }
        }
    }

    public void calcolo_reso() {
        System.out.println();
        System.out.println(" --- Procedo al calcolo del reso --- ");
        for(Pubblicazioni istanza : istanzePubblicazioni) {
            System.out.println("- " + istanza.getTitolo() + "  Copie da rendere -> " + (istanza.getCopie_ricevute() - istanza.getCopie_vendute()));
        }
    }

    public void calcolo_guadagno_totale() {
        System.out.println();
        System.out.println(" --- Calcolo il guadagno totale --- ");
        double totale = 0.0;
        for(Pubblicazioni istanza : istanzePubblicazioni) {
            totale += istanza.getGuadagno();
        }
        totale = (Math.round(totale*100))/100;
        System.out.println("Il totale guadagnato e' " + totale + " euro.");
    }
}