
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraJunitTeste {

    @Test
    public void CalculadoraTest() {

        Calculadora calc = new Calculadora();


        //Cenário de Teste de Soma 1: A soma correta é 10, porém no teste ele está esperando 12, o teste vai dar erro.
        int somar = calc.soma(3, 7);
        System.out.println("Soma: \n" + somar);
        assertEquals (10, somar);

        //Cenário de Teste de Soma 2: A soma correta é 7 e no teste ele está esperando 7, o teste vai passado com sucesso.
        somar = calc.soma(2, 5);
        System.out.println("Soma: \n" + somar);
        assertEquals (7, somar);

        //Cenário de Teste de Subtração 1: Subtração de dois números.
        int subtracao = calc.subtracao(15, 5);
        System.out.println("Subtração: \n" + subtracao);

        //Cenário de Teste de Subtração 2: Subtração de dois números, sendo um número negativo.
        subtracao = calc.subtracao(-15, 15);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 3: Subtração de dois números, sendo dois números negativos.
        subtracao = calc.subtracao(-2, -3);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 4: Subtração de dois números, sendo ambos zerp.
        subtracao = calc.subtracao(0, 0);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 5: Subtração de dois números.
        subtracao = calc.subtracao(54, 2);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 6: Subtração de dois números.
        subtracao = calc.subtracao(410, 3);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 7: Subtração de dois números.
        subtracao = calc.subtracao(2, 580);
        System.out.println(subtracao);

        //Cenário de Teste de Multiplicação 1: Multiplicação de dois números.
        int multiplicacao = calc.multiplicacao(5, 5);
        System.out.println("Multiplicação: \n" + multiplicacao);

        //Cenário de Teste de Multiplicação 2: Multiplicação de dois números.
        multiplicacao = calc.multiplicacao(3, 2);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 3: Multiplicação de dois números.
        multiplicacao = calc.multiplicacao(8, 3);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 4: Multiplicação de dois números, sendo um 0.
        multiplicacao = calc.multiplicacao(9, 0);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 5: Multiplicação de dois números, sendo um negativo.
        multiplicacao = calc.multiplicacao(7, -6);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 6: Multiplicação de dois números, sendo dois negativos.
        multiplicacao = calc.multiplicacao(-10, -6);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 7: Multiplicação de dois números.
        multiplicacao = calc.multiplicacao(7, 12);
        System.out.println(multiplicacao);

        //Cenário de Teste de Divisão 1: Divisão de dois números.
        int divisao = calc.divisao(10, 2);
        System.out.println("Divisão: \n" + divisao);

        //Cenário de Teste de Divisão 2: Divisão de dois números.
        divisao = calc.divisao(20, 3);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 3: Divisão de dois números, sendo um negativo.
        divisao = calc.divisao(2, -2);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 4: Divisão de dois números, sendo dois negativos.
        divisao = calc.divisao(-5, -5);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 5: Divisão de dois números.
        divisao = calc.divisao(50, 20);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 6: Divisão de dois números.
        divisao = calc.divisao(70, 7);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 7: Divisão de dois números.
        divisao = calc.divisao(20, 9);
        System.out.println(divisao);

    }

}
