
public class GestioneDipendenti {
	public static void main(String[] args) {

		Dipendente Luca = new Dipendente(1, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente Manuel = new Dipendente(2, 30, Livello.OPERAIO, Dipartimento.PRODUZIONE);
		Dipendente Beppe = new Dipendente(3, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente Ema = new Dipendente(4, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

		Luca.promuovi();
		Beppe.promuovi();

		Luca.stampaDatiDipendente();
		System.out.println("----------------------------------");

		Manuel.stampaDatiDipendente();
		System.out.println("----------------------------------");

		Beppe.stampaDatiDipendente();
		System.out.println("----------------------------------");

		Ema.stampaDatiDipendente();

		double stipendiTotale = Dipendente.calcolaPaga(Luca, 5) + Dipendente.calcolaPaga(Manuel, 5)
				+ Dipendente.calcolaPaga(Ema, 5) + Dipendente.calcolaPaga(Beppe, 5);

		System.out.println("Importo totale degli stipendi: " + stipendiTotale);
	}
}
