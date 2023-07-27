# springboot-demo

This is an employee payroll system created using Spring boot
maven repositories
#### Features
1. View all employees
2. View the details of a particular employee using the employee id
3. Add/Update/Delete details of employees

#### Dependencies
- Spring Data JPA
- Spring web
- H2 database


Interface employeerepository is used to inherit JpaRepository
to perform the CRUD operations into the database

#### How to run the program
1. Open /employee/[emp id] to open details of a particular employee
2. Use postman and send request to /employee with post method to add new employee
3. Use postman and send request to /employee/[emp id] with put method to replace employee details if it exits else add employee
4. Go to /h2-console to view the data stored in database



