package calculadora;

public class CalculadoraTestes {
		
	public static void main(String[] args) {
		//Neste cenario esta sendo instanciado valores inteiros para realizar a soma.
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3,-7);
		System.out.println(soma);
		
		//Neste cenario esta sendo instanciado valores inteiros para realizar a subtrair.
		CalculadoraSubtracao sub = new CalculadoraSubtracao();
		int subtrair = sub.subtrair(4,-2);
		System.out.println(subtrair);
		
		//Neste cenario esta sendo instanciado valores inteiros para realizar a divisão.
		//Quando o divisor for maior que o dividendo o resultado gerado é uma fração, não sendo o resultado esperado 
		//para este cenário. A sugestão é que ao inves de int os valores passem a ser float/double.
		CalculadoraDivisao div = new CalculadoraDivisao();
		int dividir = div.dividir(3,-3);
		System.out.println(dividir);
		
		//Neste cenario esta sendo instanciado valores inteiros para realizar a multiplicação.
		CalculadoraMultiplicacao mult = new CalculadoraMultiplicacao();
		int multiplicar = mult.multiplicar(-8,7);
		System.out.println(multiplicar);
	}
}
