public class EdicolaTest {
    public static void main(String[] args) {
        Edicola nuovaEdicola = new Edicola();

        nuovaEdicola.immissione_dati_pubblicazioni();
        nuovaEdicola.aggiorna_vendite();
        nuovaEdicola.calcolo_reso();
        nuovaEdicola.calcolo_guadagno_totale();
    }
}
