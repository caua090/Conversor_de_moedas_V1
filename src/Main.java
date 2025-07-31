import OOP.Conversor;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*conversor de moedas
        1 - recebe o valor a ser convertido
        2- pergunta a moeda de origem e destino
        3- consulta API de câmbio em tempo real
        4- mostra resultado no terminal
         */
        Conversor conversor = new Conversor();

        //entrada de valores

        System.out.println("Coversor de moedas\nPor favor digite abaixo o valor a ser convertido:");
        Scanner entradaUsuario = new Scanner(System.in);
        conversor.setValor(entradaUsuario.nextDouble());

        //moeda de origem e destino
        System.out.println("Por favor escolha o tipo de moeda de orgiem (ex: USD, BRL, EUR)");
        conversor.setMoedaOrigem(entradaUsuario.next().toUpperCase());
        System.out.println("Por favor escolha o tipo de moeda de destino (ex: USD, BRL, EUR)");
        conversor.setMoedaDestino(entradaUsuario.next().toUpperCase());

        //print só pra ver
        conversor.ConversorMoeda();


    }
}