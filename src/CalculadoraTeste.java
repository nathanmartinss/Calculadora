public class CalculadoraTeste {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //Cenário de Teste de Soma 1: Soma de dois números.
        int somar = calculadora.soma(3, 7);
        System.out.println("Soma: \n" + somar);

        //Cenário de Teste de Soma 2: Soma de dois números.
        somar = calculadora.soma(8, 2);
        System.out.println(somar);

        //Cenário de Teste de Soma 3: Soma de dois números, sendo um negativo.
        somar = calculadora.soma(1, -2);
        System.out.println(somar);

        //Cenário de Teste de Soma 4: Soma de dois números, sendo um 0 e outro negativo.
        somar = calculadora.soma(0, -6);
        System.out.println(somar);

        //Cenário de Teste de Soma 5: Soma de dois números, sendo ambos 0.
        somar = calculadora.soma(0, 0);
        System.out.println(somar);

        //Cenário de Teste de Soma 6: Soma de dois números, sendo ambos negativos.
        somar = calculadora.soma(-2, -5);
        System.out.println(somar);

        //Cenário de Teste de Soma 7: Soma de dois números.
        somar = calculadora.soma(10, 12);
        System.out.println(somar);

        //Cenário de Teste de Subtração 1: Subtração de dois números.
        int subtracao = calculadora.subtracao(15, 5);
        System.out.println("Subtração: \n" + subtracao);

        //Cenário de Teste de Subtração 2: Subtração de dois números, sendo um número negativo.
        subtracao = calculadora.subtracao(-15, 15);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 3: Subtração de dois números, sendo dois números negativos.
        subtracao = calculadora.subtracao(-2, -3);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 4: Subtração de dois números, sendo ambos zerp.
        subtracao = calculadora.subtracao(0, 0);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 5: Subtração de dois números.
        subtracao = calculadora.subtracao(54, 2);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 6: Subtração de dois números.
        subtracao = calculadora.subtracao(410, 3);
        System.out.println(subtracao);

        //Cenário de Teste de Subtração 7: Subtração de dois números.
        subtracao = calculadora.subtracao(2, 580);
        System.out.println(subtracao);

        //Cenário de Teste de Multiplicação 1: Multiplicação de dois números.
        int multiplicacao = calculadora.multiplicacao(5, 5);
        System.out.println("Multiplicação: \n" + multiplicacao);

        //Cenário de Teste de Multiplicação 2: Multiplicação de dois números.
        multiplicacao = calculadora.multiplicacao(3, 2);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 3: Multiplicação de dois números.
        multiplicacao = calculadora.multiplicacao(8, 3);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 4: Multiplicação de dois números, sendo um 0.
        multiplicacao = calculadora.multiplicacao(9, 0);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 5: Multiplicação de dois números, sendo um negativo.
        multiplicacao = calculadora.multiplicacao(7, -6);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 6: Multiplicação de dois números, sendo dois negativos.
        multiplicacao = calculadora.multiplicacao(-10, -6);
        System.out.println(multiplicacao);

        //Cenário de Teste de Multiplicação 7: Multiplicação de dois números.
        multiplicacao = calculadora.multiplicacao(7, 12);
        System.out.println(multiplicacao);

        //Cenário de Teste de Divisão 1: Divisão de dois números.
        int divisao = calculadora.divisao(10, 2);
        System.out.println("Divisão: \n" + divisao);

        //Cenário de Teste de Divisão 2: Divisão de dois números.
        divisao = calculadora.divisao(20, 3);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 3: Divisão de dois números, sendo um negativo.
        divisao = calculadora.divisao(2, -2);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 4: Divisão de dois números, sendo dois negativos.
        divisao = calculadora.divisao(-5, -5);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 5: Divisão de dois números.
        divisao = calculadora.divisao(50, 20);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 6: Divisão de dois números.
        divisao = calculadora.divisao(70, 7);
        System.out.println(divisao);

        //Cenário de Teste de Divisão 7: Divisão de dois números.
        divisao = calculadora.divisao(20, 9);
        System.out.println(divisao);

    }
}