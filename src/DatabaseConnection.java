import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3307/docker_core",
                    "docker_core",
                    "docker_core"
            );

            pstmt = con.prepareStatement("select * from shops");

            rs=pstmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("kana"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
