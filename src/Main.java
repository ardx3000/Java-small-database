import java.util.Scanner;
public class Main {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Connect cn = new Connect();
        Database db = new Database();
        CreateTable ct = new CreateTable();
        ShowTable st = new ShowTable();
         cn.connect();
        boolean working = true;
        while(working) {

            System.out.println("Please choose an option:");
            System.out.println("Press 1 To insert Prescription:");
            System.out.println("Press 2 To Show Prescriptions");
            System.out.println("Press 3 To Show Practitioners");
            System.out.println("Press 4 To Create TablesPrescription(Administrator only)");
            System.out.println("Press 5 To Create TablesPractitioner(Administrator only)");
            System.out.println("Press 6 To Create Add Practitioner(Administrator only)");

            System.out.println("Press 7 To Exit");

            int option = myScanner.nextInt();

            switch (option) {
                case (1):
                   db.InsertDataPrescription();
                    break;
                case (2):
                    st.showTablePrescription();
                    break;
                case (3):
                    st.showTablePractitioners();
                    break;
                case (4):
                    ct.createTable();
                    break;
                case (5):
                    ct.createTablePractioners();
                    break;
                case (6):
                    db.InsertDataPractirioner();
                    break;
                case (7):
                    working = false;
                    break;

            }
        }
    }
}