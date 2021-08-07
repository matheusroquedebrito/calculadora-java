//criei essa calculadora estudando java por apenas 1 noite
import java.io.IOException;
import java.util.Scanner;
public class calculadora{
    public static void main(String[] args)
    {
        int repeat;
        repeat = 0;
        
        System.out.printf("Codigo iniciado com sucesso\n");
        while(repeat ==0)
        { 
        System.out.printf("----------------------------\n|      Calculadora         |  \n----------------------------\nDigite o primeiro  numero:");

        Scanner obj1 = new Scanner(System.in);
        int n1 = obj1.nextInt();
        System.out.println("insira o segundo numero:");
        int n2 = obj1.nextInt();
        System.out.print("Qual operação você deseja realizar?\nSoma[1],Subtração[2],Divisão[3].Multiplicação[4]");

        int n3 = obj1.nextInt();

        if(n3 == 1)
        {
            int n4 = n1+n2;
            System.out.printf("\n\n-------------\n|resultado:%d|\n-------------\n\n\n-------------------------------------------------------------\n\n",n4);
    
        }
        if(n3 == 2)
        {
            int n4 = n1-n2;
            System.out.printf("\n\n-------------\n|resultado:%d|\n-------------\n\n\n-------------------------------------------------------------\n\n",n4);
        }
        if(n3 == 3)
        {
            int n4 = n1/n2;
            System.out.printf("\n\n-------------\n|resultado:%d|\n-------------\n\n\n-------------------------------------------------------------\n\n",n4);
        }
        if(n3 == 4)
        {
            int n4 = n1*n2;
            System.out.printf("\n\n-------------\n|resultado:%d|\n-------------\n\n\n-------------------------------------------------------------\n\n",n4);
        }
        
    }
}
}
