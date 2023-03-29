public class Manager extends Staff implements ICalculator {
    private String title;
    private double managerSalary;

    //Khởi tạo Manager
    public Manager(String id, String name, int age, double coefficientsSalary, String workingDay, int daysOfLeave, String workingParts, String title){
        super(id, name, age,coefficientsSalary, workingDay,daysOfLeave, workingParts);
        this.title = title;
    }

    //Hàm tính lương cho nhân viên cấp quản lý
    @Override
    public double calculateSalary(){
        double salary = 0;
        if(title.equals("Business Leader")) {
            salary = getCoefficientsSalary() * 5000000 + 8000000;
        }
        if(title.equals("Project Leader")) {
            salary = getCoefficientsSalary() * 5000000 + 5000000;
        }
        if(title.equals("Technical Leader")) {
            salary = getCoefficientsSalary() * 5000000 + 6000000;
        }
        return salary;
    }

    //Hiển thị thông tin nhân viên cấp quản lý
    public void displayInformation(){
        System.out.printf("%-15s| %-25s| %-8d| %-12f| %-16s| %-18d| %-21s| %-27s| %-15f\n",getId(),getName(), getAge(), getCoefficientsSalary(), getWorkingDay(), getDaysOfLeave(), getWorkingParts(), title, calculateSalary());
    }
}
