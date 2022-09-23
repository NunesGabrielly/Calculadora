package calculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class CalculadoraJunitTest {
	//Teste unitário de soma usando Junit
	@SuppressWarnings("deprecation")
	@Test
	public void SomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5,9);
		Assert.assertEquals(10, soma);
	}
	//Teste unitário de subtração usando Junit
	@SuppressWarnings("deprecation")
	@Test
	public void SubtrairDoisNumerosPositivos() {
		CalculadoraSubtracao sub = new CalculadoraSubtracao();
		int subtrair = sub.subtrair(5,9);
		Assert.assertEquals(4, subtrair);
	}
	//Teste unitário de divisão usando Junit
	@SuppressWarnings("deprecation")
	@Test
	public void DividirDoisNumerosPositivos() {
		CalculadoraDivisao div = new CalculadoraDivisao();
		int dividir = div.dividir(5,5);
		Assert.assertEquals(6, dividir);
	}
	//Teste unitário de multiplicação usando Junit
	@SuppressWarnings("deprecation")
	@Test
	public void MultiplicarDoisNumerosPositivos() {
		CalculadoraMultiplicacao mult = new CalculadoraMultiplicacao();
		int multiplicar = mult.multiplicar(6,8);
		Assert.assertEquals(11, multiplicar);
	}
}
