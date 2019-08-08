/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author 18117820
 */
import java.util.Scanner;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        while (!sc.hasNextInt()) sc.next();
        int num1 = sc.nextInt();
        
        System.out.print("Digite a operacao: ");
        char c = sc.next().charAt(0); 
        
        System.out.print("Digite o numero 2: ");
        while (!sc.hasNextInt()) sc.next();
        int num2 = sc.nextInt();
        
        float z = 0;
        
        switch(c) {
        case '+':
            z = num1 + num2;
        break;
        case '-':
            z = num1 - num2;
            break;
        case '/':
            z = num1 / num2;
            break;
        
        case '*':
            z = num1 * num2;
            break;
        default:
    // code block
}
        System.out.printf("The Sum is %f" , z);
    }
    
}
