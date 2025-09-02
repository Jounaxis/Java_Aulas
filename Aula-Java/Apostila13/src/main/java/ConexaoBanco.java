import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static void main(String[] args) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:this:@oracle.fiap.br:1521:orcl",
                    "rm560907", "fiap25");
            System.out.println("Conectado!");

            conn.close();

        } catch (ClassNotFoundException e){
            System.out.println("O Driver JDBC não foi encontrado");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("Não foi possivel conectar no banco de dados");
            e.printStackTrace();
        }
    }
}
