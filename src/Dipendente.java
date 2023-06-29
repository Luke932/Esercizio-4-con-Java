
public class Dipendente {
	public static double stipendioBase = 1000;

	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

	public Dipendente(int matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.dipartimento = dipartimento;
	}

	public Dipendente(int matricola, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;

		switch (livello) {
		case OPERAIO:
			this.stipendio = stipendioBase;
			break;
		case IMPIEGATO:
			this.stipendio = stipendioBase * 1.2;
			break;
		case QUADRO:
			this.stipendio = stipendioBase * 1.5;
			break;
		case DIRIGENTE:
			this.stipendio = stipendioBase * 2;
			break;
		}
	}

	public void stampaDatiDipendente() {
		System.out.println("Matricola: " + matricola);
		System.out.println("Stipendio: " + stipendio);
		System.out.println("Importo orario straordinario: " + importoOrarioStraordinario);
		System.out.println("Livello: " + livello);
		System.out.println("Dipartimento: " + dipartimento);
	}

	public Livello promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			this.importoOrarioStraordinario = importoOrarioStraordinario * 1.2;
			break;
		case IMPIEGATO:
			livello = Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
			this.importoOrarioStraordinario = importoOrarioStraordinario * 1.5;
			break;
		case QUADRO:
			livello = Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
			this.importoOrarioStraordinario = importoOrarioStraordinario * 2;
			break;
		case DIRIGENTE:
			System.out.println("Impossibile promuovere un dirigente");

		}
		return livello;
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.stipendio;
	}

	public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
		double pagaStr = dipendente.importoOrarioStraordinario * oreStraordinario;
		return dipendente.stipendio + pagaStr;
	}

	public void setImportoOrarioStraordinario(double nuovoImporto) {
		this.importoOrarioStraordinario = nuovoImporto;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public Livello getLivello() {
		return livello;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}
}
