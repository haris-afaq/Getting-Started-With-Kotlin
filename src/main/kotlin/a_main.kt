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


    // Inheritance

    val childHouse: ChildHouse =ChildHouse(types = "Modern")
    childHouse.displayInfo()


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



// Inheritence in Kotlin, es mae ham ne jis class ko inherit karna huta hai oske saath ham open keyword use karte hai


open class GrandFatherHouse{
    var rooms=1
    var material = "Mud"


    open fun displayInfo(){
        println("Grand Father House: Rooms: $rooms, Material: $material")
    }
}

// Yaha pe ham ne GrandFather Class ko extend karna hai tu jis tarah ham flutter mae extend keyword use karte hai yaha pe ham : use karte hai

open class Father: GrandFatherHouse(){

    init {
        rooms=3
        material="Concreate"
    }
    // yaha pe ham override use karengy

    override open fun displayInfo() {
        super.displayInfo()

        println("Father House: Rooms: $rooms, Material: $material")
    }
}

class ChildHouse(val types: String): Father(){
    var type: String= types
    init {
        rooms=5
    }
    override fun displayInfo() {
        super.displayInfo()
        println("Child House: Rooms: $rooms, Type: $type")
    }

}


