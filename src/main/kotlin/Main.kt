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


    // oBJECT OF the class with constructor

    val student1: Student1= Student1(
        firstName="Arish",
        lastName="Khattak",
    )
    student1.displayInfo()

    // Object of Constructor with init block

    val bike : Bike =Bike(model = "ninja h2r")


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


// Class and Object with Constructor

class Student1{
    var firstName = ""
    var lastName = ""
    constructor(firstName: String, lastName: String,){
        this.firstName = firstName
        this.lastName = lastName
    }
    fun  displayInfo(){
        println("First Name: $firstName, Last Name: $lastName")
    }
}

//init Block with Constructor, but eske lie hamme primary construtor ko use karna huta ju above use kia hai woh secondary contructor hai


class Bike(var model: String){

    // declare any global variable here

    var formattedBikeModel=""

    init{

        formattedBikeModel= model.uppercase()
        println(formattedBikeModel)
    }
}