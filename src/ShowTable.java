import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowTable {


    Connect cn = new Connect();
    public void showTablePrescription(){

    String sql = "SELECT id,PractitionerID,Medicine,PrescriptionCost,InsuranceCompany,FirstName,LastName,Date,Gender,City,Address,HouseNumber,Phone,EmailAddress FROM prescription";

    try (Connection conn = cn.connect();
    Statement stmt  = conn.createStatement();
    ResultSet rs    = stmt.executeQuery(sql)){

        // loop through the result set
        while (rs.next()) {
            System.out.println(rs.getInt("id") +  "\t" +
                    rs.getString("PractitionerID") + "\t" +
                    rs.getString("Medicine") + "\t" +
                    rs.getString("PrescriptionCost") + "\t" +
                    rs.getString("InsuranceCompany") + "\t" +
                    rs.getString("FirstName") + "\t" +
                    rs.getString("LastName") + "\t" +
                    rs.getString("Date") + "\t" +
                    rs.getString("Gender") + "\t" +
                    rs.getString("City") + "\t" +
                    rs.getString("Address") + "\t" +
                    rs.getString("HouseNumber") + "\t" +
                    rs.getString("Phone") + "\t" +
                    rs.getDouble("EmailAddress"));
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    public void showTablePractitioners(){

        String sql = "SELECT id,FirstName,LastName,Date,Gender,City,Address,HouseNumber,Phone,EmailAddress FROM practitioner";

        try (Connection conn = cn.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("FirstName") + "\t" +
                        rs.getString("LastName") + "\t" +
                        rs.getString("Date") + "\t" +
                        rs.getString("Gender") + "\t" +
                        rs.getString("City") + "\t" +
                        rs.getString("Address") + "\t" +
                        rs.getString("HouseNumber") + "\t" +
                        rs.getString("Phone") + "\t" +
                        rs.getDouble("EmailAddress"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
