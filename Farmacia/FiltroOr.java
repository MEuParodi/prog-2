package Farmacia;

public class FiltroOr extends Filtro {
	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.filtro1 = f1;
		this.filtro2 = f2;
	}
	
	@Override
	public boolean cumple(Medicamento medicamento) {
		return this.filtro1.cumple(medicamento) || this.filtro2.cumple(medicamento);
	}

}
