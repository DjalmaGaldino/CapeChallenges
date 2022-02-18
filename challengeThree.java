/*
# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

*/


import java.util.Arrays;
import java.util.HashMap;
  
public class challengeThree {
    public static void main(String[] args) {
        subString("ovo");
    }
  
    static void subString(String string){
        HashMap<String, Integer> map = new HashMap<>();
  
        for(int i = 0; i < string.length(); i++){
            for(int j = i; j < string.length(); j++){
                
                char[] valC = string.substring(i, j + 1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);

                if (map.containsKey(val)) 
                    map.put(val, map.get(val) + 1);
                else 
                    map.put(val, 1);
            }
        }
        int contaAnagrama = 0;

        for(String key: map.keySet()){
            int n = map.get(key);
            contaAnagrama += (n * (n-1)) / 2;
        }
        System.out.println(contaAnagrama);
    }
}


