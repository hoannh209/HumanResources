import java.util.*;

public class HumanResources {
    public static Scanner sc = new Scanner(System.in);
    public static int inputNumber;

    public static void main(String[] args) {
        //ArrayList quản lý bộ phận
        ArrayList<Department> departmentList = new ArrayList<Department>();
        //ArrayList quản lý toàn bộ nhân viên
        ArrayList<Staff> staffList = new ArrayList<Staff>();

        //Khởi tạo nhân viên
        Employee e1 = new Employee("E001", "Phong Tuyết Hoa", 28, 3.2, "10/10/2010", 10, "Hành chính nhân sự", 4);
        Employee e2 = new Employee("E002", "Trần Thị B", 24, 2.2, "09/10/2019", 7, "Hành chính nhân sự", 3);
        Manager m1 = new Manager("M001", "Nguyễn Văn An", 25, 2.5, "11/11/2010", 5, "Công nghệ thông tin", "Business Leader");
        Manager m2 = new Manager("M002", "Tạ Văn Lục", 32, 4.5, "01/11/2010", 1, "Công nghệ thông tin", "Technical Leader");
        staffList.add(e1);
        staffList.add(e2);
        staffList.add(m1);
        staffList.add(m2);

        //Khởi tạo bộ phận
        Department d1 = new Department("HC", "Hành chính nhân sự", 2);
        Department d2 = new Department("IT", "Công nghệ thông tin", 2);
        Department d3 = new Department("MKT", "Marketing", 0);
        departmentList.add(d1);
        departmentList.add(d2);
        departmentList.add(d3);

        do {
            //Menu của chương trình
            System.out.println();
            System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.");
            System.out.println("2. Hiển thị các bộ phận trong công ty.");
            System.out.println("3. Hiển thị các nhân viên theo từng bộ phận.");
            System.out.println("4. Thêm nhân viên mới vào công ty.");
            System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
            System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty.");
            System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
            System.out.println("0. Thoát chương trình.");
            System.out.print("Lựa chọn của bạn: ");
            inputNumber = sc.nextInt();

            //Hiển thị danh sách nhân viên hiện có trong công ty
            if(inputNumber == 1) {
                System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < staffList.size(); i++){
                    staffList.get(i).displayInformation();
                }

            }

            //Hiển thị các bộ phận trong công ty
            if(inputNumber == 2) {
                System.out.printf("%-15s| %-25s| %-30s\n", "Mã bộ phận", "Tên bộ phận", "Số lượng nhân viên hiện tại");
                System.out.println("------------------------------------------------------------------");
                for (int i = 0; i < departmentList.size(); i++) {
                    System.out.println(departmentList.get(i));
                }
            }

            //Hiển thị các nhân viên theo từng bộ phận
            if(inputNumber == 3) {
                //Hiển thị nhân viên của bộ phận Hành chính nhân sự
                System.out.println("Hành chính nhân sự");
                System.out.println("-----------------------------");
                System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                for(int i = 0; i < staffList.size(); i++) {
                    if (staffList.get(i).getWorkingParts().equals("Hành chính nhân sự")) {
                        staffList.get(i).displayInformation();
                    }
                }
                System.out.println();

                //Hiển thị nhân viên của bộ phận Công nghệ thông tin
                System.out.println("Công nghệ thông tin");
                System.out.println("-----------------------------");
                System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                for(int i = 0; i < staffList.size(); i++) {
                    if (staffList.get(i).getWorkingParts().equals("Công nghệ thông tin")) {
                        staffList.get(i).displayInformation();
                    }
                }
                System.out.println();

                //Hiển thị nhân viên của bộ phận Marketing
                System.out.println("Marketing");
                System.out.println("-----------------------------");
                System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                for(int i = 0; i < staffList.size(); i++) {
                    if (staffList.get(i).getWorkingParts().equals("Marketing")) {
                        staffList.get(i).displayInformation();
                    }
                }
            }

            //Thêm nhân viên mới vào công ty
            if(inputNumber == 4) {
                System.out.println("1. Thêm nhân viên thông thường.");
                System.out.println("2. Thêm nhân viên là cấp quản lý (Có thêm chức vụ).");
                System.out.print("Bạn chọn: ");
                int addStaff = sc.nextInt();
                String inputId;
                String inputName;
                int inputAge;
                double inputCoefficientsSalary;
                String inputWorkingDay;
                int inputDaysOfLeave;
                String inputDepartment;
                double inputOvertime;
                int inputNum;

                //Thêm các thuộc chính chung của nhân viên thông thường và nhân viên cấp quản lý
                if(addStaff == 1 || addStaff == 2) {
                    System.out.print("Nhập mã nhân viên: ");
                    inputId = sc.next();
                    sc.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    inputName = sc.nextLine();
                    System.out.print("Nhập tuổi nhân viên: ");
                    inputAge = sc.nextInt();
                    System.out.print("Nhập hệ số lương của nhân viên: ");
                    inputCoefficientsSalary = sc.nextDouble();
                    System.out.print("Nhập ngày vào làm của nhân viên: ");
                    inputWorkingDay = sc.next();
                    System.out.print("Nhập số ngày nghỉ phép của nhân viên: ");
                    inputDaysOfLeave = sc.nextInt();
                    System.out.println("1. HC - Hành chính nhân sự");
                    System.out.println("2. IT - Công nghệ thông tin");
                    System.out.println("3. MKT - Marketing");
                    System.out.print("Bạn chọn bộ phận: ");
                    inputNum = sc.nextInt();
                    inputDepartment = departmentList.get(inputNum - 1).getDepartmentName();
                    departmentList.get(inputNum - 1).setCurrentEmployee();

                    //Thuộc tính khác khi thêm nhân viên thông thường
                    if(addStaff == 1){
                        System.out.print("Nhập số giờ làm thêm: ");
                        inputOvertime = sc.nextDouble();

                        //Khởi tạo và add nhân viên thông thường mới được thêm vào staffList
                        Employee employeeAdded = new Employee(inputId, inputName, inputAge, inputCoefficientsSalary, inputWorkingDay, inputDaysOfLeave, inputDepartment, inputOvertime);
                        staffList.add(employeeAdded);
                    }

                    //Thuộc tính khác khi thêm nhân viên cấp quản lý
                    if(addStaff == 2) {
                        System.out.println("Chức danh:");
                        System.out.println("1. Business Leader");
                        System.out.println("2. Project Leader");
                        System.out.println("3. Technical Leader");
                        System.out.print("Nhập chức danh: ");
                        inputNum = sc.nextInt();
                        String inputTitle = "";
                        if(inputNum == 1) {
                            inputTitle = "Business Leader";
                        }
                        if(inputNum == 2) {
                            inputTitle = "Project Leader";
                        }
                        if(inputNum == 3) {
                            inputTitle = "Technical Leader";
                        }

                        //Khởi tạo và add nhân viên cấp quản lý vào staffList
                        Manager managerAdded = new Manager(inputId, inputName, inputAge, inputCoefficientsSalary, inputWorkingDay, inputDaysOfLeave, inputDepartment, inputTitle);
                        staffList.add(managerAdded);
                    }
                }
            }

            //Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
            if(inputNumber == 5){
                System.out.println("1. Tìm nhân viên bằng tên:");
                System.out.println("2. Tìm nhân viên bằng mã nhân viên:");
                System.out.println("Bạn chọn: ");
                int inputSearch = sc.nextInt();
                sc.nextLine();

                //Tìm kiếm nhân viên theo tên
                if(inputSearch == 1) {
                    System.out.println("Nhập tên nhân viên cần tìm:");
                    String inputSearchName = sc.nextLine();
                    for (int i = 0; i < staffList.size(); i++) {
                        if (staffList.get(i).getName().toLowerCase().contains(inputSearchName.toLowerCase())){
                            System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                            staffList.get(i).displayInformation();
                        }
                    }
                }

                //Tìm kiếm nhân viên theo mã
                if(inputSearch == 2) {
                    System.out.println("Nhập mã nhân viên cần tìm:");
                    String inputSearchCode = sc.next();
                    for(int i = 0; i < staffList.size(); i++) {
                        if(staffList.get(i).getId().equalsIgnoreCase(inputSearchCode)) {
                            System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                            staffList.get(i).displayInformation();
                        }
                    }
                }
            }

            //Hiển thị bảng lương giảm dần của nhân viên toàn công ty
            if(inputNumber == 6){
                System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                Collections.sort(staffList, new Comparator<Staff>() {
                    @Override
                    public int compare(Staff o1, Staff o2) {
                        return (int) (((ICalculator) o2).calculateSalary() - ((ICalculator) o1).calculateSalary());
                    }
                });
                for (int i = 0; i < staffList.size(); i++){
                    staffList.get(i).displayInformation();
                }
            }

            //Hiển thị bảng lương tăng dần của nhân viên toàn công ty
            if(inputNumber == 7){
                System.out.printf("%-15s| %-25s| %-8s| %-12s| %-16s| %-18s| %-21s| %-27s| %-15s\n", "Mã nhân viên", "Tên nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Ngày nghỉ phép", "Bộ phận", "Số giờ làm thêm/Chức vụ", "Lương");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                Collections.sort(staffList, new Comparator<Staff>() {
                    @Override
                    public int compare(Staff o1, Staff o2) {
                        return (int) (((ICalculator) o1).calculateSalary() - ((ICalculator) o2).calculateSalary());
                    }
                });
                for (int i = 0; i < staffList.size(); i++){
                    staffList.get(i).displayInformation();
                }
            }
        }while (inputNumber != 0);
    }
}
