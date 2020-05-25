/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package pct;

/**
 *
 * @author edson_home
 */

public class Funcionario {
int numMatricula;
String nome,liberado,apresentaNivel;
char nivel;
double salario,salarioLiquido,calcularInss;
boolean afastado; 

public void imprimirFuncionario(){
System.out.println("Numero da Matricula: "+numMatricula);
System.out.println("Esta liberado para trabalho? "+liberado);
System.out.println("Nome: "+nome);
System.out.println("Nivel: "+apresentaNivel);
System.out.println("Salario Bruto: R$ "+salario);
System.out.println("O salario Bruto de R$ " +salario+ ", sofreu um desconto de R$ " +calcularInss+ " pertinente ao INSS ");
System.out.println("O salario Liquido será de R$ " +salarioLiquido+" ");
                                  }
    
public void calcularINSS(){
            if (salario <= 720) {
            calcularInss = salario * 0.0765;
            salarioLiquido = salario - calcularInss;
                                }
            else {
            if (salario <= 1200) {
            calcularInss = salario * 0.09;
            salarioLiquido = salario - calcularInss;
            } else {
            if (salario <= 2400) {
            calcularInss = salario * 0.11;
            salarioLiquido = salario - calcularInss;
            } else {
            if (salario > 2400) {
            calcularInss = 2400 * 0.11;
            salarioLiquido = salario - calcularInss;
                                }    
                }
            } 
        }
}
    
}