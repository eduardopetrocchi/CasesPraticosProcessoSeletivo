package controlefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro:");
        int parametroDois = terminal.nextInt();
        //int parametroUm = 1;
        //int parametroDois = 6;
        terminal.close();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosExecocoes exception){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosExecocoes {
        if (parametroUm > parametroDois)
            throw new ParametrosExecocoes();


            for (int contagem = parametroUm; contagem <= parametroDois; contagem++) {
                System.out.println("A diferença entre os números " + parametroUm + " e " + parametroDois + " é:" + (parametroDois-parametroUm++));}

    }
}


