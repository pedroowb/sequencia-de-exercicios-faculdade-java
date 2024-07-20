import javax.swing.JOptionPane;
// Biblioteca que o professor ensinou a utilizar para fazer interface gráfica simples

public class TrocoMinimo {
    // classe responsável por trabalhar o sisteminha simples de troco
    public static void main(String[] args) {
        int valor_recebido = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor deseja inserir?"));

        int v100 = valor_recebido / 100; // primeira etapa
        int resto_da_divisao = valor_recebido % 100;
//  -------------------------------------------------------
        int v50 = resto_da_divisao / 50;
        resto_da_divisao %= 50;

        int v20 = resto_da_divisao / 20; // Sistema de afunilamento de divisão, matemática básica aplicada a programação
                                         // 😎
        resto_da_divisao %= 20;

        int v10 = resto_da_divisao / 10;
        resto_da_divisao %= 10;

        int v5 = resto_da_divisao / 5;
        resto_da_divisao %= 5;

        int v2 = resto_da_divisao / 2;
        resto_da_divisao %= 2;

        int moedinha = resto_da_divisao;

        JOptionPane.showMessageDialog(null, "O Valor inserido foi: " + valor_recebido +
                "\nA distribuição ficou da seguinte forma:" +
                "\nNotas de 100 = " + v100 +
                "\nNotas de 50 = " + v50 +
                "\nNotas de 20 = " + v20 +
                "\nNotas de 10 = " + v10 + // Saída dos valores, em interface gráfica com o Joptionpane
                "\nNotas de 5 = " + v5 +
                "\nNotas de 2 = " + v2 +
                "\nMoedas de 1 = " + moedinha);
    }
}