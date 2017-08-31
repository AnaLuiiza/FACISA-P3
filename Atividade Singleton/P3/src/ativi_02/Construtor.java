package ativi_02;

import atividade_p3.Teste_2;

public class Construtor{
	   

    public static void main(String args[]) {
	
    	//No mesmo pacote
    	Teste_1 test = new Teste_1(3,4,5);
    	System.out.println(test.num_2);
    	System.out.println(test.num_3);
    	//nao acessa o atribuo privado, mesmo estando no mesmo pacote;
    	
    	//Pacote diferente
    	Teste_2 teste = new Teste_2(8,9,8);
    	System.out.println(teste.num_4);
    	//Nao vai acessar nem o metodo protected nem o privado;
    	
    }
	
	

}
