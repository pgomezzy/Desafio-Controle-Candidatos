package candidatura;

import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice ++){
        System.out.println("O candidato de numero " + (indice+1) + " é " + candidatos[indice]);
    }

}

    static void selecaoCandidatos( ){

        String [] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO", "JOAO", "MARCOS", "ANGELA", "MARCELA", "PAMELA"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato =  candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            else{
                System.out.println("O candidato " + candidato + " Não foi selecionado para a vaga");  
            }
            candidatoAtual++;
        }
    }    

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0 , 2200.0);
    }

    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");

        }else if (salarioBase < salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        
        }else 
        System.out.println( "AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }    
    

    

