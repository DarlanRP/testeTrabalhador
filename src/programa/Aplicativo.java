
package programa;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.LevelTrabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Aplicativo {

  
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    System.out.print("Entre com o nome do departamento: ");
    String nome = sc.nextLine();
    
    System.out.println("Digite os dados do trabalhador: ");
    System.out.print("Digite o nome: ");
    String trabalhadorNome = sc.nextLine();
    System.out.print("Nivel: ");
    String trabalhadorLevel = sc.nextLine();
    System.out.print("Salario base: ");
    double salarioBase = sc.nextDouble();
     
    Trabalhador trabalhador = new Trabalhador(trabalhadorNome,LevelTrabalhador.valueOf(trabalhadorLevel),salarioBase,new Departamento(nome));
        
        
        
    System.out.print("Quantos contratos esse trabalhador vai ter ? ");
    int n = sc.nextInt();
    
    for(int i = 1;i<n;i++){
        
        System.out.println("Dados do contrato #"+ i + ": ");
        System.out.print("Digite a data do contrato: (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Valor por Hora: ");
        double valorPorHora = sc.nextDouble();
        System.out.print("Duração em Horas: ");
        int Hora = sc.nextInt();
        ContratoHora contrato = new ContratoHora(date,valorPorHora,Hora);
        trabalhador.adddContrato(contrato);
    }
          
    System.out.println();
    System.out.print("Entre com mes e ano para calcular salario: (MM/yyyy)");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0,2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Nome: "+ trabalhador.getNome());
    System.out.println("Departamento: "+ trabalhador.getDepartamento().getNome());
    System.out.println("Renda de: "+ monthAndYear + ": "+ String.format("%.2f", trabalhador.renda(year, month)));
    
    
    sc.close();
    
    }
    
}
