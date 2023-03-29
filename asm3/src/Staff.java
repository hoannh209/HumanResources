public abstract class Staff {
    private String id;
    private String name;
    private int age;
    private double coefficientsSalary;
    private String workingDay;
    private int daysOfLeave;
    private String workingParts;

    //Khởi tạo Staff
    public Staff(String id, String name, int age, double coefficientsSalary, String workingDay, int daysOfLeave, String workingParts){
        this.id = id;
        this.name = name;
        this.age = age;
        this.coefficientsSalary = coefficientsSalary;
        this.workingDay = workingDay;
        this.daysOfLeave = daysOfLeave;
        this.workingParts = workingParts;
    }

    //Setter và getter của Staff
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getCoefficientsSalary(){
        return coefficientsSalary;
    }
    public void setCoefficientsSalary(double coefficientsSalary){
        this.coefficientsSalary = coefficientsSalary;
    }
    public String getWorkingDay(){
        return workingDay;
    }
    public void setWorkingDay(String workingDay){
        this.workingDay = workingDay;
    }
    public int getDaysOfLeave(){
        return daysOfLeave;
    }
    public void setDaysOfLeave(int daysOfLeave){
        this.daysOfLeave = daysOfLeave;
    }
    public String getWorkingParts() {
        return workingParts;
    }
    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }


    public abstract void displayInformation();


}
