package et.com.synctech.mobileappexam;

import com.google.gson.annotations.SerializedName;

public class EmployeeData {
    @SerializedName("id")
    private String id;
    @SerializedName("employee_name")
    private String employee_name;
    @SerializedName("profile_image")
    private String profile_image;
    @SerializedName("employee_age")
    private String employee_age;
    @SerializedName("employee_salary")
    private String employee_salary;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EmployeeData(String id, String employee_name, String profile_image, String employee_age, String employee_salary) {
        this.id = id;
        this.employee_name = employee_name;
        this.profile_image = profile_image;
        this.employee_age = employee_age;
        this.employee_salary = employee_salary;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(String employee_age) {
        this.employee_age = employee_age;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }
}
