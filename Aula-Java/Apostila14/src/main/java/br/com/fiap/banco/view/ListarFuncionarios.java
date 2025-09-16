package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.FuncionarioDao;
import br.com.fiap.banco.model.Funcionario;

import java.sql.SQLException;
import java.util.List;

public class ListarFuncionarios {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Acessar o DAO
        FuncionarioDao dao = new FuncionarioDao();

        // Buscar dados do DAO
        List<Funcionario> funcionarios = dao.listar();

        // Imprime os resultados
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Codigo do funcioario: " + funcionario.getCodigo());
            System.out.println("Nome do funcionario: " + funcionario.getNome());
            System.out.println("Salario do funcionario: " + funcionario.getSalario());
            System.out.println("O funcionario esta ativo?: " + funcionario.isAtivo());
            System.out.println("Email do funcionario: " + funcionario.getEmail());
        }
    }

}
