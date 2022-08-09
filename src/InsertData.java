import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    Connect cn = new Connect();
    /**
     * Insert a new row into the Prescription table
     * @param PractitionerID
     * @param Medicine
     * @param PrescriptionCost
     * @param InsuranceCompany
     * @param FirstName
     * @param LastName
     * @param Date
     * @param Gender
     * @param City
     * @param Address
     * @param HouseNumber
     * @param Phone
     * @param EmailAddress

     *
     *
     */
    public void insertPresc(String PractitionerID,String Medicine,String PrescriptionCost, String InsuranceCompany, String FirstName, String LastName, String Date, String Gender, String City, String Address, String HouseNumber, String Phone, String EmailAddress) {
        String sql = "INSERT INTO prescription(PractitionerID,Medicine,PrescriptionCost,InsuranceCompany,FirstName,LastName,Date,Gender,City,Address,HouseNumber,Phone,EmailAddress) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = cn.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, PractitionerID);
            pstmt.setString(2, Medicine);
            pstmt.setString(3, PrescriptionCost);
            pstmt.setString(4, InsuranceCompany);
            pstmt.setString(5, FirstName);
            pstmt.setString(6, LastName);
            pstmt.setString(7, Date);
            pstmt.setString(8, Gender);
            pstmt.setString(9, City);
            pstmt.setString(10, Address);
            pstmt.setString(11, HouseNumber);
            pstmt.setString(12, Phone);
            pstmt.setString(13, EmailAddress);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

public void insertPrac(String FirstName, String LastName, String Date, String Gender, String City, String Address, String HouseNumber, String Phone, String EmailAddress )   {
    String sql = "INSERT INTO practitioner(FirstName,LastName,Date,Gender,City,Address,HouseNumber,Phone,EmailAddress) VALUES(?,?,?,?,?,?,?,?,?)";

    try (Connection conn = cn.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, FirstName);
        pstmt.setString(2, LastName);
        pstmt.setString(3, Date);
        pstmt.setString(4, Gender);
        pstmt.setString(5, City);
        pstmt.setString(6, Address);
        pstmt.setString(7, HouseNumber);
        pstmt.setString(8, Phone);
        pstmt.setString(9, EmailAddress);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
}
/**
 * @param args the command line arguments
 */

