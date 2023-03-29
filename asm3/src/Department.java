public class Department {
    private String departmentCode;
    private String departmentName;
    private int currentEmployee;

    //Khởi tạo Department
    public Department(String departmentCode, String departmentName, int currentEmployee){
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.currentEmployee = currentEmployee;
    }

    //Setter và getter của Department
    public String getDepartmentName(){
        return departmentName;
    }
    public void setCurrentEmployee(){
        this.currentEmployee++;
    }

    //Hiển thị thông tin của bộ phận
    public String toString() {

        return String.format("%-15s| %-25s| %-30s",departmentCode, departmentName, currentEmployee);
    }
}
