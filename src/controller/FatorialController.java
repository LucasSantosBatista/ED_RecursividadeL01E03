package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int calculaFatorial(int fat) {
		//Condição de parada: se a contagem for zero, retorna 1 para multiplicação e desempilha
		if (fat == 0) {
			return 1;
		} else {
			//Recursiva chamando total multiplicando contagem - 1
			return fat * calculaFatorial(fat-1);
		}
		
	}
}
