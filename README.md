# Esercizio 3x04 Java – Edicola
#### Traccia base
Realizzare un programma Edicola che, utilizzato dal gestore di una rivendita di riviste e
quotidiani, tenga conto giornalmente, per le pubblicazioni che vende:
* delle copie ricevute dal fornitore,
* delle copie vendute ai clienti,
* delle copie rese (ricevute – vendute) da restituire al distributore di zona.
Immettendo nel programma i prezzi di copertina delle singole pubblicazioni, nonché l'aggio
per ogni copia venduta (la quota di ricavato che resta all'edicolante), determinare il
guadagno giornaliero del negoziante dalla somma dei guadagni dalle vendite delle
pubblicazioni precedentemente inserite.
Immettere i dati necessari ricorrendo alla classe Scanner1 e a un ciclo per reiterare il
processo in inserimento di dati, predisponendo un criterio di uscita (per esempio nome
pubblicazione X):
* nomi delle pubblicazioni, a scelta tra quotidiani, riviste, fumetti, …;
* quantità di copie ricevute per ciascuna pubblicazione;
* prezzo di copertina di ciascuna pubblicazione;
* aggio (percentuale del prezzo di copertina trattenuto dall'edicolante per ogni copia
venduta; es.: su un giornale che costa 1,50€, l'aggio del 10% fa guadagnare
all'edicolante 15 centesimi per ogni copia venduta; usare aggi tipici tra il 5 e il 20%);
* quantità di copie vendute a fine giornata per ciascuna pubblicazione.
I dati dovranno essere incapsulati al fine di ostacolare l'immissione di prezzi e numeri di
copie non corretti, che l'edicolante che usa il programma dev'essere invitato a inserire
nuovamente.
L'incapsulamento con controllo di coerenza degli input è condizione necessaria per
considerare svolto l'esercizio.
#### Traccia avanzata
Potenziare il programma con uno switch() dove, oltre alle funzioni di inserimento e riepilogo,
dare la possibilità all'edicolante di effettuare operazioni singole su pubblicazioni già inserite
(modifiche dei singoli campi, rimozione di una pubblicazione terminata): la modifica deve
avvenire nel modo più pratico possibile per l'edicolante.