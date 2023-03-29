public class Employee extends Staff implements ICalculator{
    private double overtime;
    private double employeeSalary;

    //Khởi tạo Employee
    public Employee(String id, String name, int age, double coefficientsSalary, String workingDay, int daysOfLeave, String workingParts, double overtime){
        super(id, name, age, coefficientsSalary, workingDay, daysOfLeave, workingParts);
        this.overtime = overtime;

    }

    //Hàm tính lương cho nhân viên thông thường
    @Override
    public double calculateSalary(){

        return getCoefficientsSalary() * 3000000 + overtime * 200000;
    }

    //Hiển thị thông tin nhân viên thông thường
    public void displayInformation(){
        System.out.printf("%-15s| %-25s| %-8d| %-12f| %-16s| %-18d| %-21s| %-27f| %-15f\n",getId(),getName(), getAge(), getCoefficientsSalary(), getWorkingDay(), getDaysOfLeave(), getWorkingParts(), overtime, calculateSalary());
    }
}
    