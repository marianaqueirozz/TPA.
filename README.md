# TPA













Explicação do Algoritmo;

Declaração de variáveis:

double numero1;
double numero2;

Variáveis são espaços na memória para guardar dados.

double é um tipo numérico que aceita inteiros e decimais (ex.: 10, 5.75).

Aqui, vou guardar os dois números que o usuário digitar.

Bloco try/catch:

try {
    // código
} catch (NumberFormatException e) {
    // tratamento de erro
}

Serve para tratar erros que podem acontecer.

No meu caso, se o usuário digitar letras ou símbolos ao invés de números, acontece um erro chamado NumberFormatException.

Com o catch, consigo mostrar uma mensagem de erro em vez de deixar o programa fechar sozinho.

6. Entrada de dados com JOptionPane:

numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));

JOptionPane.showInputDialog abre uma janela para o usuário digitar algo.

O que o usuário digita vem como String (texto).

Para usar como número, preciso converter usando Double.parseDouble, que transforma texto em número do tipo double.

Variável String resultado:

String resultado = "Resultados das comparações:\n\n";

String é um tipo de dado para armazenar textos.

Aqui, criei a variável resultado para ir guardando todas as comparações feitas.

\n significa quebra de linha, para deixar o texto organizado.

Estruturas de decisão if e else:

if (numero1 == numero2) {
    resultado += numero1 + " é IGUAL a " + numero2 + "\n";
} else {
    resultado += numero1 + " é DIFERENTE de " + numero2 + "\n";
}

O if é usado para tomar decisões no programa.

O == verifica se dois valores são iguais.

O else executa outro bloco de código caso o if não seja verdadeiro.

Aqui, se os números não forem iguais, já sei que são diferentes (!=).

Operadores relacionais:

== - Igual

!= - Diferente

> -Maior

< - Menor

>= - Maior ou igual

<= - Menor ou igual


Exemplo no código:

if (numero1 > numero2) {
    resultado += numero1 + " é MAIOR que " + numero2 + "\n";
}

Aqui, só adiciona a frase no resultado se numero1 for realmente maior que numero2.

Exibição do resultado:

JOptionPane.showMessageDialog(null, resultado, "Comparação Final", JOptionPane.INFORMATION_MESSAGE);

JOptionPane.showMessageDialog abre uma janela para mostrar informações.

O primeiro parâmetro (null) diz que a janela não está ligada a outra janela anterior.

O segundo é o texto a mostrar (resultado).

O terceiro é o título da janela.

O quarto define o ícone (aqui usei informação).

Tratamento de erro:

catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
}

Se o usuário digitar algo que não seja número, cai nesse bloco.

Mostra uma mensagem de erro com ícone vermelho (ERROR_MESSAGE).

Então em resumo, meu algoritmo abre uma janela pedindo o primeiro número, abre outra pedindo o segundo número, compara os dois usando todos os operadores pedidos, monta um texto com os resultados verdadeiros, mostra tudo em uma janela final e se o usuário digitar algo inválido, mostra uma mensagem de erro.
