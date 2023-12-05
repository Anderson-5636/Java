package Requisitos;

class Funcionario extends Departamento {
    private double salario;
    private String nomeFuncionario;
    private String dataAdmissao;


    public Funcionario(String nomeEmpresa, String cnpj, double salario,
                       String dataAdmissao, String nomeFuncionario,
                       String nomeDepartamento) {
        super(nomeEmpresa, cnpj, nomeDepartamento);
        this.salario = salario;
        this.nomeFuncionario = nomeFuncionario;
        this.dataAdmissao = dataAdmissao;
    }


    public void concederAumento(double percentualAumento) {
        double novoSalario = this.salario * (1 + percentualAumento / 100);
        this.salario = novoSalario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nomeFuncionario + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", salario=" + salario +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}

