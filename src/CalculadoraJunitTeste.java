import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraJunitTeste {

    @Test
    public void CalculadoraTest() {

        Calculadora calc = new Calculadora();


        //Cenário de Teste de Soma 1: A soma correta é 10, porém no teste ele está esperando 12, irá falhar o teste.
        int somar = calc.soma(3, 7);
        System.out.println("Soma: \n" + somar);
        assertEquals(12, somar);

        //Cenário de Teste de Soma 2: A soma correta é 7 e no teste ele está esperando 7, o teste vai ser executado com sucesso.
        somar = calc.soma(2, 5);
        System.out.println("Soma: \n" + somar);
        assertEquals(7, somar);

        //Cenário de Teste de Subtração 1: A subtração correta é 10, no teste ele está esperando 10, o teste vai ser executado com sucesso.
        int subtracao = calc.subtracao(15, 5);
        System.out.println("Subtração: \n" + subtracao);
        assertEquals(10, subtracao);

        //Cenário de Teste de Subtração 2: A subtração correta é 0, porém no teste ele está esperando 2, irá falhar o teste.
        subtracao = calc.subtracao(15, 15);
        System.out.println(subtracao);
        assertEquals(2, subtracao);

        //Cenário de Teste de Multiplicação 1: A multiplicação correta é 81, no teste ele está esperando 81, o teste vai ser executado com sucesso.
        int multiplicacao = calc.multiplicacao(9, 9);
        System.out.println("Multiplicação: \n" + multiplicacao);
        assertEquals(81, multiplicacao);

        //Cenário de Teste de Multiplicação 2: A multiplicação correta é 25, porém no teste ele está esperando 30, irá falhar o teste.
        multiplicacao = calc.multiplicacao(5, 5);
        assertEquals(30, multiplicacao);

        //Cenário de Teste de Divisão 1: A divisão correta é 8, porém no teste ele está esperando 10, irá falhar o teste.
        int divisao = calc.divisao(80, 10);
        System.out.println("Divisão: \n" + divisao);
        assertEquals(10, divisao);

        //Cenário de Teste de Divisão 2: A multiplicação correta é 5, no teste ele está esperando 5, o teste vai ser executado com sucesso.
        divisao = calc.divisao(25, 5);
        System.out.println(divisao);
        assertEquals(5, divisao);


    }

}
