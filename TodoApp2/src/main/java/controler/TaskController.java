
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import util.ConnectionFactory;
import model.Tasks;

/**
 *
 * @author Albert
 */
public class TaskController {
    
    public void save(Tasks task){
        String sql = "INSERT INTO tasks {} VALUES {}";
        
        Connection connection = null;
        PreparedStatement statement = null;
                
    }
    
    public void update(Tasks task){
        
    }
    public void removeById(int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1,taskId);
            statement.execute();
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar tarefa");
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
    }
    public List<Tasks> getAll(int idProject){
        return null;
    }
}
