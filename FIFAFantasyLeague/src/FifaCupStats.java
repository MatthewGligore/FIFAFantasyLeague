import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FifaCupStats {
    private Connection conn;
    public ArrayList<Player> players = new ArrayList<>();

    
    public void start() {
        connectToDatabase();
        createTables();
    }

    private void connectToDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Football.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTables() {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS Player (ID INTEGER PRIMARY KEY, OVR INTEGER, Name TEXT, Age INTEGER, Positions TEXT, Team TEXT)");
            stmt.execute("CREATE TABLE IF NOT EXISTS Teams (id INTEGER PRIMARY KEY, name TEXT, Goals TEXT, Possessions TEXT, Passes TEXT, Rating TEXT)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadPlayers() {
        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM  Player")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Player player = new Player(rs.getInt("ID"), rs.getString("Name"), rs.getInt("Age"), rs.getString("Positions"), rs.getString("Team"));
                player.setOVR(rs.getString("OVR"));
                players.add(player);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}