public class Main {


    public static void main(String[] args){

        ItCompany itCompany = new ItCompany("HCL Technologies",8009500,"Sebastian Moore",58000,87200,10000,5000);
        itCompany.companyInfo();
        System.out.println("###################################");

        Manager manager = new Manager("Leo Lewis",58000);
        manager.addProject("Android task monitoring");
        manager.addProject("Fingerprint-based ATM system.");
        System.out.println("###################################");
        manager.managerInfo();
        System.out.println("###################################");

        Developer developer = new Developer("Luke Hill",28900);
        developer.developerInfo();
        System.out.println("###################################");

        Tester tester = new Tester("Carter Green",18900,"Java");
        tester.testerInfo();
        System.out.println("###################################");

        itCompany.addEmployee(manager);
        itCompany.addEmployee(developer);
        itCompany.addEmployee(tester);
        System.out.println("###################################");
        itCompany.numberOfWorkPlaces();
    }
}
