package br.com.supermercado;

import java.util.Scanner;

public class ValidandoSaldo {
	public static void main(String[] args) {

		// Instagram: @pikdev_

		// Youtube: @Pikachu Gamer

		// GitHub: @antonioCAGF

		// Linkedin: https://www.linkedin.com/in/antonio-guimar%C3%A3es-007ba61a8

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Iniciando...");

		System.out.println("Quanto o cliente tem?");
		double saldoCliente = keyboard.nextDouble();
		System.out.println("Qual o valor total da compra?");
		double valorCompra = keyboard.nextDouble();
		double troco;

		if (saldoCliente >= valorCompra) {
			System.out.println("Pagamento realizado com sucesso! Compra realizada!");
		} else {
			System.out.println("Saldo insuficiente! Compra não pode ser realizada!");
		}
		troco = saldoCliente - valorCompra;
		System.out.println();
		if (troco > 0) {
			System.out.println("O troco do cliente é: " + troco);
		} else {
			System.out.println("Não é necessário troco");
		}

		System.out.println();
		System.out.println("Programa finalizado...");
	}
}
