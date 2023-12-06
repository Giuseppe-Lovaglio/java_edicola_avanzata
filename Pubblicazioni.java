import java.util.Scanner;

public class Pubblicazioni {
    private String titolo;
    private int copie_ricevute;
    private int copie_vendute;
    private double prezzo_di_copertina;
    private double aggio;
    private double guadagno;

    Scanner input_testo = new Scanner(System.in);
    Scanner input_numero = new Scanner(System.in);

    // getters

    public String getTitolo() {
        return titolo;
    }
    public int getCopie_ricevute() {
        return copie_ricevute;
    }
    public int getCopie_vendute() {
        return copie_vendute;
    }
    public double getPrezzo_di_copertina() {
        return prezzo_di_copertina;
    }
    public double getAggio() {
        return aggio;
    }

    public double getGuadagno() {
        return guadagno;
    }

    // setters

    public void setTitolo(String titolo) {
        while(true) {
            if(titolo.length() <= 4) {
                System.out.print("Inserisci un titolo valido o exit per terminare: ");
                titolo = input_testo.nextLine();
            }

            else {
                this.titolo = titolo;
                System.out.println("Titolo aggiornato a " + titolo);
                break;
            }
        }
    }

    public void setCopie_ricevute(int copie_ricevute) {
        while(true) {
            if(copie_ricevute <= 0) {
                System.out.print("Inserisci un numero di copie maggiore di 0: ");
                copie_ricevute = input_numero.nextInt();
            }

            else {
                this.copie_ricevute = copie_ricevute;
                System.out.println("Numero di copie ricevute aggiornato a " + copie_ricevute + " copie ricevute!");
                break;
            }
        }
    }

    public void setCopie_vendute(int copie_vendute) {
        while(true) {
            if (copie_vendute > getCopie_ricevute() || copie_vendute < 0) {
                System.out.print("Puoi inserire un valore tra 0 e " + getCopie_ricevute() + ", riprova: ");
                copie_vendute = input_numero.nextInt();
            }

            else {
                this.copie_vendute = copie_vendute;
                break;
            }
        }
    }

    public void setPrezzo_di_copertina(double prezzo_di_copertina) {
        while(true) {
            if(prezzo_di_copertina <= 0) {
                System.out.print("Inserisci un prezzo di copertina valido: ");
                prezzo_di_copertina = input_numero.nextDouble();
            }

            else {
                this.prezzo_di_copertina = prezzo_di_copertina;
                System.out.println("Il prezzo di copertina e' stato aggiornato a " + prezzo_di_copertina + " euro!");
                break;
            }
        }
    }

    public void setAggio(double aggio) {
        while(true) {
            if((aggio < 5 || aggio > 20)) {
                System.out.print("Inserisci un valore dell'aggio tra il 5% e il 20%: ");
                aggio = input_numero.nextDouble();
            }

            else {
                this.aggio = aggio;
                System.out.println("L'aggio è stato aggiornato al " + aggio + " %");
                break;
            }
        }
    }

    public void setGuadagno(double guadagno) {
        if (guadagno < 0) {
            System.out.println("Il valore di guadagno è risultato negativo!");
        }

        else {
            this.guadagno = guadagno;
        }
    }

    public void aggiornaGuadagno() {
        double guadagno = (getPrezzo_di_copertina() * getAggio() / 100) * getCopie_vendute();
        setGuadagno(guadagno);
    }
}
