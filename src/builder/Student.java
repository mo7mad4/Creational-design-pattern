/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author AL_Qema
 */
public class Student {

    private String id;
    private String firstName;
    private String MiddleName;
    private String lastName;
    private String faculty;
    private String department;
    private String address;
    private String phoneNo;
    private float gpa;
    private boolean isGraguate;
    private boolean hasLoad;

    private Student(String id, String firstName, String MiddleName, String lastName, String faculty, String department, String address, String phoneNo, float gpa, boolean isGraguate, boolean hasLoad) {
        this.id = id;
        this.firstName = firstName;
        this.MiddleName = MiddleName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.department = department;
        this.address = address;
        this.phoneNo = phoneNo;
        this.gpa = gpa;
        this.isGraguate = isGraguate;
        this.hasLoad = hasLoad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean isIsGraguate() {
        return isGraguate;
    }

    public void setIsGraguate(boolean isGraguate) {
        this.isGraguate = isGraguate;
    }

    public boolean isHasLoad() {
        return hasLoad;
    }

    public void setHasLoad(boolean hasLoad) {
        this.hasLoad = hasLoad;
    }

    public static class Builder {   //inner class in boss class

        private String id;
        private String firstName;
        private String MiddleName;
        private String lastName;
        private String faculty;
        private String department;
        private String address;
        private String phoneNo;
        private float gpa;
        private boolean isGraguate;
        private boolean hasLoad;

        public Student build() {
            if (id == null) {
                throw new NullPointerException("You should set the id of the student");
            }
            if (firstName == null) {
                throw new NullPointerException("You should set the firstName of the student");

            }
            if (MiddleName == null) {
                throw new NullPointerException("You should set the MiddleName of the student");

            }
            if (lastName == null) {
                throw new NullPointerException("You should set the lastName of the student");

            }
            if (faculty == null) {
                throw new NullPointerException("You should set the faculty of the student");

            }
            if (department == null) {
                throw new NullPointerException("You should set the department of the student");

            }

            return new Student(id, firstName, MiddleName, lastName, faculty, department, address, phoneNo, gpa, isGraguate, hasLoad);

        }

        public void setId(String id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setMiddleName(String MiddleName) {
            this.MiddleName = MiddleName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }

        public void setIsGraguate(boolean isGraguate) {
            this.isGraguate = isGraguate;
        }

        public void setHasLoad(boolean hasLoad) {
            this.hasLoad = hasLoad;
        }

    }
}
