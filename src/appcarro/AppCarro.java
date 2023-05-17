package appcarro;

import java.util.Scanner;

public class AppCarro {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o fabricante: ");
        c1.setFabricante(sc.nextLine());
        System.out.println("Digite o modelo: ");
        c1.setModelo(sc.nextLine());
        System.out.println("Digite a cor: ");
        c1.setCor(sc.nextLine());
        System.out.println("Digite a placa: ");
        c1.setPlaca(sc.nextLine());
        System.out.println("Digite o valor: ");
        c1.setValor(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o número de portas: ");
        c1.setNumeroPortas(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o ano de fabricação: ");
        c1.setAnoFabricacao(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o ano do modelo: ");
        c1.setAnoModelo(Integer.parseInt(sc.nextLine()));
        c1.imprimir();
        sc.close();
    }

}
