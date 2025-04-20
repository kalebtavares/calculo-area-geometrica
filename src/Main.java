import java.util.Scanner;

// Classe principal para executar a aplicação
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a figura geométrica para calcular a área:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Círculo");
        System.out.print("Digite o número correspondente à opção desejada: ");

        int opcao = scanner.nextInt();
        Figura figura = null;

        switch(opcao) {
            case 1:
                System.out.print("Digite o valor do lado do quadrado: ");
                double lado = scanner.nextDouble();
                figura = new Quadrado(lado);
                break;
            case 2:
                System.out.print("Digite o valor da base do retângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite o valor da altura do retângulo: ");
                double altura = scanner.nextDouble();
                figura = new Retangulo(base, altura);
                break;
            case 3:
                System.out.print("Digite o valor do raio do círculo: ");
                double raio = scanner.nextDouble();
                figura = new Circulo(raio);
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa!");
                System.exit(0);
        }

        System.out.println("A área da figura escolhida é: " + figura.calcularArea());
        scanner.close();
    }
}