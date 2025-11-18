package org.example

fun main() {
    //Creating object of the class
    val student: Student = Student()

    student.firstName = "Arish"
    student.lastName = "Khattak"
    student.age = 23
    student.gender = "Male"
    student.rollNumber = 17
    student.displayInfo()

}


//Class and Object of class
class Student{
 var firstName = ""
 var lastName = ""
 var age = 0
 var gender = ""
 var rollNumber=0

    fun displayInfo(){
        println("First Name: $firstName, Last Name: $lastName, Age: $age, Gender: $gender, Roll Number: $rollNumber")
    }
}