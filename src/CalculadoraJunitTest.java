//Faz a importação do framework Junit.
import org.junit.Test;

//Faz a importação do Assert do framework Junit.
import static org.junit.Assert.assertEquals;

/**
 *
 * @author nathan
 * @version 1.0
 * @since 1.1
 *
  */

public class CalculadoraJunitTest {

    //O @Text está puxando o framework JUNIT.
    @Test
    public void CalculadoraTest() {

        //Puxa os metodos da classe Calculadora para o main.
        Calculadora calc = new Calculadora();

        /**
         * calc.soma, recebe a e b e faz a soma dos números.
         * calc.subtracao, recebe a e b e faz a subtração dos números.
         * calc.multiplicacao, recebe a e b e faz a multiplicação dos números.
         * calc.divisão, recebe a e b e faz a divisão dos números.
         */

        //Cenário de Teste de Soma 1: A soma correta é 10, porém no teste ele está esperando 12, irá falhar o teste.
        int somar = calc.soma(3, 7);
        //Parâmetros a serem utilizados para o teste de soma.
        System.out.println("Soma: \n" + somar);
        //Modelo de comparativo do teste.
        assertEquals(12, somar);

        //Cenário de Teste de Soma 2: A soma correta é 7 e no teste ele está esperando 7, o teste vai ser executado com sucesso.
        somar = calc.soma(2, 5);
        //Parâmetros a serem utilizados para o teste de soma.
        System.out.println("Soma: \n" + somar);
        //Modelo de comparativo do teste.
        assertEquals(7, somar);

        //Cenário de Teste de Subtração 1: A subtração correta é 10, no teste ele está esperando 10, o teste vai ser executado com sucesso.
        int subtracao = calc.subtracao(15, 5);
        //Parâmetros a serem utilizados para o teste de subtração.
        System.out.println("Subtração: \n" + subtracao);
        //Modelo de comparativo do teste.
        assertEquals(10, subtracao);

        //Cenário de Teste de Subtração 2: A subtração correta é 0, porém no teste ele está esperando 2, irá falhar o teste.
        subtracao = calc.subtracao(15, 15);
        //Parâmetros a serem utilizados para o teste de subtração.
        System.out.println(subtracao);
        //Modelo de comparativo do teste.
        assertEquals(2, subtracao);

        //Cenário de Teste de Multiplicação 1: A multiplicação correta é 81, no teste ele está esperando 81, o teste vai ser executado com sucesso.
        int multiplicacao = calc.multiplicacao(9, 9);
        //Parâmetros a serem utilizados para o teste de multiplicação.
        System.out.println("Multiplicação: \n" + multiplicacao);
        //Modelo de comparativo do teste.
        assertEquals(81, multiplicacao);

        //Cenário de Teste de Multiplicação 2: A multiplicação correta é 25, porém no teste ele está esperando 30, irá falhar o teste.
        multiplicacao = calc.multiplicacao(5, 5);
        //Parâmetros a serem utilizados para o teste de multiplicação.
        System.out.println(multiplicacao);
        //Modelo de comparativo do teste.
        assertEquals(30, multiplicacao);

        //Cenário de Teste de Divisão 1: A divisão correta é 8, porém no teste ele está esperando 10, irá falhar o teste.
        int divisao = calc.divisao(80, 10);
        //Parâmetros a serem utilizados para o teste de divisão.
        System.out.println("Divisão: \n" + divisao);
        //Modelo de comparativo do teste.
        assertEquals(10, divisao);

        //Cenário de Teste de Divisão 2: A multiplicação correta é 5, no teste ele está esperando 5, o teste vai ser executado com sucesso.
        divisao = calc.divisao(25, 5);
        //Parâmetros a serem utilizados para o teste de divisão.
        System.out.println(divisao);
        //Modelo de comparativo do teste.
        assertEquals(5, divisao);


    }

}
