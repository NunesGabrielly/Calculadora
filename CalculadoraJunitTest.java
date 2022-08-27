package calculadora;

import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {
	@Test
	public void SomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5,9);
	}
	
	@Test
	public void SubtrairDoisNumerosPositivos() {
		CalculadoraSubtracao sub = new CalculadoraSubtracao();
		int subtrair = sub.subtrair(5,9);
	}
	
	@Test
	public void DividirDoisNumerosPositivos() {
		CalculadoraDivisao div = new CalculadoraDivisao();
		int divivdir = div.dividir(5,5);
	}
	
	@Test
	public void MultiplicarDoisNumerosPositivos() {
		CalculadoraMultiplicacao mult = new CalculadoraMultiplicacao();
		int multiplicar = mult.multiplicar(5,9);
	}
}
