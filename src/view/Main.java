package view;
import controller.FatorialController;

public class Main {

	public static void main(String[] args) {
		int fat = 12;
		
		FatorialController fCont = new FatorialController();
		
		int resultado = fCont.calculaFatorial(fat);
		System.out.println("Numero: " + fat + " | Fatorial: " + resultado);

	}

}
