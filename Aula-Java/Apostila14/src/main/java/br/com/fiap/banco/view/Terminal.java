package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.FuncionarioDao;
import br.com.fiap.banco.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Ler os dados do funcionario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código do funcionario");
        int codigo = scanner.nextInt();

        System.out.println("Informe o nome do funcionario");
        String nome = scanner.nextLine() + scanner.next();

        System.out.println("Informe o salario do funcionario");
        double salario = scanner.nextDouble();

        System.out.println("Informe se o funcionario esta ativo");
        boolean estaAtivo = scanner.nextBoolean();

        System.out.println("Informe o email do funcionario");
        String email = scanner.nextLine() + scanner.next();

        //Criar um funcionario
        Funcionario funcionario = new Funcionario(codigo, nome, salario, estaAtivo, email);

        //Criar um FuncionarioDao

        FuncionarioDao dao = new FuncionarioDao();

        //Cadastrar o funcionario
        dao.cadastrar(funcionario);

    }//main
}//class
