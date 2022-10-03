/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade04;

import java.util.Scanner;

/**
 *
 * @author 322121746
 */
public class Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int x,y,z,w, soma, media;
        System.out.println("Insira as suas notas Bimestrais ");
        System.out.println("Insira a Primeira nota");
        x = leia.nextInt();
        System.out.println("Insira a Segunda nota");
        y = leia.nextInt();
        System.out.println("Insira a Terceira nota");
        z = leia.nextInt();
        System.out.println("Insira a Quarta nota");
        w =leia.nextInt();
        
        
        leia.close();
        soma = (x+y+z+w);
        media = (soma)/4;
        System.out.println("A media das notas e de " + media + " A soma das notas e de" + soma);
    }
    
}
