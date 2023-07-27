package com.employee.payroll;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id @GeneratedValue Long id;
    String name;
    String role;
    int phone;

    Employee(){}
    Employee(String name, String role){
        this.name=name;
        this.role=role;
    }
    public String getRole(){
        return role;
    }
    public String getName(){
        return name;
    }
    public Long getId(){
        return id;
    }
    public int getPhone(){
        return phone;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRole(String role){
        this.role=role;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee emp = (Employee) o;
        return Objects.equals(this.id, emp.id) && Objects.equals(this.name, emp.name)
                && Objects.equals(this.role, emp.role) && Objects.equals(this.phone, emp.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role, this.phone);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}

