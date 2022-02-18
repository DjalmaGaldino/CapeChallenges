/*
# Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
*/

public class challengeOne {
    public static void main(String[] args) {

        String valor = "*";
        for (int i = 1; i <= 6; i++){
            System.out.println(valor);
            valor += "*";
        }
        
    }
}