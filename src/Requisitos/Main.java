package Requisitos;

public class Main {

    public static void main(String[] args) {


        Empresa minhaEmpresa = new Empresa("SoftBots","987654321" );


        Departamento meuDepartamento = new Departamento("Departamento Programação", "987654321", "RH");


        Funcionario joao = new Funcionario("SoftBots", "987654321", 5000.0, "01/01/2022", "Joao", "Financeiro");
        Funcionario maria = new Funcionario("SoftBots", "987654321", 6000.0, "01/01/2022", "Maria", "Marketing");
        Funcionario carlos = new Funcionario("SoftBots", "987654321", 7000.0, "01/01/2022", "carlos", "");


        meuDepartamento.adicionarFuncionario(joao);
        meuDepartamento.adicionarFuncionario(maria);
        meuDepartamento.adicionarFuncionario(carlos);


        System.out.println("Antes do aumento:");
        System.out.println(meuDepartamento);


        meuDepartamento.concederAumento(10.0);


        System.out.println("Depois do aumento:");
        System.out.println(meuDepartamento);
    }
}

