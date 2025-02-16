import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDebugger {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite a sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Dividindo a idade por:");
            int valor = scanner.nextInt();
            int divisao = idade / valor;
            System.out.println("Valor da divisão: " + divisao);

            int[] numeros = {10, 20, 30};
            System.out.println("Tentando acessar um índice inválido...");
            System.out.println(numeros[5]);

            System.out.printf("Nome: %s, Idade: %d", nome, idade);

            scanner.close();
        }
        catch (InputMismatchException eInput) {
            System.out.println("Erro: Entrada inválida! Certifique-se de inserir um número." + eInput.getMessage());
        }
        catch (ArithmeticException eZero) {
            System.out.println("Erro: Entrada inválida! Certifique-se de inserir um número diferente de zero." + eZero.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException exIndex) {
            System.out.println("Erro: O índice não existe no array." + exIndex.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
