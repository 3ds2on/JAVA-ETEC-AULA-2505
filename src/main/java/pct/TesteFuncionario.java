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
public class TesteFuncionario {
        public static void main(String[] args){
            
            Funcionario F = new Funcionario();
            
            F.numMatricula = 1;
            F.nome = "João";
            F.nivel = 'T'; // T = TRAINEE, J = JUNIOR, P = PLENO, S = SENIOR
            F.salario = 1042.00;
            F.afastado = true;     
            
            
            if (F.afastado){F.liberado = "SIM";}else{F.liberado = "NAO";}
            
            
            switch (F.nivel) {
                case 'T':
                    F.apresentaNivel = "TRAINEE";
                    break;
                case 'J':
                    F.apresentaNivel = "JUNIOR";
                    break;
                case 'P':
                    F.apresentaNivel = "PLENO";
                    break;
                case 'S':
                    F.apresentaNivel = "SENIOR";
                    break;
                default:
                    break;
                            }

            
            //Testando o calculo de INSS
            F.calcularINSS();
            
            //Testando a impresão dos dados 
            F.imprimirFuncionario();
   
    }   
}