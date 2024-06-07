package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextIn();

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextIn();

        try{
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch(e exception){
            // imprimir a mensagem: O segundo parameetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametro um é Maior que parametro dois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.")
        }
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i<= contagem; i++){
            System.out.println("Imprimindo o número " + (parametroUm + +i));
        }
    }
}
