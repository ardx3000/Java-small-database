import java.util.Scanner;

public class Database {
    //patients:
    InsertData InD = new InsertData();
    private  Scanner myScanner = new Scanner(System.in);

    public void InsertDataPrescription(){

        System.out.println("insert the Practitioner ID:");
        String PractitionerID = myScanner.nextLine();
        System.out.println("PractitionerID: " + PractitionerID);

        System.out.println("insert The medicine name:");
        String Medicine = myScanner.nextLine();
        System.out.println("Medicine " + Medicine);

        System.out.println("insert the prescription cost:");
        String PrescriptionCost = myScanner.nextLine();
        System.out.println("Prescription cost: " + PrescriptionCost);

        System.out.println("insert the insurance company:");
        String InsuranceCompany = myScanner.nextLine();
        System.out.println("Insurance company: " + InsuranceCompany);

        System.out.println("insert the first name of the patient:");
        String FirstName = myScanner.nextLine();
        System.out.println("first name: " + FirstName);

        System.out.println("insert the Last name of the patient:");
        String LastName= myScanner.nextLine();
        System.out.println("last name : " + LastName);

        System.out.println("insert the DOB(format :dd-MM-yyyy) of the patient:");
        String Date = myScanner.next();
        System.out.println("DOB:" + Date);


        System.out.println("insert the gender(Man/Woman/Other) of the patient:");
        boolean xd = true;
        String Gender = myScanner.nextLine();
        while (xd){
            if(Gender.equals("Man")|| Gender.equals("Woman") || Gender.equals("Other")){
                System.out.println("gender:" + Gender);
                xd = false;
            }
            else{

                System.out.println("Please insert(man/woman/other)");
                Gender = myScanner.nextLine();

            }

        }

        System.out.println("insert the city in which the patient resides:");
        String City = myScanner.nextLine();
        System.out.println("City:" + City);

        System.out.println("insert the address1 of the patient:");
        String Address =myScanner.nextLine();
        System.out.println("Address1:" + Address);

        System.out.println("insert the house number of the patient:");
        String HouseNumber= myScanner.nextLine();
        System.out.println("House Number:" + HouseNumber);

        System.out.println("insert the phone number of the patient:");
        String Phone = myScanner.nextLine();
        System.out.println("Phone:" + Phone);

        System.out.println("insert the email address of the patient:");
        String EmailAddress = myScanner.nextLine();
        System.out.println("Email:" + EmailAddress);

        InD.insertPresc(PractitionerID,Medicine,PrescriptionCost,InsuranceCompany,FirstName,LastName,Date,Gender,City,Address,HouseNumber,Phone,EmailAddress);

    }

    public void InsertDataPractirioner(){

        System.out.println("insert the first name of the patient:");
        String FirstName = myScanner.nextLine();
        System.out.println("first name: " + FirstName);

        System.out.println("insert the Last name of the patient:");
        String LastName= myScanner.nextLine();
        System.out.println("last name : " + LastName);

        System.out.println("insert the first name(format :dd-MM-yyyy) of the patient:");
        String Date = myScanner.next();
        System.out.println("DOB:" + Date);


        System.out.println("insert the gender(Man/Woman/Other) of the patient:");
        boolean xd = true;
        String Gender = myScanner.nextLine();
        while (xd){
            if(Gender.equals("Man")|| Gender.equals("Woman") || Gender.equals("Other")){
                System.out.println("gender:" + Gender);
                xd = false;

            }

            else{

                System.out.println("Please insert(man/woman/other)");
                Gender = myScanner.nextLine();

            }

        }

        System.out.println("insert the city in which the patient resides:");
        String City = myScanner.nextLine();
        System.out.println("City:" + City);

        System.out.println("insert the address1 of the patient:");
        String Address =myScanner.nextLine();
        System.out.println("Address1:" + Address);

        System.out.println("insert the house number of the patient:");
        String HouseNumber= myScanner.nextLine();
        System.out.println("House Number:" + HouseNumber);

        System.out.println("insert the phone number of the patient:");
        String Phone = myScanner.nextLine();
        System.out.println("Phone:" + Phone);

        System.out.println("insert the email address of the patient:");
        String EmailAddress = myScanner.nextLine();
        System.out.println("Email:" + EmailAddress);

        InD.insertPrac(FirstName,LastName,Date,Gender,City,Address,HouseNumber,Phone,EmailAddress);

    }



}
