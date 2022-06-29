/*

Cristiano Guimarães de Carvalho Fernandes Pinhero CB3013111
Patricia Jessica Santos Fernandes Pinheiro        CB3013073

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tpfinal;

/**
*Usando a classe AmostraTemperatura instancie o objeto t1 inicializado-o com o construtor
*AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v);
*Exiba todas as propriedades de t1;
*Agora instancie o objeto t2 usando o construtor AmostraTemperatura();
*Exiba todas as propriedades de t2;
*Usando os métodos setData(), setHora() e setValor, altere as propriedades de T1;
*Exiba todas as propriedades de t1 novamente.

*/

import static java.lang.System.out;
import java.util.Scanner;

public class TPFinal {

    public static void main(String[] args) {
        int dia, mes, ano, h, min, s;
        float valor;
        Scanner scan = new Scanner(System.in);
                
        out.println("----- Hora -----");
        
        out.print("Informe a hora: ");
        h = scan.nextInt();
        
        out.print("Informe os minutos: ");
        min = scan.nextInt();
        
        out.print("Informe os segundos: ");
        s = scan.nextInt();
        
        
        out.println("-------------------------------");
        
        
        out.println("----- Data -----");
        
        out.print("Informe o dia: ");
        dia = scan.nextInt();
        
        out.print("Informe o mes: ");
        mes = scan.nextInt();
        
        out.print("Informe o ano: ");
        ano = scan.nextInt();
        
        
        out.println("-------------------------------");
        
        out.print("Informe o valor: ");
        valor = scan.nextFloat();
        
        out.println("\n-------------- T1 --------------\n");
        
        AmostraTemperatura t1 = new AmostraTemperatura(h, min, s, dia, mes, ano, valor);
        
        out.println("Data: " + t1.getData());
        out.println("Hora: " + t1.getHora());
        out.println("Valor: " +  + t1.getValor());
        out.println("Sequência: " + t1.getNumseq() + "\n");       
        
        
        AmostraTemperatura t2 = new AmostraTemperatura();
        
        out.println("\n-------------- T2 --------------\n");
        
        out.println("Data: " + t2.getData());
        out.println("Hora: " + t2.getHora());
        out.println("Valor: " +  + t2.getValor());
        out.println("Sequência: " + t2.getNumseq());
        
        out.println("\n-------------- T1 --------------\n");
        
        out.println("Data: " + t1.getData());
        out.println("Hora: " + t1.getHora());
        out.println("Valor: " +  + t1.getValor());
        out.println("Sequência: " + t1.getNumseq());
    }    
}