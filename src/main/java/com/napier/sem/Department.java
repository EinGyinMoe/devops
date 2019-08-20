package com.napier.sem;

public class Department {
    /**
     * Department number
     */
    public int dept_no;

    @Override
    public String toString() {
        return "Department{" +
                "dept_no=" + dept_no +
                ", dept_name='" + dept_name + '\'' +
                ", manager=" + manager +
                '}';
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    /**
     * Department name
     */
    public String dept_name;

    /**
     * Employee's manager
     */
    public Employee manager;
}