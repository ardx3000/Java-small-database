import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {


    public void createTable() {

        String url = "Location of database";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS prescription (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	PractitionerID text NOT NULL,\n"
                + "	Medicine text NOT NULL,\n"
                + "	PrescriptionCost text NOT NULL,\n"
                + "	InsuranceCompany text NOT NULL,\n"
                + "	FirstName text NOT NULL,\n"
                + "	LastName text NOT NULL,\n"
                + "	Date text NOT NULL,\n"
                + "	Gender text NOT NULL,\n"
                + "	City text NOT NULL,\n"
                + "	Address text NOT NULL,\n"
                + "	HouseNumber text NOT NULL,\n"
                + "	Phone text NOT NULL,\n"
                + "	EmailAddress real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTablePractioners() {

        String url = "Location of database";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS practitioner (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	FirstName text NOT NULL,\n"
                + "	LastName text NOT NULL,\n"
                + "	Date text NOT NULL,\n"
                + "	Gender text NOT NULL,\n"
                + "	City text NOT NULL,\n"
                + "	Address text NOT NULL,\n"
                + "	HouseNumber text NOT NULL,\n"
                + "	Phone text NOT NULL,\n"
                + "	EmailAddress real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}