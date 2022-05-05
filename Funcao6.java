/*
Atividade 3

Criar uma função que recebe um vetor e modifica os valores para o dobro.
 */
package funcao6;
    public class Funcao6 {
        static void vetor(int vet1[]){
            
        for(int n:vet1){
            System.out.printf("%d\n", n*2);
        }
    }

    public static void main(String[] args) {
        int numeros[] = {11,12,13,14,15};
        vetor(numeros);
        System.out.println("");
    }
}
